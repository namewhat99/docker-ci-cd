package com.example.docker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuspectResourcePostDto {

    private String suspectName;
    private Integer suspectAge;
    private String suspectGender;
    private String suspectOccupation;
    private String suspectSpeciality;
    private String suspectTrait;
    private String suspectImage;
    private String evidenceName;
    private String evidenceInfo;
    private String evidenceImage;
}
