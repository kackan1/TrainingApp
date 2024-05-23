package com.kackan1.trainingapp.model.training;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "training")
public class Training {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

}
