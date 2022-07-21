package com.Inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "EmployeeTable")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides({ @AttributeOverride(name = "Id", column = @Column(name = "Emp_Id")),
		@AttributeOverride(name = "name", column = @Column(name = "Emp_name")) })
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_Id")
	private int Id;

	@Column(name = "Emp_Name")
	private String name;
}
