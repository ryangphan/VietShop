package com.List;

import com.shop.Shop;
import com.shop.ShopManager;

import java.util.ArrayList;
import java.util.List;

public class ShopList implements ShopManager {

    private List<Shop> shops = new ArrayList<>();

    @Override
    public void add(Shop shop) {
        this.shops.add(shop);
    }

    @Override
    public void update(Shop shop) {
        delete(shop.getId());
        add(shop);
    }

    @Override
    public void delete(int id) {
        this.shops.remove(get(id));
    }

    @Override
    public List<Shop> getAll() {
        return this.shops;
    }

    @Override
    public Shop get(int id) {
        for(Shop s: shops){
            if(s.getId()==id) return s;
        }
        return null;
    }
}
