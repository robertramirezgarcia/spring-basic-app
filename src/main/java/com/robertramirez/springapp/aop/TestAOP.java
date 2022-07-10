package com.robertramirez.springapp.aop;

import org.springframework.stereotype.Component;

@Component
public class TestAOP {
    
    @TimeMonitor
    public void performSomeTask(){
        //Bussiness Logic
        System.out.print("implementing aspects \n");
    }
}
