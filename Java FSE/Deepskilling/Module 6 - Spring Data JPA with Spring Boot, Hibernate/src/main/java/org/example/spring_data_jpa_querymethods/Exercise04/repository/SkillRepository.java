package org.example.spring_data_jpa_querymethods.Exercise04.repository;

import org.example.spring_data_jpa_querymethods.Exercise04.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Integer> {
}