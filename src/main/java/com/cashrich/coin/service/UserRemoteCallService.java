package com.cashrich.coin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cashrich.coin.entity.User;

@Service
@FeignClient(name = "${external.user.name}", url = "${external.user.url}")
public interface UserRemoteCallService {

	@GetMapping(path = "/login")
	User login(@RequestBody User user);

}
