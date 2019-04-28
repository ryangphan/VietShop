package com.shop;

import java.util.List;

public interface ShopManager {

    void add(Shop shop);
    void update(Shop shop);
    void delete(int id);
    List<Shop> getAll();
    Shop get(int id);
}
