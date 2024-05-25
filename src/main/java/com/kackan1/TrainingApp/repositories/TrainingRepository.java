package com.kackan1.trainingapp.repositories;

import java.util.List;
import java.util.Optional;

import com.kackan1.trainingapp.model.Training;

public interface TrainingRepository {
    List<Training> findAll();

    Training save(Training entity);

    Optional<Training> findById(long id);
}
