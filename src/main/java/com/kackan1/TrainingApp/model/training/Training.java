package com.kackan1.trainingapp.model.training;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@Table(name = "training")
public class Training {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    public Training() {
    }

    public Training(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
