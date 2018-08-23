package com.gerberjava.ownSpring.service;

import com.gerberjava.ownSpring.Auto.Product;
import com.gerberjava.ownSpring.Repository.MachineRepository;
import com.gerberjava.ownSpring.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ProductionService
{
    @Autowired
    MachineRepository machineRepository;

    @Autowired
    ProductRepository productRepository;

    final static Random rand = new Random();

    public void assignRandomProduct(String MachineName)
    {
        List<Product> allProducts = productRepository.getAll();
        Product randomProduct = allProducts.get(rand.nextInt(allProducts.size()));
        machineRepository.getMachine(MachineName).setProduct(randomProduct);
        productRepository.deleteProduct(randomProduct);
    }

}
