package com.jk.wx.sdk.open.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * wx personal info result.
 */
public class OpenUserInfoResult {

    /**
     *
     * 普通用户的标识，对当前开发者帐号唯一， 但是对于不同的媒介，
     */
    private String openid;

    /**
     * 普通用户昵称
     */
    private String nickname;

    /**
     * 普通用户性别，1为男性，2为女性
     */
    private int sex;

    /**
     * 普通用户个人资料填写的省份
     */
    private String province;

    /**
     * 普通用户个人资料填写的城市
     */
    private String city;

    /**
     * 国家，如中国为CN
     */
    private String country;

    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    @JsonProperty("headimgurl")
    private String headImgUrl;

    /**
     * 用户特权信息，json数组，如微信沃卡用户为（chinaunicom）
     */
    @JsonProperty("privilege")
    private List<String> privileges;

    /**
     * 用户统一标识。针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
     */
    private String unionid;

    public OpenUserInfoResult() {
    }

    //--------------------------------getter-----------------------------------

    public String getOpenid() {
        return openid;
    }

    public String getNickname() {
        return nickname;
    }

    public int getSex() {
        return sex;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public List<String> getPrivileges() {
        return privileges;
    }

    public String getUnionid() {
        return unionid;
    }

    //--------------------------------setter-----------------------------------


    public OpenUserInfoResult setOpenid(String openid) {
        this.openid = openid;
        return this;
    }

    public OpenUserInfoResult setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public OpenUserInfoResult setSex(int sex) {
        this.sex = sex;
        return this;
    }

    public OpenUserInfoResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public OpenUserInfoResult setCity(String city) {
        this.city = city;
        return this;
    }

    public OpenUserInfoResult setCountry(String country) {
        this.country = country;
        return this;
    }

    public OpenUserInfoResult setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
        return this;
    }

    public OpenUserInfoResult setPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public OpenUserInfoResult setUnionid(String unionid) {
        this.unionid = unionid;
        return this;
    }
}
