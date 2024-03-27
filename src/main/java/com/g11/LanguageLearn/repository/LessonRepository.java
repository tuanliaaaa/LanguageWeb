package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Integer> {
}
