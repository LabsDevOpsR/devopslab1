package com.LabsDevOpsR.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@ToString
@NoArgsConstructor

public class ParkRide {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private int rideCharges;
    private int needsSupervision;

    public ParkRide(String name, String description, int rideCharges, int needsSupervision) {
        this.name = name;
        this.description = description;
        this.rideCharges = rideCharges;
        this.needsSupervision = needsSupervision;
    }
}
