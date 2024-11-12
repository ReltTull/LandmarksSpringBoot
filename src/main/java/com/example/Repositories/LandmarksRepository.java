package com.example.Repositories;

import com.example.Entities.Lanmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandmarksRepository implements JpaRepository<Lanmark, Long> {
}
