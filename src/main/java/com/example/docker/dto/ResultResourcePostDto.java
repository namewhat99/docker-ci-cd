package com.example.docker.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultResourcePostDto {

    private String criminal;
    private String criminalSaying;
    private String caseBackground;
    private String resultContent1;
    private String resultContent2;
    private String resultImage1;
    private String resultImage2;
    private String allStory;
}
