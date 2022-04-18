package com.project.app.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "DRIVE")
public class Drive {

    @Id
    @Column(name = "ID")
    private int idDrive;

    @OneToMany
    @Column(name = "DRIVE_ADVERT")
    private Set<Advertisement> advertisements;

    @Column(name = "TYPE")
    private String driveType;

    public int getIdDrive() {
        return idDrive;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
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
        Drive drive = (Drive) o;
        return idDrive == drive.idDrive && Objects.equals(advertisements, drive.advertisements) && Objects.equals(driveType, drive.driveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDrive, advertisements, driveType);
    }
}
