package com.studyassetinformation.sai.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Getter
@Setter
public class MemberHistoryPK implements Serializable {

    private String processYmd;
    private Integer processSeq;
    private String userId;

}
