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
@Table(name = "Contract_Employee")
public class ContractEmployee extends Employee {

	@Column(name = "Duration")
	private String duration;

	@Column(name = "PayPerHour")
	private int payPerHour;
}
