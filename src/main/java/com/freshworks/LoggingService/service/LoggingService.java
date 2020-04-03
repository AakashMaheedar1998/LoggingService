package com.freshworks.LoggingService.service;

import com.freshworks.LoggingService.controller.LoggingServiceController;
import com.freshworks.LoggingService.model.Error;
import com.freshworks.LoggingService.model.LoggingInfo;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    Logger log = LoggerFactory.getLogger(LoggingServiceController.class);
    private static final Gson gson = new Gson();

    public String getLogInfo(LoggingInfo input){
        StringBuilder response = new StringBuilder();
        log.debug("Request {} \n ",gson.toJson(input.toString()));
        Error error = new Error();
        error.setCode(input.getError().getCode());
        error.setErrorMessage(input.getError().getErrorMessage());
        log.debug("Response{} \n",gson.toJson(error));
        return gson.toJson(error);
    }

}
