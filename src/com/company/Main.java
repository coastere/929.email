package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        HashSet<String> emailset = new HashSet<>();
        for (String email:emails) {
            char[] schars=email.toCharArray();
            StringBuilder sb = new StringBuilder();

            boolean ignone=false;
            boolean domain=false;
            for (int i = 0; i <schars.length ; i++) {
                if (!domain) {
                    if (!ignone && schars[i] != '+' && schars[i] != '@') {
                        if (schars[i] != '.') {
                            sb.append(schars[i]);
                        }
                    }
                    if (schars[i] == '+') {
                        ignone = true;
                    }
                    if (schars[i] == '@') {
                        domain = true;
                        sb.append(schars[i]);
                    }
                }
                else {
                    sb.append(schars[i]);
                }
            }
            emailset.add(sb.toString());
        }
        emailset.size();

        for (String s : emailset
        ) {
            System.out.println(s);

        }



    }

}
