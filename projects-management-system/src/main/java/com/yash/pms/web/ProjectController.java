package com.yash.pms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.yash.pms.domain.Project;
import com.yash.pms.exceptions.ProjectIDException;
import com.yash.pms.service.ProjectService;
@Component
@RestController
@RequestMapping("/pms")
@CrossOrigin
public class ProjectController {
	@Autowired
	ProjectService service;
	
	@PostMapping("/createProject")
	public ResponseEntity<Project> createProject(@RequestBody Project project)
	{
		Project updated = service.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(updated, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/getAllProjects")
	public ResponseEntity<List<Project>> getAllProjects() {
		List<Project> list = service.getAllProjects();
		return new ResponseEntity<List<Project>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/getByIdentifier/{projectIdentifier}")
	public ResponseEntity<Project> getProjectByIdentifier(@PathVariable ("projectIdentifier") String projectIdentifier) throws ProjectIDException{
		Project p = service.getProjectByIdentifier(projectIdentifier);
		return new ResponseEntity<Project>(p,new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteByIdentifier/{projectIdentifier}")
	public HttpStatus deleteProjectByIdentifier(@PathVariable ("projectIdentifier") String projectIdentifier) throws ProjectIDException{
		service.deleteProjectByIdentifier(projectIdentifier);
		return HttpStatus.OK;
	}

}
