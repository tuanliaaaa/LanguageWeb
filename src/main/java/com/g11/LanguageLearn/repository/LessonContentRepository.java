package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.LessonContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonContentRepository extends JpaRepository<LessonContent,Integer> {
}
