package com.abalog.service.service;


import com.abalog.service.domain.Program;
import com.abalog.service.repository.ApiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ApiService {

    @Autowired
    private ApiRepository apiRepository;

    public List<Program> getAllPrograms(){
        return apiRepository.getAllPrograms();
    }

}
