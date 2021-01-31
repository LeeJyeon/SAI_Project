package com.studyassetinformation.sai.repository;

import com.studyassetinformation.sai.domain.Members;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MemberJpaRepository implements MemberRepository {

    @Override
    public Members save(Members member) {
        return null;
    }

    @Override
    public Members changePhoneNumber(Long userNumber, String userPhoneNumber) {
        return null;
    }

    @Override
    public Members changeEmail(Long userNumber, String userEmail) {
        return null;
    }

    @Override
    public Optional<Members> findByUserNumber(Long userNumber) {
        return Optional.empty();
    }

    @Override
    public Optional<Members> findByUserId(String userId) {
        return Optional.empty();
    }

    @Override
    public List<Members> findAll() {
        return null;
    }
}
