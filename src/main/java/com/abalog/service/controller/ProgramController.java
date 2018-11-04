package com.abalog.service.controller;


import com.abalog.service.domain.Program;
import com.abalog.service.service.ApiService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/programs")
@Api(tags = "Service data (programs)")
@Slf4j
public class ProgramController {

    @Autowired
    ApiService apiService;

    @GetMapping("/")
    public List<Program> listAllPrograms() {
        return apiService.getAllPrograms();
    }
}
