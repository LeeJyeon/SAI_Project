package com.studyassetinformation.sai.service;

import com.studyassetinformation.sai.domain.Members;
import com.studyassetinformation.sai.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepositoryInterface;

    public Long join(Members members) {
        memberRepositoryInterface.save(members);
        return members.getUserNumber();
    }

}
