package com.cashrich.coin.dao;

public class USD {
	private float price;
	private float volume_24h;
	private float volume_change_24h;
	private float percent_change_1h;
	private float percent_change_24h;
	private float percent_change_7d;
	private float percent_change_30d;
	private float percent_change_60d;
	private float percent_change_90d;
	private float market_cap;
	private float market_cap_dominance;
	private float fully_diluted_market_cap;
	private String tvl = null;
	private String last_updated;

	// Getter Methods

	public float getPrice() {
		return price;
	}

	public float getVolume_24h() {
		return volume_24h;
	}

	public float getVolume_change_24h() {
		return volume_change_24h;
	}

	public float getPercent_change_1h() {
		return percent_change_1h;
	}

	public float getPercent_change_24h() {
		return percent_change_24h;
	}

	public float getPercent_change_7d() {
		return percent_change_7d;
	}

	public float getPercent_change_30d() {
		return percent_change_30d;
	}

	public float getPercent_change_60d() {
		return percent_change_60d;
	}

	public float getPercent_change_90d() {
		return percent_change_90d;
	}

	public float getMarket_cap() {
		return market_cap;
	}

	public float getMarket_cap_dominance() {
		return market_cap_dominance;
	}

	public float getFully_diluted_market_cap() {
		return fully_diluted_market_cap;
	}

	public String getTvl() {
		return tvl;
	}

	public String getLast_updated() {
		return last_updated;
	}

	// Setter Methods

	public void setPrice(float price) {
		this.price = price;
	}

	public void setVolume_24h(float volume_24h) {
		this.volume_24h = volume_24h;
	}

	public void setVolume_change_24h(float volume_change_24h) {
		this.volume_change_24h = volume_change_24h;
	}

	public void setPercent_change_1h(float percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}

	public void setPercent_change_24h(float percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}

	public void setPercent_change_7d(float percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
	}

	public void setPercent_change_30d(float percent_change_30d) {
		this.percent_change_30d = percent_change_30d;
	}

	public void setPercent_change_60d(float percent_change_60d) {
		this.percent_change_60d = percent_change_60d;
	}

	public void setPercent_change_90d(float percent_change_90d) {
		this.percent_change_90d = percent_change_90d;
	}

	public void setMarket_cap(float market_cap) {
		this.market_cap = market_cap;
	}

	public void setMarket_cap_dominance(float market_cap_dominance) {
		this.market_cap_dominance = market_cap_dominance;
	}

	public void setFully_diluted_market_cap(float fully_diluted_market_cap) {
		this.fully_diluted_market_cap = fully_diluted_market_cap;
	}

	public void setTvl(String tvl) {
		this.tvl = tvl;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
}
