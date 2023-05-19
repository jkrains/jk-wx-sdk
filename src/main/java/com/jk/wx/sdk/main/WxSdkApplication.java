package com.jk.wx.sdk.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jk.wx.sdk.commons.util.XmlUtils;
import com.jk.wx.sdk.main.xml.PersonEvent;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WxSdkApplication {

    private static boolean isSuccess(String jsonStr) {
        return jsonStr.contains("\"errcode\":0") || jsonStr.contains("\"errcode\": 0");
    }

    public static void main(String[] args) throws JsonProcessingException {
//        JacksonJsonConverter converter = new JacksonJsonConverter();
//
//        Map<String, Object> body = new HashMap<>();
//        body.put("errcode", 0);
//        String s = converter.toJson(body);
//        System.out.println(isSuccess(s));
//        body.put("errcode", 1);
//        s = converter.toJson(body);
//        System.out.println(isSuccess(s));

        PersonEvent personEvent = new PersonEvent();
        personEvent
            .setNickname("nick01")
            .setFromUserName("zhangsan")
            .setToUserName("lisi")
            .setCreateTime((int)(System.currentTimeMillis() / 1000))
            .setMsgType("createUser");
        String xml = XmlUtils.toXml(personEvent);
        System.out.println(xml);
        PersonEvent personEvent1 = XmlUtils.fromXml(xml, PersonEvent.class);
        System.out.println(personEvent1);
//        SpringApplication.run(WxSdkApplication.class, args);
    }

}
