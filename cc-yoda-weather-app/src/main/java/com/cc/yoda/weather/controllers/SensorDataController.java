package com.cc.yoda.weather.controllers;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor")
public class SensorDataController {

	@RequestMapping("/data")
	public Response<String> getWettestCity(String sensortId, String dateTimeFrom, String dateTimeTo) {
		Response<String> response = null;

		return response;
	}

	@RequestMapping("/list")
	public Response<String> getSensorList(@PathParam("country") String country, @PathParam("city") String city) {
		Response<String> response = null;

		return response;
	}
}
