package com.kackan1.trainingapp.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/training")
public class TrainingController {
    TrainingFacade facade;

    public TrainingController(TrainingFacade facade) {
        this.facade = facade;
    }

    @GetMapping
    public ResponseEntity<List<TrainingDto>> getAllTraining() {
        return facade.getAllTraining();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainingDto> getTraining(@PathVariable long id) {
        return facade.getTraining(id);
    }

    @PostMapping
    public ResponseEntity<TrainingDto> postTraining(@RequestBody TrainingDto dto) {
        return facade.postTraining(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrainingDto> putTraining(@PathVariable long id, @RequestBody TrainingDto dto) {
        return facade.putTraining(id, dto);
    }

}
