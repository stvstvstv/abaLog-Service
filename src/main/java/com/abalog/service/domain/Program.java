package com.abalog.service.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Program {

    private String programid;
    private Boolean mastered;
    private String name;

}
