package com.project.app.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "TRANSMISSION")
public class Transmission {

    @Id
    @Column(name = "ID_TRANSM")
    private String idTransm;

    @OneToMany
    @Column(name = "TRANSM_ADVERT")
    private Set<Advertisement> advertisements;

    @Column(name = "TYPE")
    private String transmType;

    @Column(name = "VARAITY")
    private String trasmVar;

    public String getTrasmVar() {
        return trasmVar;
    }

    public void setTrasmVar(String trasmVar) {
        this.trasmVar = trasmVar;
    }

    public String getIdTransm() {
        return idTransm;
    }

    public String getTransmType() {
        return transmType;
    }

    public void setTransmType(String transmType) {
        this.transmType = transmType;
    }

    public Set<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(Set<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return Objects.equals(idTransm, that.idTransm) && Objects.equals(advertisements, that.advertisements) && Objects.equals(transmType, that.transmType) && Objects.equals(trasmVar, that.trasmVar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransm, advertisements, transmType, trasmVar);
    }
}
