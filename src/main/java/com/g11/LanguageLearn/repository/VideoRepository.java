package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,Integer> {
}
