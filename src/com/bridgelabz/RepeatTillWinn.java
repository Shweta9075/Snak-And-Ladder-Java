package com.bridgelabz;

public class RepeatTillWinn {
    static final int noPlay = 0;
    static final int ladder = 1;
    public static void main(String[] args) {
        int playerStartPosition = 0;
        int WinningPosition = 100;
        while(playerStartPosition <= WinningPosition) {
            int NumAfterRolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Number of rolling after dice by the player : " + NumAfterRolling);
            int CheckOption = (int) Math.floor(Math.random() * 10) % 3 + 1;
            switch (CheckOption) {
                case noPlay:
                    System.out.println("Player is not playing at the same position");
                    break;
                case ladder:
                    playerStartPosition = NumAfterRolling + playerStartPosition;
                    if(playerStartPosition > WinningPosition)
                        playerStartPosition = WinningPosition - NumAfterRolling;

                    System.out.println("Player move the position : " + playerStartPosition);
                    break;
                default:
                    playerStartPosition = NumAfterRolling - playerStartPosition;
                    if(playerStartPosition < 0)
                        playerStartPosition = 0;
                    System.out.println("Snack the player behind the position : " + playerStartPosition);
            }
        }
    }
    }
