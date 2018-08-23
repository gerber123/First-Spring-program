package com.gerberjava.ownSpring.Repository;


import com.gerberjava.ownSpring.Auto.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
@Scope("singleton")
public class ProductRepository {

    List<Product> products = new ArrayList<>();
    Random rand = new Random();
    public void createProduct(String description)
    {
        products.add(new Product(description));
    }

    public List<Product> getAll()
    {
        return products;
    }

    public void deleteProduct(Product product)
    {
        products.remove(product);
    }

    @PostConstruct
    public void init()
    {

    }

    @Scheduled(fixedDelay = 2000)
    public void createRandomProduct()
    {
        List<String> descriptions = new ArrayList<>();
        descriptions.add("Klocki Lego");
        descriptions.add("Plastikowy smok");
        descriptions.add("Okrągly basen");
        String description = descriptions.get(rand.nextInt(descriptions.size()));
        System.out.println("Utworzyłem produkt o opisie: "+description);
        createProduct(description);
    }
}
