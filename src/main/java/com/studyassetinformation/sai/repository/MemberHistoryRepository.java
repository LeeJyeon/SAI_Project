package com.studyassetinformation.sai.repository;

import com.studyassetinformation.sai.domain.Members;
import com.studyassetinformation.sai.domain.MembersHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public interface MemberHistoryRepository extends JpaRepository<MembersHistory ,Long> {

    @Query(value = "select coalesce(max(process_seq) , 0 ) + 1 from members_history where process_ymd = ?1 and user_id = ?2"
            , nativeQuery = true)
    Integer findMemberHistorySeq(String process_ymd , String user_id);

}
