package ru.otr.openshifttest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest")
public class TestController {

    @GetMapping(value = "/test", produces = "application/json")
    public String responseTest() {
        return "Test success";
    }
}
