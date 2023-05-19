package com.jk.wx.sdk.flux.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jk.sdk.commons.reactor.JsonConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class JacksonJsonConverter implements JsonConverter {

  private static final Logger log = LoggerFactory.getLogger(JacksonJsonConverter.class.getSimpleName());

  private final ObjectMapper mapper;

  public JacksonJsonConverter() {
    mapper = new ObjectMapper();
    // 对于空的对象转json的时候不抛出错误
    mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    // 允许属性名称没有引号
    mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    // 允许单引号
    mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
    // 设置输入时忽略在json字符串中存在但在java对象实际没有的属性
    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    // 设置输出时包含属性的风格
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
  }

  public ObjectMapper getMapper() {
    return mapper;
  }

  @Override
  public String toJson(Object obj) {
    if (obj == null) {
      return null;
    }
    String json = null;
    try {
      json = mapper.writeValueAsString(obj);
    } catch (JsonProcessingException e) {
      log.error("[{}] toJsonString error：{{}}", obj.getClass().getSimpleName(), e);
    }
    return json;
  }

  @Override
  public <T> T fromJson(String jstr, Class<T> clazz) {
    T t = null;
    try {
      t = mapper.readValue(jstr, clazz);
    } catch (Exception e) {
      log.error(" parse json [{}] to class [{}] error：{{}}", jstr, clazz.getSimpleName(), e);
    }
    return t;
  }

  private JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
    return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
  }

  @Override
  public <T> List<T> listFromJson(String jstr, Class<T> clazz) {
    List<T> result = null;
    try {
      result = mapper.readValue(jstr, getCollectionType(List.class, clazz));
    } catch (JsonProcessingException e) {
      String className = clazz.getSimpleName();
      log.error(" parse json [{}] to class [{}] error：{}", jstr, className, e);
    }
    return result;
  }

  @Override
  public <T> T convertValue(Object fromValue, Class<T> toValueType) {
    return mapper.convertValue(fromValue, toValueType);
  }

  @Override
  public <T> List<T> convertValueToList(Object fromValue, Class<T> toValueType) {
    return mapper.convertValue(fromValue, getCollectionType(List.class, toValueType));
  }
}
