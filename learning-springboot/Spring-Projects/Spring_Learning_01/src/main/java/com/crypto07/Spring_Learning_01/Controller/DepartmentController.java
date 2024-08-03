package com.crypto07.Spring_Learning_01.Controller;

import com.crypto07.Spring_Learning_01.Entity.DepartmentEntity;
import com.crypto07.Spring_Learning_01.Error.DepartmentNotFoundException;
import com.crypto07.Spring_Learning_01.Model.DepartmentModel;
import com.crypto07.Spring_Learning_01.Service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public DepartmentEntity saveDepartment(@Valid @RequestBody DepartmentEntity departmentEntity){

        return departmentService.saveDepartment(departmentEntity);

    }

    @GetMapping("/department")
    public List<DepartmentEntity> fetchDepartments(){

        return departmentService.fetchDepartments();

    }

    @GetMapping("/department/{id}")
    public DepartmentEntity fetchDepartmentById(@PathVariable("id") int departmentId) throws DepartmentNotFoundException {

        return departmentService.fetchDepartmentById(departmentId);

    }

    @DeleteMapping("/department/{id}")
    public String DeleteDepartmentById(@PathVariable("id") int departmentId){

        return departmentService.deleteDepartmentById(departmentId);

    }

    @PutMapping("/department/{id}")
    public DepartmentModel updateDepartmentById(@PathVariable("id") int departmentId, @RequestBody DepartmentModel departmentModel){

        return departmentService.updateDepartmentById(departmentId, departmentModel);

    }

    @GetMapping("/department/name/{name}")
    public DepartmentEntity fetchDepartmentByName(@PathVariable("name") String departmentName){

        return departmentService.fetchDepartmentByName(departmentName);

    }

}
