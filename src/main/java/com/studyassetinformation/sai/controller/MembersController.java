package com.studyassetinformation.sai.controller;

import com.studyassetinformation.sai.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MembersController {

    private final MemberService memberService;

    @Autowired
    public MembersController(MemberService memberService) {
        this.memberService = memberService;
    }
}
