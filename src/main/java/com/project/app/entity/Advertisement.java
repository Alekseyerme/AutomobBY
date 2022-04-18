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
    private Mark mark;

    @ManyToOne
    @JoinColumn(name = "BODYWORK")
    private Bodywork bodywork;

    @ManyToOne
    @JoinColumn(name = "TRANSMISSION")
    private Transmission transmission;

    @ManyToOne
    @JoinColumn(name = "DRIVE")
    private Drive drive;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VIN")
    private long vin;

    @Column(name = "DATE")
    private LocalDate localDate;

    @Column(name = "PRICE")
    private double price;

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Bodywork getBodywork() {
        return bodywork;
    }

    public void setBodywork(Bodywork bodywork) {
        this.bodywork = bodywork;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
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
