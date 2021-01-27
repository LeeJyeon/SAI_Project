package com.studyassetinformation.sai.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private long userNumber;
    private String userId;
    private String userPassword;

    private String userName;
    private String userBirth;
    private String userPhoneNumber;
    private String userEmail;

}
