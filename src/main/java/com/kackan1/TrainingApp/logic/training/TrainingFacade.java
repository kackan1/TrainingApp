package com.kackan1.trainingapp.logic.training;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class TrainingFacade {
  final TrainingService service;

  public TrainingFacade(TrainingService service) {
    this.service = service;
  }

  public ResponseEntity<List<TrainingDto>> getAllTraining() {
    return service.getAllTraining();
  }

  public ResponseEntity<TrainingDto> addTrainingWithExercises(TrainingDto dto) {
    return service.addTrainingWithExercises(new TrainingMapper().toEntity(dto), dto.getExercises());
  }
}
