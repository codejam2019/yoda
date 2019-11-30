package com.cc.yoda.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cc.yoda.weather.entity.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {

	@Query("select * from Weather where sensorId = ?1 and dateTime > ?2 and dateTime < ?3")
	public List<Weather> findAllBySensorIdAndTimeRange(String sensorId, String from, String to);
}
