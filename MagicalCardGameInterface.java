package com.lambton.magicalcardgame;

interface MagicalCardGameModelInterface
{
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel);
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel);
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel);
}