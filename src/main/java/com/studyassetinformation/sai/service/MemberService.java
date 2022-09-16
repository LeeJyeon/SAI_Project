package com.studyassetinformation.sai.service;

import com.studyassetinformation.sai.domain.Members;
import com.studyassetinformation.sai.domain.MembersHistory;
import com.studyassetinformation.sai.repository.MemberHistoryRepository;
import com.studyassetinformation.sai.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

@Service
public class MemberService {

    private final MemberRepository memberRepository;


    private final MemberHistoryRepository memberHistoryRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository, MemberHistoryRepository memberHistoryRepository) {
        this.memberRepository = memberRepository;
        this.memberHistoryRepository = memberHistoryRepository;
    }


    /*회원가입*/
    public String clientJoin(Members members) throws CloneNotSupportedException, UnknownHostException {
        /* 중복체크 */
        dupCheck(members);

        members.setRegiId(members.getUserId());
        members.setRegiDate(LocalDateTime.now());
        members.setRegiIp(Inet4Address.getLocalHost().getHostAddress());
        members.setModiId(members.getUserId());
        members.setModiDate(LocalDateTime.now());
        members.setModiIp(Inet4Address.getLocalHost().getHostAddress());

        memberRepository.save(members);
        memberHistoryRepository.save(saveMemberHistory(members, "C"));
        return members.getUserId();
    }

    private void dupCheck(Members members) {

        memberRepository.findByUserId(members.getUserId())
                .ifPresent(tmp -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    private MembersHistory saveMemberHistory(Members members, String crudCode) {

        MembersHistory membersHistory = new MembersHistory();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar tmp = Calendar.getInstance();
        String strToday = sdf.format(tmp.getTime());
        membersHistory.setProcessYmd(strToday);
        membersHistory.setUserId(members.getUserId());
        membersHistory.setCrud_code(crudCode);
        membersHistory.setUserName(members.getUserName());
        membersHistory.setUserEmail(members.getUserEmail());
        membersHistory.setUserBirth(members.getUserBirth());

        membersHistory.setProcessSeq(
                memberHistoryRepository.findMemberHistorySeq(strToday, members.getUserId())
        );

        membersHistory.setRegiId(members.getRegiId());
        membersHistory.setRegiDate(members.getRegiDate());
        membersHistory.setRegiIp(members.getRegiIp());
        membersHistory.setModiId(members.getModiId());
        membersHistory.setModiDate(members.getModiDate());
        membersHistory.setModiIp(members.getModiIp());

        return membersHistory;
    }

}

