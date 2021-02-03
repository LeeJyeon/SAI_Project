package com.studyassetinformation.sai.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.studyassetinformation.sai.domain.Members;
import org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 가입() {
        Members members = new Members();

        members.setRegiId("jihyun6969");
        members.setRegiDate(new Date());
        members.setRegiIp("270.");
        members.setModiId("jihyun6969");
        members.setModiDate(new Date());
        members.setModiIp("270.");

        members.setUserId("jihyun6969");
        members.setUserName("이지현");
        members.setUserBirth("19920609");
        members.setUserPhoneNum("01033527056");
        members.setUserEmail("jindojihyun@naver.com");

        List<Members> beforeResult = memberRepository.findAll();

        memberRepository.save(members);

        List<Members> afterResult = memberRepository.findAll();

        assertThat(beforeResult.size()).isEqualTo(afterResult.size() - 1);
    }

    @Test
    public void 확인() {
        Optional<Members> result = memberRepository.findByUserId("jihyun6969");

        System.out.println( result.get().getUserPhoneNum() );

    }


}