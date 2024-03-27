package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.CategoryCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryCourseRepository extends JpaRepository<CategoryCourse,Integer> {
}
