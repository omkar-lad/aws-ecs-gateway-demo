package com.omkar.awsecsgateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class AwsEcsGatewayController {

    private static final Logger logger = LoggerFactory.getLogger(AwsEcsGatewayController.class);

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/getAppName")
    public ResponseEntity<String> getApplicationName() {
        String str = "Hi.. This is " + appName + " demo project";
        logger.info("Request received at {}", LocalDateTime.now());
        return new ResponseEntity<>(str, HttpStatus.OK);
    }
}
