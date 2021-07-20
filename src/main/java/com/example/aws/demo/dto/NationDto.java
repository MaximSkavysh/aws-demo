package com.example.aws.demo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NationDto {
    private String nationality;
    private String city;
    private String flag;
    private String language;

    public NationDto(String nationality, String capitalCity, String flag, String language) {
        this.nationality = nationality;
        this.city = capitalCity;
        this.flag = flag;
        this.language = language;
    }
}
