package com.studyassetinformation.sai.repository;

import com.studyassetinformation.sai.domain.MembersHistory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MemberHistoryRepositoryTest {

    @Autowired
    MemberHistoryRepository memberHistoryRepository;

    @Test
    public void 채번(){
        int result;
        result = memberHistoryRepository.findMemberHistorySeq( "20210207" , "CafeKing");
        System.out.println(result);
    }
}