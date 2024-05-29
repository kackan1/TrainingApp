package com.kackan1.trainingapp.training;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TrainingService {
    TrainingRepository repository;

    public TrainingService(TrainingRepository repository) {
        this.repository = repository;
    }

    public List<Training> getAllTraining() {
        return repository.findAll();
    }

    public Training getTraining(long id) {
        return repository.findById(id).orElseThrow();
    }

    public Training postTraining(Training training) {
        return repository.save(training);
    }

    @Transactional
    public Training putTraining(long id, Training entity) {
        Training original = repository.findById(id).orElseThrow();
        original.setName(entity.getName());
        original.setNotes(entity.getNotes());
        original.setExercises(entity.getExercises());
        return repository.save(original);
    }
}
