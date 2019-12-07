package com.jeeniv.first;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeeniv.third.Third;

@RestController
public class second {
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
	@RequestMapping("/Address")
	public List<Third> getAddress()
	{
		return Arrays.asList(
				new Third("ji1","1", "1232131"), 
				new Third("ji2","2", "1232132"), 
				new Third("ji3","3", "1232133")
				
				);
	}

}
