package com.codeclan.example.FolderFiles.components;

import com.codeclan.example.FolderFiles.models.File;
import com.codeclan.example.FolderFiles.models.Folder;
import com.codeclan.example.FolderFiles.models.User;
import com.codeclan.example.FolderFiles.repositories.FolderRepository;
import com.codeclan.example.FolderFiles.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user1 = new User("Max");
        userRepository.save(user1);

        Folder folder1 = new Folder("Fun Stuff", user1);
        folderRepository.save(folder1);

        File file1 = new File("file1", "png", "60Mb", folder1);
    }
}
