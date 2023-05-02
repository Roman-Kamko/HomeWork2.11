package edu.skypro.hamework2_11.service;

import edu.skypro.hamework2_11.data.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService {
    private final List<Item> basketList = new ArrayList<>();
    private final ValidatorService validatorService;

    public OrderServiceImpl(ValidatorService validatorService) {
        this.validatorService = validatorService;
    }

    @Override
    public void add(int... id) {
        for (int i : id) {
            basketList.add(new Item(validatorService.validateItemId(i)));
        }
    }

    @Override
    public Collection<Item> get() {
        return Collections.unmodifiableList(basketList);
    }
}
