package io.pivotal.sensor.rest;

import io.pivotal.sensor.model.User;
import io.pivotal.sensor.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Sample requests:
 * http://localhost:8080/get-all-users
 * 
 * @author belle
 *
 */

@RestController
public class UsersRestAPI {

	@Autowired
	private UsersService usersService;
	
	//http://localhost:8080/get-all-users
	@RequestMapping(value="/get-all-users", method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "defaultFallback")
	public Iterable<User> getAllUsers() {
		return usersService.findAllUsers();
	}
	
	public String defaultFallback() {
		//System.out.println("Could not connect to service 2");
        return "Could not connect to service";
	}
	
}
