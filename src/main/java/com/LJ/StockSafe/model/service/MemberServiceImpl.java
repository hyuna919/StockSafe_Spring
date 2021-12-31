package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.MemberDto;
import com.LJ.StockSafe.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	JavaMailSender javamailSender;

	@Override
	public boolean createMember(MemberDto memberdto) {
		// TODO Auto-generated method stub
		if(memberMapper.createMember(memberdto)==1) return true;
		return false;
	}

	@Override
	public List<MemberDto> readMemberAll(String key, String word) {
		return memberMapper.readMemberAll(key, word);
	}

	@Override
	public MemberDto readMember(String id) {
		// TODO Auto-generated method stub
		return memberMapper.readMember(id);
	}

	@Override
	public String loginMember(MemberDto memberdto) {
		// TODO Auto-generated method stub
		return memberMapper.loginMember(memberdto);
	}

	@Override
	public boolean updateMember(MemberDto memberdto) {
		// TODO Auto-generated method stub
		if(memberMapper.updateMember(memberdto) != 0) return true;
		return false;
	}

	@Override
	public boolean deleteMember(String id) {
		// TODO Auto-generated method stub
		if(memberMapper.deleteMember(id) !=0 ) return true;
		return false;
	}
	
	@Override
	public boolean findMemberPw(MemberDto memberdto) {
		
		MemberDto temp = memberMapper.readMember(memberdto.getId());
		temp.setMemberPw("111");
		memberMapper.updateMember(temp);
		
	    SimpleMailMessage message = new SimpleMailMessage();
	    message.setSubject("[공지] 비밀번호");
	    message.setText("임시 비밀번호는 . 111입니다.");
	    message.setFrom("kyung_ho@naver.com");
	    message.setTo(temp.getMemberEmailId() +"@" + temp.getMemberEmailDomain());
	    try {
	    	javamailSender.send(message);
	    	return true;
	    } catch (MailException e) {
	      e.printStackTrace();
	    }
	    
	    return false;
	  }


}
