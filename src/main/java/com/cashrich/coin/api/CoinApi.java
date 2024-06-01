package com.cashrich.coin.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cashrich.coin.service.CoinService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cashrich/coin/v1")
@RequiredArgsConstructor
public class CoinApi {
	
	private final CoinService coinService;

	@GetMapping("/coins")
	Object getCoinMarketCap(@RequestParam(value = "symbol") String symbol) {
		Object response = coinService.getCoinMarketCap(symbol);
		return response;

	}

}
