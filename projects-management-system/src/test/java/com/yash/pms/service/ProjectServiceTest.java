package com.yash.pms.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import com.yash.pms.domain.Project;
import com.yash.pms.exceptions.ProjectIDException;
import com.yash.pms.repository.ProjectRepository;
@SpringBootTest
class ProjectServiceTest {
	@Mock
	ProjectRepository repository;
	@InjectMocks
	ProjectService service;
	
	@Test
	public void testGetAllProjects() {
		Project p1 =new Project(2,"EMS","EMS007","Employee Management System","2021-09-23","2021-09-30","2021-09-20","2021-10-02");
		Project p = new Project(1, "MMS", "MMS007", "Movies Management System", "2021-08-30", "2021-10-02","2021-09-29","2021-10-05");
	List<Project> list = new ArrayList<>();
	list.add(p);	
	list.add(p1);
	
	when(service.getAllProjects()).thenReturn(list);
	assertEquals(3, service.getAllProjects().size());
	}

	@Test
	public void testCreateProject() {
		Project p1 =new Project(2,"EMS","EMS007","Employee Management System","2021-09-23","2021-09-30","2021-09-20","2021-10-02");

		when(service.saveOrUpdateProject(p1)).thenReturn(p1);
		assertEquals(p1, service.saveOrUpdateProject(p1));
		
	}
	@Test
	public void testGetByProjectIdentifier() throws ProjectIDException {
		Project p1 =new Project(2,"EMS","EMS007","Employee Management System","2021-09-23","2021-09-30","2021-09-20","2021-10-02");

		when(repository.findByProjectIdentifier("EMS007")).thenReturn(p1);
		assertEquals(p1, service.getProjectByIdentifier("EMS007"));
	}

}
