package com.studyassetinformation.sai.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "members_history")
@Setter
@Getter
@NoArgsConstructor
@IdClass(MemberHistoryPK.class)
public class MembersHistory extends BaseEntity {

    @Id
    private String processYmd;
    @Id
    private Integer processSeq;
    @Id
    private String userId;

    private String crud_code;

    private String userName;

    private String userBirth;

    private String userPhoneNum;

    private String userEmail;


}
