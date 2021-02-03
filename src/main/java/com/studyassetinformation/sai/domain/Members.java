package com.studyassetinformation.sai.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "members")
@Setter
@Getter
@NoArgsConstructor
public class Members {

    @Id
    private String userId;

    private String regiId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date regiDate = new Date();

    private String regiIp;

    private String modiId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modiDate = new Date();

    private String modiIp;

    private String userName;

    private String userBirth;

    private String userPhoneNum;

    private String userEmail;

}
