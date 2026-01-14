package com.smartcheckout;

import java.util.HashMap;
import java.util.List;

public class ItemStore {

	protected HashMap<String, Integer>priceMap;
	protected HashMap<String, Integer>stockMap;
	
    public ItemStore() {
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }
	
	public void addItem(String name, int price) {
		priceMap.put(name, price);
	}
	
	public void addStock(String name, int stock) {
		stockMap.put(name, stock);
	}

}
