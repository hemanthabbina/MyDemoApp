package com.gscomptech.project1.module1.MyDemoApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class College {

    @Autowired
    private Branch myBranch;
    public void print() {
        System.out.println("I'm in College");
        myBranch.printBranch();
    }
}
