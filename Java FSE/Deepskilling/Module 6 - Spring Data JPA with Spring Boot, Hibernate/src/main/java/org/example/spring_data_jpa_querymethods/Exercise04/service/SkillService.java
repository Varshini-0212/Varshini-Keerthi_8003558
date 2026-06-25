package org.example.spring_data_jpa_querymethods.Exercise04.service;

import org.example.spring_data_jpa_querymethods.Exercise04.model.Skill;
import org.example.spring_data_jpa_querymethods.Exercise04.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repository;

    public Skill get(Integer id){
        return repository.findById(id).orElse(null);
    }

    public Skill save(Skill skill){
        return repository.save(skill);
    }
}