package com.cc.yoda.weather.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.yoda.weather.entity.Result1;
import com.cc.yoda.weather.entity.Weather;
import com.cc.yoda.weather.repository.CitiesMasterRepository;
import com.cc.yoda.weather.repository.WeatherRepository;

@Service
public class CityTimeRangeService {

	@Autowired
	private WeatherRepository weatherRepo;

	@Autowired
	private CitiesMasterRepository citiesMasterRepository;

	public Result1 getResults(String type, String sensorId, String dateTimeFrom, String dateTimeTo) {
		Result1 result = new Result1();
		List<Weather> results = weatherRepo.findAllBySensorIdAndTimeRange(sensorId, dateTimeFrom, dateTimeTo);

		String citiy = citiesMasterRepository.getCity(sensorId);

		result.city = citiy;
		result.type = type;
		result.timeValue = new ArrayList<>();

		for (Weather weather : results) {

		}

		return result;
	}
}
