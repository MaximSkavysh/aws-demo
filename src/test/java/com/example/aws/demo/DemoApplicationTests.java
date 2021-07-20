package com.example.aws.demo;

import com.example.aws.demo.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    void health() {
        assertEquals("PONG", dataController.healthCheck());
    }

}
