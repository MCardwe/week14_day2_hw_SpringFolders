package com.codeclan.example.FolderFiles.repositories;

import com.codeclan.example.FolderFiles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
