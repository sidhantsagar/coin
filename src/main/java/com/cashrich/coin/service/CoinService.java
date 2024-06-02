package com.cashrich.coin.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cashrich.coin.entity.Coin;
import com.cashrich.coin.entity.User;
import com.cashrich.coin.repository.CoinRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CoinService {

	private final CoinMarketCapRemoteCallService coinMarketCapRemoteCallService;
	private final CoinRepository coinRepository;

	@Value("${external.coinmarketcap.key}")
	private String key;

	public Object getCoinMarketCap(User user, String symbol) {
		Object response = coinMarketCapRemoteCallService.getCoinMarketCap(key, symbol);
		Coin coin = new Coin();

		coin.setUserName(user.getUsername());
		coin.setRequest(symbol);
		coin.setResponse(response.toString());
		coinRepository.save(coin);
		return response;
	}

}
