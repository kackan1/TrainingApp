package com.kackan1.trainingapp.repositories.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kackan1.trainingapp.model.Training;
import com.kackan1.trainingapp.repositories.TrainingRepository;

@Repository
public interface SqlTrainingRepository extends TrainingRepository, JpaRepository<Training, Long> {
}
