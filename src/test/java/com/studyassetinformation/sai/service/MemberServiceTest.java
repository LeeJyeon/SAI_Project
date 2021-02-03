package com.studyassetinformation.sai.service;

import com.studyassetinformation.sai.domain.Members;
import com.studyassetinformation.sai.repository.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;


    @BeforeEach
    public void beforeEach(){
        memberService = new MemberService(memberRepository);
    }

    @Test
    void 회원가입(){
        //given
        Members member = new Members();
        member.setUserId("TestUserEdiya!!");

        //when
        String savedUserId = memberService.clientJoin(member);

        //then
        assertThat(member.getUserId()).isEqualTo(savedUserId);


    }


}