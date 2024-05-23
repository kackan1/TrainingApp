package com.kackan1.trainingapp.logic.training;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class TrainingFacade {
  final TrainingService service;

  public TrainingFacade(TrainingService service) {
    this.service = service;
  }

  public ResponseEntity<?> getAllTraining() {
    return service.getAllTraining();
  }

  public ResponseEntity<?> addTraining(TrainingDto dto) {
    return service.addTraining(new TrainingMapper().toEntity(dto));
  }
}
