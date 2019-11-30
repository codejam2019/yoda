package com.cc.yoda.weather.controllers;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc.yoda.weather.services.CityTimeRangeService;

@RestController
public class CityTimeRangeController {

	@Autowired
	private CityTimeRangeService cityTimeRangeService;

	@GetMapping(value = "/data")
	public Response<Object> getSensorDataByCityTimeRange(String type, String sensorId, String dateTimeFrom,
			String dateTimeTo) {
		Response<Object> response = null;
		cityTimeRangeService.asdf();
		return response;
	}
}
