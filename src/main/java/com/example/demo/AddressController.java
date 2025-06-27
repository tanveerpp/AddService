package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AddressController {
	@Autowired
	MyRepo repo;
	@GetMapping("/address")
	public List<Address> show()
	{
		return this.repo.findAll();
	}
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address ad)
	{
		return this.repo.save(ad);
	}
}
