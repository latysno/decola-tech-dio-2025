package me.dio.service;

import me.dio.domain.model.RPGCharacter;

public interface RPGCharacterService {

    RPGCharacter findById(Long id);

    RPGCharacter create(RPGCharacter characterToCreate);
}
