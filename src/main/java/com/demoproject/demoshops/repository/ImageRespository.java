package com.demoproject.demoshops.repository;

import com.demoproject.demoshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRespository extends JpaRepository<Image, Long> {
}
