package com.cc.yoda.weather.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Weather {
	@Id
	Integer id;

	@ManyToOne
	Integer geoId;

	LocalDateTime dateTime;

	Integer temperature;

	Integer rainfall;
}
