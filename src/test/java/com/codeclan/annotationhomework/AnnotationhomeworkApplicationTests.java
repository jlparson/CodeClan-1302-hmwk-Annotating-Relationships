package com.codeclan.annotationhomework;

import com.codeclan.annotationhomework.models.File;
import com.codeclan.annotationhomework.models.Folder;
import com.codeclan.annotationhomework.models.User;
import com.codeclan.annotationhomework.repositories.FileRepository;
import com.codeclan.annotationhomework.repositories.FolderRepository;
import com.codeclan.annotationhomework.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotationhomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFolder(){
		User jenny = new User("Jenny");
		userRepository.save(jenny);

		Folder homework = new Folder("homework", jenny);
		folderRepository.save(homework);

		File file1 = new File("annotation_homework", "java", 100, homework);
		fileRepository.save(file1);

	}

}
