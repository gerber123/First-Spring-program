package com.gerberjava.ownSpring;


import com.gerberjava.ownSpring.Auto.Machine;
import com.gerberjava.ownSpring.Repository.InMemoryMachineRepository;
import com.gerberjava.ownSpring.Repository.MachineRepository;
import com.gerberjava.ownSpring.Repository.ProductRepository;
import com.gerberjava.ownSpring.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner
{

    @Autowired
    MachineRepository MachineRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductionService productionService;

    @Override
    public void run(String... args) throws Exception
    {
        productRepository.createRandomProduct();
        productRepository.createRandomProduct();
        productionService.assignRandomProduct("Zgniatarka");
        productionService.assignRandomProduct("Pompa wodna");
        System.out.println(MachineRepository);
        System.out.println(MachineRepository);

    }
}
