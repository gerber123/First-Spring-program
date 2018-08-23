package com.gerberjava.ownSpring.config;

import com.gerberjava.ownSpring.Repository.DBMemoryMachineRepository;
import com.gerberjava.ownSpring.Repository.InMemoryMachineRepository;
import com.gerberjava.ownSpring.Repository.MachineRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class mainconfig
{
    @Bean( name ="inMemoryMachineRepo")
    @Profile("dev")
    public MachineRepository MemocreateMachineRepo()
    {
        MachineRepository repo = new InMemoryMachineRepository();
        return repo;
    }

     @Bean( name ="inDBMachineRepo")
     @Profile("DBdev")
    public MachineRepository DBcreateMachineRepo()
    {
        MachineRepository repo = new DBMemoryMachineRepository();
        return repo;
    }





}
