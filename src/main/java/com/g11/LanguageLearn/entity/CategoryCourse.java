package com.g11.LanguageLearn.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryCouseID;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "courseID", referencedColumnName = "courseID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Course courses;

    @ManyToOne
    @JoinColumn(name = "categoryID", referencedColumnName = "categoryID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category category;
}
