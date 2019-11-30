package com.cc.yoda.weather.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.yoda.weather.entity.Result1;
import com.cc.yoda.weather.entity.Weather;
import com.cc.yoda.weather.repository.WeatherRepository;

@Service
public class CityTimeRangeService {

	@Autowired
	private WeatherRepository weatherRepo;

	public Result1 getResults(String type, String sensorId, String dateTimeFrom, String dateTimeTo) {
		Result1 result = new Result1();
		List<Weather> results = weatherRepo.findAllBySensorIdAndTimeRange(sensorId, dateTimeFrom, dateTimeTo);
		return result;
	}
}
