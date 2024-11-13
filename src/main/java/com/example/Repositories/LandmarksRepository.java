package com.example.Repositories;

import com.example.Entities.Lanmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandmarksRepository extends JpaRepository<Lanmark, Long> {
}
