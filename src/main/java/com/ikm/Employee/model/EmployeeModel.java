package com.ikm.Employee.model;
import java.sql.Date;

import org.antlr.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder


@Entity
@Table(name = "employees")
public class EmployeeModel {


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "empid")
	@NotNull
	private int empid;

	@Column(name = "Name")
	@NotNull
	private String name;

	@Column(name = "Designation")
	@NotNull
	private String designation;
	
	@Column(name = "PhoneNo")
	@NotNull
	private String phoneno;
	
	@Column(name = "DateofBirth")
	@NotNull
	@Past
	private Date dateofbirth;

}
