package com.codeclan.annotationhomework.components;

import com.codeclan.annotationhomework.models.File;
import com.codeclan.annotationhomework.models.Folder;
import com.codeclan.annotationhomework.models.User;
import com.codeclan.annotationhomework.repositories.FileRepository;
import com.codeclan.annotationhomework.repositories.FolderRepository;
import com.codeclan.annotationhomework.repositories.UserRepository;
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

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User zsolt = new User("Zsolt");
        userRepository.save(zsolt);

        User steve = new User("Steve");
        userRepository.save(steve);

        User jenny = new User("Jenny");
        userRepository.save(jenny);

        User martyna = new User("Martyna");
        userRepository.save(martyna);

        User karen = new User("Karen");
        userRepository.save(karen);

        User marion = new User("Marion");
        userRepository.save(marion);

        User drew = new User("Drew");
        userRepository.save(drew);

        User andy = new User("Andy");
        userRepository.save(andy);

        User przemyslaw = new User("Przemyslaw");
        userRepository.save(przemyslaw);

        Folder folder1 = new Folder("folder 1", zsolt);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("folder 2", steve);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("folder 3", jenny);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("folder 4", martyna);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("folder 5", marion);
        folderRepository.save(folder5);

        Folder folder6 = new Folder("folder 6", karen);
        folderRepository.save(folder6);

        Folder folder7 = new Folder("folder 7", drew);
        folderRepository.save(folder7);

        Folder folder8 = new Folder("folder 8", andy);
        folderRepository.save(folder8);

        Folder folder9 = new Folder("folder 9", przemyslaw);
        folderRepository.save(folder9);

        Folder folder10 = new Folder("folder 10", jenny);
        folderRepository.save(folder10);

        Folder folder11 = new Folder("folder 11", karen);
        folderRepository.save(folder11);

        Folder folder12 = new Folder("folder 12", andy);
        folderRepository.save(folder12);

        File homework1 = new File("homework1", "java", 100, folder1);
        fileRepository.save(homework1);

        File homework2 = new File("homework2", "txt", 125, folder1);
        fileRepository.save(homework2);

        File homework3 = new File("homework3", "ppt", 150, folder2);
        fileRepository.save(homework3);

        File homework4 = new File("homework4", "rb", 200, folder2);
        fileRepository.save(homework4);

        File homework5 = new File("homework5", "java", 100, folder3);
        fileRepository.save(homework5);

        File homework6 = new File("homework6", "txt", 100, folder4);
        fileRepository.save(homework6);

        File homework7 = new File("homework7", "ppt", 100, folder5);
        fileRepository.save(homework7);

        File homework8 = new File("homework8", "java", 200, folder6);
        fileRepository.save(homework8);

        File homework9 = new File("homework9", "txt", 125, folder7);
        fileRepository.save(homework9);

        File homework10 = new File("homework10", "java", 100, folder8);
        fileRepository.save(homework10);

        File homework11 = new File("homework11", "java", 200, folder9);
        fileRepository.save(homework11);

        File homework12 = new File("homework12", "txt", 100, folder10);
        fileRepository.save(homework12);

        File homework13 = new File("homework13", "java", 100, folder11);
        fileRepository.save(homework13);

        File homework14 = new File("homework14", "ppt", 200, folder12);
        fileRepository.save(homework14);

    }

}
