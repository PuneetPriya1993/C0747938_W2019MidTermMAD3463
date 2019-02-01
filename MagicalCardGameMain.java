package com.lambton.magicalcardgame;

import java.util.Scanner;

public class MagicalCardGameMain
{
    public static void main (String args[])
        {
            MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();

            String [][]cards = {{"1","A","5"},{"2","7","3"},{"3","6","K"}};
            System.out.println("Select one card please");

    for (int i=0;i<cards.length;i++)
            {
                for (int j=0;j<cards.length;j++)
                {
                    System.out.print(cards[i][j]);
                    System.out.print(" , ");
                }
                System.out.println(" ");
            }


            magicalCardGameModel.setCardList(cards);


            Scanner scanner = new Scanner(System.in);
            System.out.println("Tell me, your column number please");
            String FirstShuffleColPos = scanner.nextLine();
            magicalCardGameModel.setFirstShuffleColPos(FirstShuffleColPos);


        }
    }




