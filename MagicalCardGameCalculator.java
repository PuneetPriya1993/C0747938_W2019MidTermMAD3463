package com.lambton.magicalcardgame;


public class MagicalCardGameCalculator
{

//    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel);
//    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel);
//    public String getFinalResult(MagicalCardGameModel magicalCardGameModel);


        public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel){
            int rowNumber = 0;
            int columnNumber = 0;
            String [][] cards1 = magicalCardGameModel.getCardList();
            int tempArray [][]=new int[2][2];
            String firstShuffleColPos = magicalCardGameModel.firstShuffleColPos;
            columnNumber = Integer.parseInt(firstShuffleColPos.substring(1,2));
            if(firstShuffleColPos.contains("A"))
            {
                rowNumber =0;

            }
            else if (firstShuffleColPos.contains("B"))
            {
                rowNumber =1;
            }
            else if (firstShuffleColPos.contains("C"))
            {
                rowNumber = 2;
            }

            return cards1;
        }

    }





