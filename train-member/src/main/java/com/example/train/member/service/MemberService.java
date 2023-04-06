package com.example.train.member.service;

import com.example.train.member.domain.Member;
import com.example.train.member.mapper.MemberMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author luf
 * @date 2023/03/17 10:56
 **/
@Service
public class MemberService {

    @Resource
    private MemberMapper memberMapper;
    public int count() {
        return (int) memberMapper.countByExample(null);
    }

    public int register(String mobile) {
        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        memberMapper.insert(member);
        return Math.toIntExact(member.getId());
    }


}
