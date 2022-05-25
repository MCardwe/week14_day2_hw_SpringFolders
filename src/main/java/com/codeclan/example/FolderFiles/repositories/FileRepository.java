package com.codeclan.example.FolderFiles.repositories;

import com.codeclan.example.FolderFiles.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
