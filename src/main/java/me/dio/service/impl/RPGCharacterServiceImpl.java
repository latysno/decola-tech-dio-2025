package me.dio.service.impl;

import me.dio.domain.model.RPGCharacter;
import me.dio.domain.repository.RPGCharacterRepository;
import me.dio.service.RPGCharacterService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class RPGCharacterServiceImpl implements RPGCharacterService {

    private final RPGCharacterRepository characterRepository;

    public RPGCharacterServiceImpl(RPGCharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public RPGCharacter findById(Long id) {
        return characterRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public RPGCharacter create(RPGCharacter characterToCreate) {
        if (characterRepository.existsByName(characterToCreate.getName())) {
            throw new IllegalArgumentException("Este nome de personagem já existe.");
        }
        return characterRepository.save(characterToCreate);
    }
}
