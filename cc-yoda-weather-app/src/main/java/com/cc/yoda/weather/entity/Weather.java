package com.cc.yoda.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Weather {
	@Id
	Integer transactionId;

	@ManyToOne
	CitiesMaster sensorId;

	Integer dateTime;

	Integer temperature;

	Integer rainfall;
}
