package com.crypto07.Spring_Learning_01.Service;

import com.crypto07.Spring_Learning_01.Entity.DepartmentEntity;
import com.crypto07.Spring_Learning_01.Error.DepartmentNotFoundException;
import com.crypto07.Spring_Learning_01.Model.DepartmentModel;
import com.crypto07.Spring_Learning_01.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {

        return departmentRepository.save(departmentEntity);

    }

    @Override
    public List<DepartmentEntity> fetchDepartments() {

        return departmentRepository.findAll();

    }

    @Override
    public DepartmentEntity fetchDepartmentById(int departmentId) throws DepartmentNotFoundException {

        Optional<DepartmentEntity> department =  departmentRepository.findById(departmentId);

        if ( !department.isPresent() ) {

            throw new DepartmentNotFoundException("Department Not Availalble");

        }

        return department.get();

    }

    @Override
    public String deleteDepartmentById(int departmentId) {

        departmentRepository.deleteById(departmentId);;

        return "Department Deleted Successfully";

    }

    @Override
    public DepartmentModel updateDepartmentById(int departmentId, DepartmentModel departmentModel) {

        DepartmentEntity departmentEntity = departmentRepository.findById(departmentId).get();

        if ( departmentModel.getDepartmentName() != null ){

            departmentEntity.setDepartmentName(departmentModel.getDepartmentName());

        }

        if ( departmentModel.getDepartmentName() != null ){

            departmentEntity.setDepartmentAddress(departmentModel.getDepartmentAddress());

        }

        if ( departmentModel.getDepartmentCode() != null ){

            departmentEntity.setDepartmentCode(departmentModel.getDepartmentCode());

        }

        departmentRepository.save(departmentEntity);

        return departmentModel;

    }

    @Override
    public DepartmentEntity fetchDepartmentByName(String departmentName) {

        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);

    }

}
