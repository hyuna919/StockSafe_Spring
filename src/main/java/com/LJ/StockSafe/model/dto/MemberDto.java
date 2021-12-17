package com.LJ.StockSafe.model.dto;

import java.io.Serializable;

public class MemberDto implements Serializable{
	private String id;
	private String memberPw;
	private String memberName;
	private String memberEmailId;
	private String memberEmailDomain;
	private String memberRegdate;
	
	
	
	public MemberDto() {
		super();
	}
	public MemberDto(String id, String memberPw, String memberName, String memberEmailId, String memberEmailDomain,
			String memberRegdate) {
		super();
		this.id = id;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmailId = memberEmailId;
		this.memberEmailDomain = memberEmailDomain;
		this.memberRegdate = memberRegdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmailId() {
		return memberEmailId;
	}
	public void setMemberEmailId(String memberEmailId) {
		this.memberEmailId = memberEmailId;
	}
	public String getMemberEmailDomain() {
		return memberEmailDomain;
	}
	public void setMemberEmailDomain(String memberEmailDomain) {
		this.memberEmailDomain = memberEmailDomain;
	}
	public String getMemberRegdate() {
		return memberRegdate;
	}
	public void setMemberRegdate(String memberRegdate) {
		this.memberRegdate = memberRegdate;
	}
	
}
