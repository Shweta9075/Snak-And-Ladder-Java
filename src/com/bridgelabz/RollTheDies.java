package com.bridgelabz;

public class RollTheDies {
    public static void main(String[] args) {
        int die1;
        int die2;
        int roll;
        die1 = (int) Math.floor(Math.random()*10)%6+1;
        die2 = (int) Math.floor(Math.random()*10)%6+1;
        roll = die1+die2;
        System.out.println("Frist die : " + die1);
        System.out.println("Second die : " + die2);
        System.out.println("Roll Of die : " + roll);
    }
}
