package com.project.app.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "MARK")
public class Mark {

    @Id
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mark_advert_id")
    private Set<Advertisement> advertisements;

    @Column(name = "MARK")
    private String markName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mark")
    private Set<Car_model> models;

    public Set<Advertisement> getAdvertisements() {
        return advertisements;
    }


    public int getId() {
        return id;
    }

    public String getMarkName() {
        return markName;
    }

    public Set<Car_model> getModels() {
        return models;
    }

    public void setAdvertisements(Set<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public void setModels(Set<Car_model> models) {
        this.models = models;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return id == mark.id && Objects.equals(advertisements, mark.advertisements) && Objects.equals(markName, mark.markName) && Objects.equals(models, mark.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisements, markName, models);
    }
}
