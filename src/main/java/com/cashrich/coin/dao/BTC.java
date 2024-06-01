package com.cashrich.coin.dao;

import java.util.ArrayList;

public class BTC {
	private float id;
	private String name;
	private String symbol;
	private String slug;
	private float num_market_pairs;
	private String date_added;
	ArrayList<Object> tags = new ArrayList<Object>();
	private float max_supply;
	private float circulating_supply;
	private float total_supply;
	private float is_active;
	private boolean infinite_supply;
	private String platform = null;
	private float cmc_rank;
	private float is_fiat;
	private String self_reported_circulating_supply = null;
	private String self_reported_market_cap = null;
	private String tvl_ratio = null;
	private String last_updated;
	Quote QuoteObject;

	// Getter Methods

	public float getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getSlug() {
		return slug;
	}

	public float getNum_market_pairs() {
		return num_market_pairs;
	}

	public String getDate_added() {
		return date_added;
	}

	public float getMax_supply() {
		return max_supply;
	}

	public float getCirculating_supply() {
		return circulating_supply;
	}

	public float getTotal_supply() {
		return total_supply;
	}

	public float getIs_active() {
		return is_active;
	}

	public boolean getInfinite_supply() {
		return infinite_supply;
	}

	public String getPlatform() {
		return platform;
	}

	public float getCmc_rank() {
		return cmc_rank;
	}

	public float getIs_fiat() {
		return is_fiat;
	}

	public String getSelf_reported_circulating_supply() {
		return self_reported_circulating_supply;
	}

	public String getSelf_reported_market_cap() {
		return self_reported_market_cap;
	}

	public String getTvl_ratio() {
		return tvl_ratio;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public Quote getQuote() {
		return QuoteObject;
	}

	// Setter Methods

	public void setId(float id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setNum_market_pairs(float num_market_pairs) {
		this.num_market_pairs = num_market_pairs;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public void setMax_supply(float max_supply) {
		this.max_supply = max_supply;
	}

	public void setCirculating_supply(float circulating_supply) {
		this.circulating_supply = circulating_supply;
	}

	public void setTotal_supply(float total_supply) {
		this.total_supply = total_supply;
	}

	public void setIs_active(float is_active) {
		this.is_active = is_active;
	}

	public void setInfinite_supply(boolean infinite_supply) {
		this.infinite_supply = infinite_supply;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public void setCmc_rank(float cmc_rank) {
		this.cmc_rank = cmc_rank;
	}

	public void setIs_fiat(float is_fiat) {
		this.is_fiat = is_fiat;
	}

	public void setSelf_reported_circulating_supply(String self_reported_circulating_supply) {
		this.self_reported_circulating_supply = self_reported_circulating_supply;
	}

	public void setSelf_reported_market_cap(String self_reported_market_cap) {
		this.self_reported_market_cap = self_reported_market_cap;
	}

	public void setTvl_ratio(String tvl_ratio) {
		this.tvl_ratio = tvl_ratio;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

	public void setQuote(Quote quoteObject) {
		this.QuoteObject = quoteObject;
	}
}
