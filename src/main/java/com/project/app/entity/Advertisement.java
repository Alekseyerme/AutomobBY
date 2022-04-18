package com.project.app.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ADVERTIESEMENT")
public class Advertisement {

    @Id
    @Column(name = "ID_ADVERT")
    private int id;

    @ManyToOne
    @JoinColumn(name = "MARK")
    private com.project.classes.entity.Mark mark;

    @ManyToOne
    @JoinColumn(name = "BODYWORK")
    private com.project.classes.entity.Bodywork bodywork;

    @ManyToOne
    @JoinColumn(name = "TRANSMISSION")
    private com.project.classes.entity.Transmission transmission;

    @ManyToOne
    @JoinColumn(name = "DRIVE")
    private com.project.classes.entity.Drive drive;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VIN")
    private long vin;

    @Column(name = "DATE")
    private LocalDate localDate;

    @Column(name = "PRICE")
    private double price;

    public com.project.classes.entity.Mark getMark() {
        return mark;
    }

    public void setMark(com.project.classes.entity.Mark mark) {
        this.mark = mark;
    }

    public com.project.classes.entity.Bodywork getBodywork() {
        return bodywork;
    }

    public void setBodywork(com.project.classes.entity.Bodywork bodywork) {
        this.bodywork = bodywork;
    }

    public com.project.classes.entity.Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(com.project.classes.entity.Transmission transmission) {
        this.transmission = transmission;
    }

    public com.project.classes.entity.Drive getDrive() {
        return drive;
    }

    public void setDrive(com.project.classes.entity.Drive drive) {
        this.drive = drive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return id == that.id && vin == that.vin && Double.compare(that.price, price) == 0 && Objects.equals(mark, that.mark) && Objects.equals(bodywork, that.bodywork) && Objects.equals(transmission, that.transmission) && Objects.equals(drive, that.drive) && Objects.equals(description, that.description) && Objects.equals(localDate, that.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, bodywork, transmission, drive, description, vin, localDate, price);
    }
}
