package ru.gb;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import ru.gb.model.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> products;

    // иницииализируем в бине продукты
    @PostConstruct
    public void init()
    {
        this.products = new ArrayList
                (
                        Arrays.asList(new Product(1L, "Car", 600),
                        new Product(2L, "House", 1002),
                        new Product(3L, "Boat", 300)));
    }

    //выводим список продуктов
    public List<Product> showProducts()
    {
        return products;
    }
}
