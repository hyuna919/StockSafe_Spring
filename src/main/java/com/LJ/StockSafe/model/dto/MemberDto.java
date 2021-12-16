package com.LJ.StockSafe.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

//@AllArgsConstructor
//@Data
public class MemberDto implements Serializable{
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmailId;
	private String memberEmailDomain;
	private String memberRegdate;
	
	
	public MemberDto(String memberId, String memberPw, String memberName, String memberEmailId,
			String memberEmailDomain, String memberRegdate) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmailId = memberEmailId;
		this.memberEmailDomain = memberEmailDomain;
		this.memberRegdate = memberRegdate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
