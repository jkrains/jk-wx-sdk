package com.jk.wx.sdk.commons.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * xml 的工具类，用户将对象 与xml 字符串互转。
 */
public class XmlUtils {

  /**
   * xml mapper.
   */
  public static XmlMapper xmlMapper;

  static {
    xmlMapper = XmlMapper.builder()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
        .serializationInclusion(JsonInclude.Include.NON_NULL)
        .propertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE)
        .enable(MapperFeature.USE_STD_BEAN_NAMING)
        .build();
  }

  /**
   * 对象转换成xml。
   * @param obj
   * @return
   * @throws JsonProcessingException
   */
  public static String toXml(Object obj) throws JsonProcessingException {
    return xmlMapper.writeValueAsString(obj);
  }

  /**
   * xml转换成对象.
   * @param xml
   * @param classT
   * @param <T>
   * @return
   * @throws JsonProcessingException
   */
  public static <T> T fromXml(String xml, Class<T> classT) throws JsonProcessingException {
    return xmlMapper.readValue(xml, classT);
  }
}
