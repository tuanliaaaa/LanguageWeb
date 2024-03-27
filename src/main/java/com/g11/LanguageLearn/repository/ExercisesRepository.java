package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesRepository extends JpaRepository<Exercises,Integer> {
}
