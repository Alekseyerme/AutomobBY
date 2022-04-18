package com.project.app.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "BODYWORK")
public class Bodywork {

    @Id
    @Column(name = "ID_BODYWORK")
    private int idBodywork;

    @OneToMany
    @Column(name = "BODYWORK_ADVERT")
    private Set<Advertisement> advertisements;

    @Column(name = "TYPE")
    private String bodyworkType;

    public int getIdBodywork() {
        return idBodywork;
    }

    public Set<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public void setAdvertisements(Set<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public void setBodyworkType(String bodyworkType) {
        this.bodyworkType = bodyworkType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bodywork bodywork = (Bodywork) o;
        return idBodywork == bodywork.idBodywork && Objects.equals(advertisements, bodywork.advertisements) && Objects.equals(bodyworkType, bodywork.bodyworkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBodywork, advertisements, bodyworkType);
    }
}
