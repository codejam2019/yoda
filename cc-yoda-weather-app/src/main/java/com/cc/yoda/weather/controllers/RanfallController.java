package com.cc.yoda.weather.controllers;

import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data/city")
public class RanfallController {

	@RequestMapping("/wettest")
	public Response<String> getWettestCity() {
		Response<String> response = null;

		return response;
	}

	@RequestMapping("/dryest")
	public Response<String> getDryestCity() {
		Response<String> response = null;

		return response;
	}
}
