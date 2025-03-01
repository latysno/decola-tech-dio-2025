package me.dio.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(name = "attack_power", precision = 13, scale = 2)
    private BigDecimal attackPower;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAttackPower() {
        return attackPower;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackPower(BigDecimal attackPower) {
        this.attackPower = attackPower;
    }
}
