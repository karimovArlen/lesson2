package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(goTo(generateRandomAge(), 26));
        System.out.println(goTo(generateRandomAge(), 27));
        System.out.println(goTo(generateRandomAge(), 34));
        System.out.println(goTo(generateRandomAge(), 27));
        System.out.println(goTo(generateRandomAge(), 26));

    }

    public static String goTo(int age,int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30)
            return "Можно идти гулять1";
        else if (age < 20 && temp > 0 &&  temp< 28)
            return "Можно идти гулять2";
        else if (age > 45 && temp > -10 && temp < 25)
            return "Можно идти гулять3";
        else return "Оставайтесь дома";
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(99);
    }
}
