package com.kackan1.trainingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kackan1.trainingapp.model.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
