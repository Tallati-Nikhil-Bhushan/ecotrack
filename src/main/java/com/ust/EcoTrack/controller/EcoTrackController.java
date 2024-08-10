package com.ust.EcoTrack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcoTrackController {
	
	@GetMapping("/")
	public String greet() {
		return "Welcome to EcoTrack";
	}
}
