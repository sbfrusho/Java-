package com.cseru;

import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount ba = new BankAccount(new int[]{1000, 6000, 600000, 100, 812963});
        ba.formatTo(new Formatter(),1,20,1);
    }
}
