package com.project.app.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "MODEL")
public class Car_model {

    @Id
    @Column(name = "ID_MODEL")
    private int idModels;

    @ManyToOne
    @JoinColumn(name = "MARK_MODEL")
    private Mark mark;

    @OneToMany
    @Column(name = "ENGENE")
    private Set<Engene> engenes;

    public int getIdModels() {
        return idModels;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Set<Engene> getEngenes() {
        return engenes;
    }

    public void setEngenes(Set<Engene> engenes) {
        this.engenes = engenes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car_model car_model = (Car_model) o;
        return idModels == car_model.idModels && Objects.equals(mark, car_model.mark) && Objects.equals(engenes, car_model.engenes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idModels, mark, engenes);
    }
}
