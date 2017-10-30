/*      						
 * Copyright 2012 LPF  All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年10月29日	| LPF 	| 	create the file                       
 */

package com.thinker.cal.domain;

import java.util.List;

/**
 * 
 * 微信鉴权获取用户信息
 * 
 * <p>
 * 类详细描述
 * </p>
 * 
 * @author LPF
 * 
 */

public class AuthUserInfo {
	// 用户标识
	private String openid;
	// 用户昵称
	private String nickname;
	// 性别(1是男性,2是女性,0是未知)
	private String sex;
	// 国家
	private String country;
	// 省份
	private String province;
	// 城市
	private String city;
	// 用户头像链接
	private String headimgurl;
	// 用户特权信息
	private List<String> privilege;
	// 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
	private String unionid;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public List<String> getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List<String> privilege) {
		this.privilege = privilege;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	@Override
	public String toString() {
		return "AuthUserInfo [openid=" + openid + ", nickname=" + nickname
				+ ", sex=" + sex + ", country=" + country + ", province="
				+ province + ", city=" + city + ", headimgurl=" + headimgurl
				+ ", privilege=" + privilege + ", unionid=" + unionid + "]";
	}
}
