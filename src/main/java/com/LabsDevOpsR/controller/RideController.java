package com.LabsDevOpsR.controller;

import com.LabsDevOpsR.entity.ParkRide;
import com.LabsDevOpsR.repository.RideRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class RideController {
    private final RideRepository RideRepository;

    public RideController(RideRepository RideRepository) {
        this.RideRepository = RideRepository;
    }

    @GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ParkRide> getRides() {
        return RideRepository.findAll();
    }

    @GetMapping(value = "/ride/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ParkRide getRide(@PathVariable long id){
        return RideRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid ride id %s", id)));
    }

    @PostMapping(value = "/ride", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ParkRide createRide(@Valid @RequestBody ParkRide ParkRide) {
        return RideRepository.save(ParkRide);
    }
}
