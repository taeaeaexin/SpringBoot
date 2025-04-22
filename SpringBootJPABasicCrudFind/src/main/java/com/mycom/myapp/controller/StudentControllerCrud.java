package com.mycom.myapp.controller;

import com.mycom.myapp.service.StudentServiceCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentControllerCrud {
    private final StudentServiceCrud studentServiceCrud;

}
