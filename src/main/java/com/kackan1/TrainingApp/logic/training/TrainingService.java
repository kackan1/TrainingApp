package com.kackan1.trainingapp.logic.training;

import com.kackan1.trainingapp.model.training.Training;
import com.kackan1.trainingapp.model.training.TrainingRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {
  TrainingRepository repository;

  public TrainingService(TrainingRepository repository) {
    this.repository = repository;
  }

  public ResponseEntity<?> getAllTraining() {
    return ResponseEntity.ok(repository.findAll());
  }

  public ResponseEntity<?> addTraining(Training entity) {
    return new ResponseEntity<>(repository.save(entity), HttpStatus.CREATED);
  }
}
