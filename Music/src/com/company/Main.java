package com.company;

import java.util.Random;

public class Main {
    static Random rn = new Random();

    public static void main(String[] args) {
        int base = 4;
        int beats =4;
        int length=rn.nextInt(5)+2;
        int tracks=4;
        while (beats > base) {
            beats = rn.nextInt(10) + 1;
        }
        out("Time " + beats + "/" + base);
        for(int i=0;i<tracks;i++) {//comms
            for (int a = 0; a < length; a++) {
                for (int b = 0; b <beats;b++){
                    int x = noteCalc();
                    int c='A';
                    if(b==0) {
                        outa("| ");
                    }
                    if (rn.nextFloat()<.4) {
                        outa((char)(c+x) + " ");
                    } else if (rn.nextBoolean()) {
                        outa("--");
                    }
                    else outa(", ");
                }
            }
            out("");//..

        }
    }

    public static void out(String s) {
        System.out.println(s);
    }

    public static void outa(String s) {
        System.out.print(s);
    }

    public static int noteCalc() {
        int x= (((rn.nextInt() * 1000)) / (rn.nextInt(16) + rn.nextInt()) + 60 + rn.nextInt(6)) % 7;
        while(x<0)
        {
            x= (((rn.nextInt() * 1000)) / (rn.nextInt(16) + rn.nextInt()) + 60 + rn.nextInt(6)) % 7;
        }
        return x;
    }
}
