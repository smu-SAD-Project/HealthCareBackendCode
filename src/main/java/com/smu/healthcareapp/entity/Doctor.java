package com.smu.healthcareapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Table(name = "doctor")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @Column
    public String image;

    @Column
    public String specialisedArea;

    @Column
    public String rating;

    @Column
    public String distance;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSpecialisedArea(String specialisedArea) {
        this.specialisedArea = specialisedArea;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSpecialisedArea() {
        return specialisedArea;
    }

    public String getRating() {
        return rating;
    }

    public String getDistance() {
        return distance;
    }
}
