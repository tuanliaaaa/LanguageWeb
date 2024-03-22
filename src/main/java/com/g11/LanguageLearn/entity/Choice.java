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
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer choiceID;

    @NotNull
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "studentID")
    private Student student;

    @NotNull
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "answerID")
    private Answer answer;
}
