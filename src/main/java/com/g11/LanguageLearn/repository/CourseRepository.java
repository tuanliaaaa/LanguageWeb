package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
