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
    @Column(name="user_num")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userNumber;

    @Column(name="regi_id")
    private String regiId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="regi_dt")
    private Date regiDate = new Date();

    @Column(name="regi_ip")
    private String regiIp;

    @Column(name="modi_id")
    private String modiId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modi_dt")
    private Date modiDate = new Date();

    @Column(name="modi_ip")
    private String modiIp;


    private String userId;

    private String userName;

    private String userBirth;

    private String userPhoneNum;

    private String userEmail;


}
