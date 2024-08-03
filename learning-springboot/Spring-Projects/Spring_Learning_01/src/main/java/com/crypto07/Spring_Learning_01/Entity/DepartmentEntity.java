package com.crypto07.Spring_Learning_01.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(
        name = "department_entity"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    @NotBlank(message = "Enter the department name")
    @Length(max = 5, min = 1)
    private String departmentName;
    @NotBlank(message = "Enter the department address")
    private String departmentAddress;
    @NotBlank(message = "Enter the department code")
    private String departmentCode;

}
