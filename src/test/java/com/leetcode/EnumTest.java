package com.leetcode;


import java.util.Scanner;

public enum EnumTest {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String abreviation;

    private EnumTest(String abreviation){
        this.abreviation=abreviation;
    }

    public String getAbreviation(){
        return abreviation;
    }

}

class Test{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a size:(small,medium,large,extra_large)");
        String input=scanner.next().toUpperCase();
        EnumTest enumTest=Enum.valueOf(EnumTest.class, input);
        System.out.println("enumTest="+enumTest);
        System.out.println("abr="+enumTest.getAbreviation());
        if(enumTest==EnumTest.SMALL){
            System.out.println("helo");
        }
    }
}
