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
public class ExercisesAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exercisesAnswerID;

    @NotNull
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "exercisesID")
    private Exercises exercise;

    @NotNull
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "answerID")
    private Answer answer;
}
