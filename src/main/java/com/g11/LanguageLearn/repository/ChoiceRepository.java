package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice,Integer> {
}
