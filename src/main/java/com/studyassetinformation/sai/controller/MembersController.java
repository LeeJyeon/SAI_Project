package com.studyassetinformation.sai.controller;

import com.studyassetinformation.sai.ErrorLog.ErrorWriter;
import com.studyassetinformation.sai.domain.Members;
import com.studyassetinformation.sai.service.MemberService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/members")
public class MembersController {

    private final MemberService memberService;

    @Autowired
    ErrorWriter ew;

    @Autowired
    public MembersController(MemberService memberService) {
        this.memberService = memberService;
    }

    @SneakyThrows
    @PostMapping("/join")
    public ResponseEntity<String> clientJoin(@RequestHeader(value = "userId") String userId,
                                           @RequestBody Members members) {
        try{
            memberService.clientJoin( members );
        }catch ( Exception e ) {
            log.error(ew.getMessage(e));
            return new ResponseEntity<String>(ew.getMessage(e), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<String>("000", HttpStatus.CREATED);
    }

}
