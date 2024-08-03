package com.crypto07.Spring_Learning_01.Repository;

import com.crypto07.Spring_Learning_01.Entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {

    public DepartmentEntity findByDepartmentNameIgnoreCase(String departmentName);

}
