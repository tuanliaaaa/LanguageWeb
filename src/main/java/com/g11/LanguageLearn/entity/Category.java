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
@Table( uniqueConstraints = { @UniqueConstraint(columnNames = { "categoryName" }) })
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryID;

    @NotNull
    private String categoryName;


    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "parentID")
    private Category parent;

}