package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log,Integer> {
}
