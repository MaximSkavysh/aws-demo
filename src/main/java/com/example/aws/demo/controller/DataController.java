package com.example.aws.demo.controller;

import com.example.aws.demo.dto.NationDto;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api")
public class DataController {

    @GetMapping("/ping")
    public String healthCheck() {
        return "PONG";
    }

    @GetMapping("/nations")
    public List<NationDto> getRandomNations() {
        var faker = new Faker(new Locale("en-US"));
        return IntStream.range(0, 10)
                .mapToObj(i -> faker.nation())
                .map(nation -> new NationDto(nation.nationality(), nation.capitalCity(), nation.flag(), nation.language()))
                .collect(Collectors.toList());
    }
}
