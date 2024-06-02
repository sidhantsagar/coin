package com.cashrich.coin.api;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cashrich.coin.entity.User;
import com.cashrich.coin.service.CoinService;
import com.cashrich.coin.service.UserRemoteCallService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/cashrich/coin/v1")
@RequiredArgsConstructor
public class CoinApi {

	private final CoinService coinService;
	private final UserRemoteCallService userRemoteCallService;
	private final HttpServletRequest httpRequest;

	@GetMapping("/coins")
	Object getCoinMarketCap(@RequestParam(value = "symbol") String symbol) {
		String[] credentials = getCred();
		log.info("Username : {} ", Arrays.toString(credentials));
		User user= null;
		try {
			user = userRemoteCallService.login(new User(credentials[0], credentials[1]));
		} catch (Exception e) {
			throw e;
		}
		return Objects.nonNull(user) ? coinService.getCoinMarketCap(user, symbol) : "Unauthorized user";

	}

	String[] getCred() {
		final String authorization = httpRequest.getHeader("Authorization");
		String[] values = null;
		if (authorization != null && authorization.toLowerCase().startsWith("basic")) {
			// Authorization: Basic base64credentials
			String credentials = new String(
					Base64.getDecoder().decode(authorization.substring("Basic".length()).trim()),
					StandardCharsets.UTF_8);
			// credentials = username:password
			values = credentials.split(":", 2);
		}
		return values;
	}

}
