package com.LJ.StockSafe.model.dto;

import lombok.Data;


public class UserinfoDto {
	private String userinfoId;
	private String userinfoPw;
	private String userinfoName;
	private String userinfoEmailId;
	private String userinfoEmailDomain;
	private String userinfoRegdate;
	
	public UserinfoDto(String id, String userinfoPw, String userinfoName, String userinfoEmailId,
			String userinfoEmailDomain, String userinfoRegdate) {
		super();
		this.id = id;
		this.userinfoPw = userinfoPw;
		this.userinfoName = userinfoName;
		this.userinfoEmailId = userinfoEmailId;
		this.userinfoEmailDomain = userinfoEmailDomain;
		this.userinfoRegdate = userinfoRegdate;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserinfoPw() {
		return userinfoPw;
	}
	public void setUserinfoPw(String userinfoPw) {
		this.userinfoPw = userinfoPw;
	}
	public String getUserinfoName() {
		return userinfoName;
	}
	public void setUserinfoName(String userinfoName) {
		this.userinfoName = userinfoName;
	}
	public String getUserinfoEmailId() {
		return userinfoEmailId;
	}
	public void setUserinfoEmailId(String userinfoEmailId) {
		this.userinfoEmailId = userinfoEmailId;
	}
	public String getUserinfoEmailDomain() {
		return userinfoEmailDomain;
	}
	public void setUserinfoEmailDomain(String userinfoEmailDomain) {
		this.userinfoEmailDomain = userinfoEmailDomain;
	}
	public String getUserinfoRegdate() {
		return userinfoRegdate;
	}
	public void setUserinfoRegdate(String userinfoRegdate) {
		this.userinfoRegdate = userinfoRegdate;
	}
	

	
	
}
