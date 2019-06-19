package cn.loongair.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {

	@RequestMapping(value = "/calendarSelectAll")
	public Object calendarSelectAll() {
		return "calendarSelectAll";

	}
}
