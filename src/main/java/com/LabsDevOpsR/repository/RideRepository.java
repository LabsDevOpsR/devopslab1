package com.LabsDevOpsR.repository;

import org.springframework.data.repository.CrudRepository;
import com.LabsDevOpsR.entity.ParkRide;
import java.util.List;

public interface RideRepository extends CrudRepository<ParkRide, Long> {
    List<ParkRide> findByName(String name);
}