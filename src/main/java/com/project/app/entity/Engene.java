package com.project.app.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ENGENE")
public class Engene {

    @Id
    @Column(name = "ID_ENGENE")
    private int id;

    @Column(name = "VOLUME")
    private String volume;

    @ManyToOne
    @JoinColumn(name = "ENGENE")
    private Car_model car_model;

    @Column(name = "POWER")
    private String power;

    public int getId() {
        return id;
    }

    public String getVolume() {
        return volume;
    }

    public String getPower() {
        return power;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engene engene = (Engene) o;
        return id == engene.id && Objects.equals(volume, engene.volume) && Objects.equals(power, engene.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, volume, power);
    }
}
