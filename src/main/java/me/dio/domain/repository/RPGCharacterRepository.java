package me.dio.domain.repository;

import me.dio.domain.model.RPGCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPGCharacterRepository extends JpaRepository<RPGCharacter, Long> {
    boolean existsByName(String name);
}
