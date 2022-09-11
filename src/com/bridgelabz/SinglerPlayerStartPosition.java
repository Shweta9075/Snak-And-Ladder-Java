package com.bridgelabz;

public class SinglerPlayerStartPosition {

    public static void main(String[] args) {
        int playerPosition = 0;
        int afterRolling =(int) Math.floor(Math.random()*10)%6+1;
        System.out.println("After Rolling position : " + afterRolling);
    }
}
