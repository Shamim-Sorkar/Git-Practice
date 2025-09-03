package com.shamim.spring_data_rest_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Scope("prototype")
public class JobPost {
    @Id
    private int postId;
    private String postDesc;
    private String postProfile;
    private List<String> postTechStack;
    private int reqExperience;
}
