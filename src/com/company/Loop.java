package com.company;

public class Loop {
    public static void main(String... args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i<3){
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            j++;
            System.out.println(j);
        }while (j<3);
    }
}
