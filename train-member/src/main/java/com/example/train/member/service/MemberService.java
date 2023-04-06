package com.example.train.member.service;

import cn.hutool.core.collection.CollUtil;
import com.example.train.member.domain.Member;
import com.example.train.member.domain.MemberExample;
import com.example.train.member.mapper.MemberMapper;
import com.example.train.member.req.MemberRegisterReq;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public long register(MemberRegisterReq req) {
        String mobile = req.getMobile();
        // 查询是否已经注册
        MemberExample example = new MemberExample();
        example.createCriteria().andMobileEqualTo(mobile);
        // 查询, 最多有一条数据
        List<Member> list = memberMapper.selectByExample(example);
        if (CollUtil.isNotEmpty(list)) {
            throw new RuntimeException("手机号已经注册");
        }

        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        memberMapper.insert(member);
        return member.getId();
    }

}
