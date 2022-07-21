package com.Inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Regular_Employee")
public class RegularEmployee extends Employee {

	@Column(name = "Salary")
	private int salary;

	@Column(name = "Bonus")
	private int bonus;
}
