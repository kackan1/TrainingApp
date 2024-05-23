package com.kackan1.trainingapp.logic.training;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TrainingDto {
  private long id;
  private String name;
}
