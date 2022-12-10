package ru.gb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.ProductRepository;
import ru.gb.StudentRepository;

@Controller
@RequestMapping("/products")
public class ProductController {
    // инжекктим репозиторый продуктов
    @Autowired
    ProductRepository productRepository;


    @GetMapping("/show")
    // endpoint: localhost:8180/app/products/show
    public String showAllProducts(Model model)
    {
        productRepository.init();
        //в model маппируем в тег products всех продуктов
        model.addAttribute("products", productRepository.showProducts());
        // возращаем в страницу продуктов
        return "products";
    }
}
