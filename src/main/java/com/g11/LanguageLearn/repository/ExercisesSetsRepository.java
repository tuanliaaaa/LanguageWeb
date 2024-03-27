package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.ExerciseSets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesSetsRepository extends JpaRepository<ExerciseSets,Integer> {
}
