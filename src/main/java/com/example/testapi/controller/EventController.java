package com.example.testapi.controller;

import com.example.testapi.api.EventApi;
import com.example.testapi.model.EventDTO;
import com.example.testapi.model.ResponseCloudEventDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.OffsetDateTime;

@Slf4j
@Controller
@EnableWebMvc
public class EventController implements EventApi {

    @Override
    public ResponseEntity<ResponseCloudEventDTO> processEvent(String ceId, String ceType, EventDTO eventDTO, String contentType, String ceSource, String ceSpecversion, String ceDataschema, String ceSubject, OffsetDateTime ceTime, String ceGlscorrelationid) {
        log.info("Call processEvent");
        log.info(eventDTO.toString());
        return null;
    }

}
