package com.example.docker.repository;

import com.example.docker.entity.Evidence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface EvidenceRepository extends JpaRepository<Evidence , Long> {

    public Integer countEvidencesByDate(LocalDate date);
}
