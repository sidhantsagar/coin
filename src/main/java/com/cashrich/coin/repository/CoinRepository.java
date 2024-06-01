package com.cashrich.coin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cashrich.coin.entity.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {
}
