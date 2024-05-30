package com.kackan1.trainingapp.training;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class TrainingFacade {
    TrainingService service;

    public TrainingFacade(TrainingService service) {
        this.service = service;
    }

    public ResponseEntity<List<TrainingDto>> getAllTraining() {
        return new ResponseEntity<>(Mapper.toDto(service.getAllTraining()), HttpStatus.OK);
    }

    public ResponseEntity<TrainingDto> getTraining(long id) {
        return new ResponseEntity<>(Mapper.toDto(service.getTraining(id)), HttpStatus.OK);
    }

    public ResponseEntity<TrainingDto> postTraining(TrainingDto dto) {
        return new ResponseEntity<>(Mapper.toDto(service.postTraining(Mapper.toEntity(dto))), HttpStatus.OK);
    }

    public ResponseEntity<TrainingDto> putTraining(long id, TrainingDto dto) {
        return new ResponseEntity<>(Mapper.toDto(service.putTraining(id, Mapper.toEntity(dto))), HttpStatus.OK);
    }

}
