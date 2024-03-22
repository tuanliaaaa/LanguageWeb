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
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer videoID;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "lessonContentID")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private LessonContent lessonContent;
}
