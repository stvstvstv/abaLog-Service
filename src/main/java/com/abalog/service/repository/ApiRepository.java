package com.abalog.service.repository;

import com.abalog.service.domain.Program;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
@Slf4j
public class ApiRepository {

    private String repoProgramsURL;
    private RestTemplate restTemplate;

    public ApiRepository(@Value("${repository.url.basepath.programs}") final String repoProgramsURL, final RestTemplate restTemplate) {
        this.repoProgramsURL = repoProgramsURL;
        this.restTemplate = restTemplate;
    }

    public List<Program> getAllPrograms() {
        return restTemplate.exchange(repoProgramsURL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Program>>() {
                }).getBody();
    }
}
