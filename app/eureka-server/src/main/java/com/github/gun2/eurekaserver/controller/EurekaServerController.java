package com.github.gun2.eurekaserver.controller;

import com.github.gun2.eurekaserver.service.EurekaServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/eureka-server")
public class EurekaServerController {

    private final EurekaServerService eurekaServerService;

    @GetMapping("/applications")
    public ResponseEntity getApplications(){
        return ResponseEntity.ok(eurekaServerService.getApplications());
    }
}
