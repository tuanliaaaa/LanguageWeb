package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.ExercisesAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesAnswerRepository extends JpaRepository<ExercisesAnswer,Integer> {
}
