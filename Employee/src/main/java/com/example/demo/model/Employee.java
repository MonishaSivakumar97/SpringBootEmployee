package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	  @Column(name = "first_name")
	    private String firstName;

	  @Column(name = "last_name")
	    private String lastName;

	  @Column(name = "email")
	    private String email;
	    
	  @Column(name = "account_costomer")
	    private String accountcostomer;
	    
	  @Column(name = "project_name")
	    private String projectName;
	    
	  @Column(name = "project_details")
	    private String projectDetails;
	    
	  @Column(name = "created_date")
	    private String createdDate;
	    
	  @Column(name = "created_by")
	    private String createdBy;
	    
	  @Column(name = "completion_date")
	    private String completionDate;
	    
	  @Column(name = "Service_required")
	    private String ServiceRequired;

		public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Employee(long id, String firstName, String lastName, String email, String accountcostomer,
			String projectName, String projectDetails, String createdDate, String createdBy, String completionDate,
			String serviceRequired) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.accountcostomer = accountcostomer;
		this.projectName = projectName;
		this.projectDetails = projectDetails;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.completionDate = completionDate;
		ServiceRequired = serviceRequired;
	}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAccountcostomer() {
			return accountcostomer;
		}

		public void setAccountcostomer(String accountcostomer) {
			this.accountcostomer = accountcostomer;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectDetails() {
			return projectDetails;
		}

		public void setProjectDetails(String projectDetails) {
			this.projectDetails = projectDetails;
		}

		public String getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getCompletionDate() {
			return completionDate;
		}

		public void setCompletionDate(String completionDate) {
			this.completionDate = completionDate;
		}

		public String getServiceRequired() {
			return ServiceRequired;
		}

		public void setServiceRequired(String serviceRequired) {
			ServiceRequired = serviceRequired;
		}
	    
	
}
