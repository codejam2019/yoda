package com.cc.yoda.weather.controllers;

import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class CityTimeRangeController {

	@RequestMapping("/")
	public Response<String> getSensorDataByCityTimeRange(String type, String city, String dateTimeFrom,
			String dateTimeTo) {
		Response<String> response = null;
		
		return response;
	}
}
