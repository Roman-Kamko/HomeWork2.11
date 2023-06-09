package edu.skypro.hamework2_11.controller;

import edu.skypro.hamework2_11.data.Item;
import edu.skypro.hamework2_11.exception.InvalidInputException;
import edu.skypro.hamework2_11.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/order")
// В application.properties добавлена строчка "server.servlet.context-path=/store"
public class OrderController {
    private final OrderService basketService;

    public OrderController(OrderService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "add")
    public String add(@RequestParam(value = "id") int... id) {
        basketService.add(id);
        if (id.length == 1) {
            return "Товар успешно добавлен в корзину";
        }
        return "Товары успешно добавлены в корзину";
    }

    @GetMapping(path = "get")
    public Collection<Item> get() {
        return basketService.get();
    }

    @ExceptionHandler({InvalidInputException.class})
    public String handleExceptions() {
        return "Некорректный ID товара";
    }
}
