package com.g11.LanguageLearn.repository;

import com.g11.LanguageLearn.entity.RoleAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleAccountRepository extends JpaRepository<RoleAccount,Integer> {
}
