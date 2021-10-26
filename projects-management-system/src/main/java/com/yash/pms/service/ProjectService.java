package com.yash.pms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

/**
 * service class which performs service methods
 * @author ravi.manikanta
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.domain.Project;
import com.yash.pms.exceptions.ProjectIDException;
import com.yash.pms.repository.ProjectRepository;

@Service
@Transactional
public class ProjectService {
	@Autowired
	ProjectRepository repository;
	/**
	 * save or update project record in database
	 */


	public Project saveOrUpdateProject(Project entity)
	{
		Optional<Project> project = repository.findById(entity.getId());
		if(project.isPresent()) {
			Project newEntity = project.get();
			newEntity.setId(entity.getId());
			newEntity.setProjectName(entity.getProjectName());
			newEntity.setProjectIdentifier(entity.getProjectIdentifier());
			newEntity.setDescription(entity.getDescription());
			newEntity.setCreated_At(entity.getCreated_At());
			newEntity.setUpdated_At(entity.getUpdated_At());
			newEntity.setStart_At(entity.getStart_At());
			newEntity.setEnd_At(entity.getEnd_At());

			newEntity = repository.save(newEntity);
			return newEntity;
		}
		else {
			entity = repository.save(entity);
			return entity;
		}
	}

	/**
	 * To get project records from database	
	 */
	public List<Project> getAllProjects(){
		List<Project> list = repository.findAll();
		if(list.size()>0) {
			return list;
		}
		else {
			return new ArrayList<Project>();
		}
	}
	/**
	 * to get project record by identifier
	 * @throws ProjectIDException 
	 */
	public Project getProjectByIdentifier(String projectIdentifier) throws ProjectIDException  {
		Project project = repository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if(project == null) {
			throw new ProjectIDException("project identifier "+projectIdentifier.toUpperCase()+" not exists");
		}else {
			Project p=repository.findByProjectIdentifier(projectIdentifier);
			return p;
		}
	}


	/**
	 * to delete project record by project identifier	
	 * @throws ProjectIDException 
	 */
	public void deleteProjectByIdentifier(String projectIdentifier) throws ProjectIDException {
		Project project = repository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if(project == null) {
			throw new ProjectIDException("project identifier "+projectIdentifier.toUpperCase()+" not exists");
		}

		repository.deleteByProjectIdentifier(projectIdentifier);

	}
}
