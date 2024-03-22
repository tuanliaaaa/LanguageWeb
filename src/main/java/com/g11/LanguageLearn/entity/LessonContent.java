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
public class LessonContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lessonContentID;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "lessonID")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Lesson lesson;
}
