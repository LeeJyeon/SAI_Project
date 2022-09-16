package com.studyassetinformation.sai.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {


    private String regiId;
    private LocalDateTime regiDate;
    private String regiIp;
    private String modiId;
    private LocalDateTime modiDate;
    private String modiIp;
}
