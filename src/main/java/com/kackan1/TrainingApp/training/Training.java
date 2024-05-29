package com.kackan1.trainingapp.training;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "training")
@Getter
@Setter
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String notes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "training", fetch = FetchType.EAGER)
    private List<Exercise> exercises;
}
