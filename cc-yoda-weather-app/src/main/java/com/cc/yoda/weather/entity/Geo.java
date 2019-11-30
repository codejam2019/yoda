package com.cc.yoda.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Geo {

	@Id
	Integer id;

	String country;

	String city;

	String sensorId;
}
