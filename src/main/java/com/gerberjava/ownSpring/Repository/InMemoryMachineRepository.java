package com.gerberjava.ownSpring.Repository;

import com.gerberjava.ownSpring.Auto.Machine;


import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class InMemoryMachineRepository implements MachineRepository {
   Map<String, Machine> machines = new HashMap<>();


    public InMemoryMachineRepository()
    {

    }
    @Override
    public void createMachine(String name)
    {
        machines.put(name,new Machine(name));
    }

    @Override
    public Collection<Machine> getAllMachines()
    {
        return machines.values();
    }

    @Override
    public Machine getMachine(String name)
    {
        return machines.get(name);
    }

    @Override
    public void deleteMachine(String name)
    {
        machines.remove(name);
    }

    @Override
    @PostConstruct
    public void MachineStartsWork()
    {
        createMachine("Zgniatarka");
        createMachine("Pompa wodna");

    }

    @Override
    public String toString() {
        return "InMemoryMachineRepository{" +
                "machines=" + machines +
                '}';
    }
}


