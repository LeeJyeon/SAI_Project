package com.studyassetinformation.sai.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "members")
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userNumber;

    private String regiId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date regiDate = new Date();

    private String regiIp;

    private String modiId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date mogiDate = new Date();
    
    private String modiIp;

    private String userId;

    private String userName;

    private String userBirth;

    private String userPhoneNumber;

    private String userEmail;


    public long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(long userNumber) {
        this.userNumber = userNumber;
    }

    public String getRegiId() {
        return regiId;
    }

    public void setRegiId(String regiId) {
        this.regiId = regiId;
    }

    public Date getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Date regiDate) {
        this.regiDate = regiDate;
    }

    public String getRegiIp() {
        return regiIp;
    }

    public void setRegiIp(String regiIp) {
        this.regiIp = regiIp;
    }

    public String getModiId() {
        return modiId;
    }

    public void setModiId(String modiId) {
        this.modiId = modiId;
    }

    public Date getMogiDate() {
        return mogiDate;
    }

    public void setMogiDate(Date mogiDate) {
        this.mogiDate = mogiDate;
    }

    public String getModiIp() {
        return modiIp;
    }

    public void setModiIp(String modiIp) {
        this.modiIp = modiIp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
