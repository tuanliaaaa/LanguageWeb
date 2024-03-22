package com.g11.LanguageLearn.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseInSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exerciseInSetID;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "exercisesID")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Exercises exercises;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "exerciseSetsID")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ExerciseSets exerciseSets;

}
