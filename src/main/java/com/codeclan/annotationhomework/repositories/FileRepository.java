package com.codeclan.annotationhomework.repositories;

import com.codeclan.annotationhomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
