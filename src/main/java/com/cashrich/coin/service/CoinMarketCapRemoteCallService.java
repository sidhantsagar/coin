package com.cashrich.coin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "${external.coinmarketcap.name}", url = "${external.coinmarketcap.url}")
public interface CoinMarketCapRemoteCallService {

	@GetMapping(path = "/cryptocurrency/quotes/latest")
	Object getCoinMarketCap(@RequestHeader("X-CMC_PRO_API_KEY") String apiKey,
			@RequestParam("symbol") String symbol);

}
