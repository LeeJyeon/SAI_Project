package com.studyassetinformation.sai.service;

import com.studyassetinformation.sai.domain.Members;
import com.studyassetinformation.sai.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /*회원가입*/
    public String clientJoin(Members members) {
        /* 중복체크 */
        dupCheck(members);
        memberRepository.save(members);
        return members.getUserId();
    }

    private void dupCheck(Members members) {

        memberRepository.findByUserId(members.getUserId())
                .ifPresent(tmp -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });


    }

}

