package com.cc.yoda.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Weather {
	@Id
	public Integer transactionId;

	@ManyToOne
	public CitiesMaster sensorId;

	public Integer dateTime;

	public Integer temperature;

	public Integer rainfall;
}
