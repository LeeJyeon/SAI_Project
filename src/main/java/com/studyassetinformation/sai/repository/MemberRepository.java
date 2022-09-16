package com.studyassetinformation.sai.repository;

import com.studyassetinformation.sai.domain.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Members, Long > {

    Optional<Members> findByUserId(String userId);

}
