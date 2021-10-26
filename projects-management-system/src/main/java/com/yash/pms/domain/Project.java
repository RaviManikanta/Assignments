package com.yash.pms.domain;
/**
 * project management system domain class 
 * @author ravi.manikanta
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * id of project
	 */
	private long id;
	
	@NotBlank(message = "project name required")
	@Size(min = 4, max =30, message = "please use 4 to 30 characters for project name")
	/**
	 * name of project
	 */
	private String projectName;
	
	
	@Column(updatable = false, unique = true)
	@NotBlank(message ="project identifier required")
	@Size(min= 4, max =5, message="please use 4 to 5 characters for project identifier")
	/**
	 * identifier for project
	 */
	private String projectIdentifier;
	
	@NotBlank(message="project description required")
	/**
	 * project description
	 */
	private String description;
	
	
	@Column(updatable = false)
	@JsonFormat(pattern = "yyyy-mm-dd")
	/**
	 * created date of project
	 */
	private Date created_At;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	/**
	 * updated date of project
	 */
	private Date updated_At;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	/**
	 * started date of project
	 */
	private Date start_At;
	
	@Future
	@JsonFormat(pattern = "yyyy-mm-dd")
	/**
	 * end date of project
	 */
	private Date end_At;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	public Date getStart_At() {
		return start_At;
	}

	public void setStart_At(Date start_At) {
		this.start_At = start_At;
	}

	public Date getEnd_At() {
		return end_At;
	}

	public void setEnd_At(Date end_At) {
		this.end_At = end_At;
	}
	
/**
 * 
 * @param id
 * @param projectName
 * @param projectIdentifier
 * @param description
 * @param created_At
 * @param updated_At
 * @param start_At
 * @param end_At
 */
	public Project(long id,
			@NotBlank(message = "project name required") @Size(min = 4, max = 30, message = "please use 4 to 30 characters for project name") String projectName,
			@NotBlank(message = "project identifier required") @Size(min = 4, max = 5, message = "please use 4 to 5 characters for project identifier") String projectIdentifier,
			@NotBlank(message = "project description required") String description, Date created_At, Date updated_At,
			Date start_At, @Future Date end_At) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectIdentifier = projectIdentifier;
		this.description = description;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.start_At = start_At;
		this.end_At = end_At;
	}
/**
 * default constructor
 */
public Project() {

}

public Project(int id2, String projectName2, String projectIdentifier2, String description2, String string,
		String string2, String string3, String string4) {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Project [id=" + id + ", projectName=" + projectName + ", projectIdentifier=" + projectIdentifier
			+ ", description=" + description + ", created_At=" + created_At + ", updated_At=" + updated_At
			+ ", start_At=" + start_At + ", end_At=" + end_At + "]";
}
	
	

}
