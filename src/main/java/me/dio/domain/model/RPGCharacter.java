package me.dio.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "tb_rpg_character")
public class RPGCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private CharacterSheet characterSheet;

    @OneToOne(cascade = CascadeType.ALL)
    private Equipment equipment;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ability> abilities;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Quest> quests;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }
}
