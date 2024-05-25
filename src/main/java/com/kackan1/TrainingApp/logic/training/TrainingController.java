package com.kackan1.trainingapp.logic.training;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/training")
public class TrainingController {
  final TrainingFacade facade;

  public TrainingController(TrainingFacade facade) {
    this.facade = facade;
  }

  @GetMapping
  ResponseEntity<List<TrainingDto>> getAllTraining() {
    return facade.getAllTraining();
  }

  @PostMapping
  ResponseEntity<TrainingDto> addTraining(@RequestBody TrainingDto dto) {
    return facade.addTrainingWithExercises(dto);
  }
}
