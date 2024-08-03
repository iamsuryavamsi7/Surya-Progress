package com.crypto07.Spring_Learning_01.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Mutability;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentModel {

    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
