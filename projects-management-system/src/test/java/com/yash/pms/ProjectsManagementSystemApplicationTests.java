package com.yash.pms;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.pms.repository.ProjectRepository;
import com.yash.pms.service.ProjectService;

@SpringBootTest

class ProjectsManagementSystemApplicationTests {

	@InjectMocks
	ProjectService service;
	@Mock
	ProjectRepository repo;
	@Test
	public void getAllProjects() {

	}
}
