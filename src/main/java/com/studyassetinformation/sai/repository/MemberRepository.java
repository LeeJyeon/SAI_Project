package com.studyassetinformation.sai.repository;

import com.studyassetinformation.sai.domain.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Members, Long> {

//    Members save(Members members);
//    Optional<Members> findByUserId(String userId);

//    Members save(Members member);
//
//    Members changePhoneNumber(Long userNumber, String userPhoneNumber);
//
//    Members changeEmail(Long userNumber, String userEmail);
//
//    Optional<Members> findByUserNumber(Long userNumber);
//
//    Optional<Members> findByUserId(String userId);
//
//    List<Members> findAll();

}
