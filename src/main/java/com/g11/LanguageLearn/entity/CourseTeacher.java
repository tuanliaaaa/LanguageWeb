package com.g11.LanguageLearn.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseTeacherID;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "courseID", nullable = false)
    private Course course;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "teacherID", nullable = false)
    private Teacher teacher;
}
