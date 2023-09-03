package com.jobsearch.joblisting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jobpost {
    @Id
    private String id;
    private String desc;
    private Integer exp;
    private String profile;
    private List<String> techs;
}
