package com.studyassetinformation.sai.service;

import com.studyassetinformation.sai.domain.Members;
import com.studyassetinformation.sai.repository.MemberHistoryRepository;
import com.studyassetinformation.sai.repository.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.net.UnknownHostException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Commit
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;
    @Autowired MemberHistoryRepository memberHistoryRepository;

    @BeforeEach
    public void beforeEach(){
        memberService = new MemberService(memberRepository, memberHistoryRepository);
    }

    @Test
    void 회원가입() throws CloneNotSupportedException, UnknownHostException {
        //given
        Members member = new Members();
        member.setUserId("Home");
        member.setUserBirth("19920609");
        member.setUserEmail("jihyun6969@nate.com");
        member.setUserName("이지현");
        member.setUserPhoneNum("0226947056");

        //when
        String savedUserId = memberService.clientJoin(member);

        //then
        assertThat(member.getUserId()).isEqualTo(savedUserId);


    }


}