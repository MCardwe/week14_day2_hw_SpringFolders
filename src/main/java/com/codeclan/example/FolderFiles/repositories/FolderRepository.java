package com.codeclan.example.FolderFiles.repositories;

import com.codeclan.example.FolderFiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
