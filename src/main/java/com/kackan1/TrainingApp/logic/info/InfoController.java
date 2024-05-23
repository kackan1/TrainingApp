package com.kackan1.trainingapp.logic.info;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/info")
public class InfoController {

    @GetMapping
    public ResponseEntity<?> getMethodName(@RequestParam String param) {
        return ResponseEntity.ok("info Controller");
    }

}
