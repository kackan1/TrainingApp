package com.kackan1.trainingapp.logic.training;

import com.kackan1.trainingapp.logic.exercise.ExerciseDto;
import com.kackan1.trainingapp.logic.exercise.ExerciseMapper;
import com.kackan1.trainingapp.model.Training;
import com.kackan1.trainingapp.repositories.ExerciseRepository;
import com.kackan1.trainingapp.repositories.TrainingRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {
  TrainingRepository repository;
  ExerciseRepository exerciseRepository;

  public TrainingService(TrainingRepository repository, ExerciseRepository exerciseRepository) {
    this.repository = repository;
    this.exerciseRepository = exerciseRepository;
  }

  public ResponseEntity<List<TrainingDto>> getAllTraining() {
    return new ResponseEntity<>(new TrainingMapper().toDto(repository.findAll()), HttpStatus.OK);
  }

  @Transactional
  public ResponseEntity<TrainingDto> addTrainingWithExercises(Training entity, List<ExerciseDto> exerciseDto) {
    var result = repository.save(entity);
    var result2 = exerciseRepository.saveAll(new ExerciseMapper().toEntity(exerciseDto, result));
    result.setExercises(result2);
    var result3 = repository.save(result);
    return new ResponseEntity<>(new TrainingMapper().toDto(result3), HttpStatus.CREATED);
  }
}
