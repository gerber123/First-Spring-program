package com.gerberjava.ownSpring.Repository;

import com.gerberjava.ownSpring.Auto.Machine;


import javax.annotation.PostConstruct;
import java.util.Collection;

public interface MachineRepository {
    void createMachine(String name);

    Collection<Machine> getAllMachines();

    Machine getMachine(String name);

    void deleteMachine(String name);

    @PostConstruct
    void MachineStartsWork();
}
