package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_character_sheet")
public class CharacterSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String race;

    @Column(name = "character_class")
    private String characterClass;

    private Integer level;

    private Integer experience;

    public Long getId() {
        return id;
    }

    public String getRace() {
        return race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}
