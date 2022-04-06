package com.cseru;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

public class BankAccount implements Formattable {
    private int[] BankBalance = new int[5];
    public BankAccount(int[] arr){
        for (int i = 0; i < 5; i++) {
            BankBalance[i] = arr[i];
        }
    }

    public void formatTo(Formatter formatter, int flag, int width, int precision){
        Appendable a = formatter.out();
        for (int i = 0; i < BankBalance.length; i++) {
            String bb = String.valueOf(BankBalance[i]);
            while (bb.length() < width) {
                bb = " " + bb;
            }
            try {
                a.append(bb);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(bb);
        }
    }
}
