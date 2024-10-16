package com.atos.lms.business.company.model;


import com.atos.lms.common.model.GeneralModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO implements GeneralModel {

    private List<String> corpBizList;

    private String code; // 상태 정보 코드
    private String name; // 상태 정보 명칭

    private String id;          // 회원 식별자 (atos_member.ID)
    private String status;      // 회원 상태 정보 (atos_member.STATUS)

    private String memberId;    // 회원 ID (atos_member.ID 참조)
    private String bizRegNo;    // 사업자 등록 번호 (atos_company.BIZ_REG_NO 참조)

    private String roleCode;    // 역할 코드 (atos_role.ROLE_CODE)
    private String roleName;    // 역할 이름 (atos_role.ROLE_NAME)

}
