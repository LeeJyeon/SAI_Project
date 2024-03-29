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
public class Members extends BaseEntity {

    @Id
    private String userId;

    private String userName;

    private String userBirth;

    private String userPhoneNum;

    private String userEmail;

}
