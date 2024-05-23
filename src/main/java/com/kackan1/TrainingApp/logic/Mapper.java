package com.kackan1.trainingapp.logic;

public interface Mapper<T, V> {
  T toEntity(V dto);
  V toDto(T entity);
}
