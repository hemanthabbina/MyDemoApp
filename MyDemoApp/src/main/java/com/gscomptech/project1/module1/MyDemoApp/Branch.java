package com.gscomptech.project1.module1.MyDemoApp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Branch {

    public void printBranch() {
        System.out.println("I'm in branch");
    }
}
