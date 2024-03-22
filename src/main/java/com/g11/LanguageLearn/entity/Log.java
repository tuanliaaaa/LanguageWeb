package com.g11.LanguageLearn.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logID;

    @NotNull
    private LocalDateTime timeLog;

    @NotNull
    private String valueLog;

    // Constructors, getters, and setters
}