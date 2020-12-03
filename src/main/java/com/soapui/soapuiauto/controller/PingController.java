package com.soapui.soapuiauto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soapui.soapuiauto.model.PingRequest;
import com.soapui.soapuiauto.model.PingResponse;

@RestController
@RequestMapping("/api/v0")
public class PingController {

	private static final Logger LOG = LoggerFactory.getLogger(PingController.class);

	@GetMapping("/get")
	public PingResponse getPing() {
		LOG.info("Received get request");
		return new PingResponse("Hello World");
	}

	@PutMapping("/put/{message}")
	public PingResponse putPing(@PathVariable("message") String message) {
		LOG.info("Received put request : " + message);
		return new PingResponse(message);
	}

	@PostMapping("/post")
	public PingResponse postPing(@RequestBody PingRequest request) {
		LOG.info("Received post request : " + request.toString());
		return new PingResponse("SUCCESS");
	}
}
