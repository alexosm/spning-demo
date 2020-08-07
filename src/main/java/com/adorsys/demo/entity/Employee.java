package com.adorsys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String city;
	private String hobby;

	public Employee() {
	}

	public Employee(Long id, String name, String city, String hobby) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.hobby = hobby;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getHobby() {
		return hobby;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", city='" + city + '\'' +
				", hobby='" + hobby + '\'' +
				'}';
	}
}
