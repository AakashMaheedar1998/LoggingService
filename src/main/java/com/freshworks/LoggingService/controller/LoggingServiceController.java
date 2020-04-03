package com.freshworks.LoggingService.controller;

import com.freshworks.LoggingService.model.LoggingInfo;
import com.freshworks.LoggingService.service.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/services")
public class LoggingServiceController {

    Logger log = LoggerFactory.getLogger(LoggingServiceController.class);

    @Autowired
    private LoggingService loggingService;

    @RequestMapping("/logs")
    public String addLogInfo(@RequestBody LoggingInfo loggingServiceEntity) {
        return loggingService.getLogInfo(loggingServiceEntity);
    }
}
