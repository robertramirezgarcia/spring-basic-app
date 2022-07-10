package com.robertramirez.springapp.aop;

public class TestAOP {
    
    public void performSomeTask(){
        long start = System.currentTimeMillis();
        //Bussiness Logic
        long executionTime = System.currentTimeMillis() - start;
        System.out.println("Time taken: " + executionTime + " ms");
    }
}
