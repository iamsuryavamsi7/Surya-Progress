package com.crypto07.Spring_Learning_01.Service;

import com.crypto07.Spring_Learning_01.Entity.DepartmentEntity;
import com.crypto07.Spring_Learning_01.Error.DepartmentNotFoundException;
import com.crypto07.Spring_Learning_01.Model.DepartmentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    DepartmentEntity saveDepartment(DepartmentEntity departmentEntity);

    List<DepartmentEntity> fetchDepartments();

    DepartmentEntity fetchDepartmentById(int departmentId) throws DepartmentNotFoundException;

    String deleteDepartmentById(int departmentId);

    DepartmentModel updateDepartmentById(int departmentId, DepartmentModel departmentModel);

    DepartmentEntity fetchDepartmentByName(String departmentName);
}
