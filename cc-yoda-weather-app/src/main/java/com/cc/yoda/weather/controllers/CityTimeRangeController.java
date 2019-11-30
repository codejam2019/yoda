package com.cc.yoda.weather.controllers;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.yoda.weather.services.CityTimeRangeService;

@RestController
public class CityTimeRangeController {

	@Autowired
	private CityTimeRangeService cityTimeRangeService;

	@GetMapping(value = "/data")
	public Response<Object> getSensorDataByCityTimeRange(@RequestParam("type") String type,
			@RequestParam("sensorId") String sensorId, @RequestParam("dateTimeFrom") String dateTimeFrom,
			@RequestParam("dateTimeTo") String dateTimeTo) {
		Response<Object> response = null;
		cityTimeRangeService.getResults(type, sensorId, dateTimeFrom, dateTimeTo);
		return response;
	}
}
