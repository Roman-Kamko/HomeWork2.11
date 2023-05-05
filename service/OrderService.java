package edu.skypro.hamework2_11.service;

import edu.skypro.hamework2_11.data.Item;

import java.util.Collection;

public interface OrderService {
    void add(int... id);

    Collection<Item> get();
}
