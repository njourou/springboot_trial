package de.leuphana.shop.connector.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShopEntity {

	@Id
	private int shopId;
	private int catalogId;
	private int customerId;
	// private Map<customerId> customers;

	@ElementCollection
	private List<Integer> customers;

	public ShopEntity() {

	}

	public int getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
}
