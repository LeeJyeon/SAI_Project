package com.studyassetinformation.sai.repository;

import com.studyassetinformation.sai.domain.Members;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Members save(Members member);

    Members changePhoneNumber(Long userNumber, String userPhoneNumber);

    Members changeEmail(Long userNumber, String userEmail);

    Optional<Members> findByUserNumber(Long userNumber);

    Optional<Members> findByUserId(String userId);

    List<Members> findAll();

}
