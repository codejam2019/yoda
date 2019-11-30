package com.cc.yoda.weather.controllers;

import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data/city")
public class TemperatureController {

	@RequestMapping("/hottest")
	public Response<String> getHottestCity() {
		Response<String> response = null;

		return response;
	}

	@RequestMapping("/coldest")
	public Response<String> getColdestCity() {
		Response<String> response = null;

		return response;
	}
}
