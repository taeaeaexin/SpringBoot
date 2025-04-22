package com.mycom.myapp.service;

import com.mycom.myapp.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceCrud {
    List<Student> listStudent();
    Optional<Student> detailStudent(int id);
}
