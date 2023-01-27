package com.example.demo1;

import java.util.ArrayList;

public class shoppingCart
{
    private ArrayList gamesAdded = new ArrayList();

    public shoppingCart(ArrayList gamesAdded)
    {
        this.setGamesAdded(gamesAdded);
    }

    public ArrayList getGamesAdded()
    {
        return gamesAdded;
    }

    public void setGamesAdded(ArrayList gamesAdded)
    {
        this.gamesAdded = gamesAdded;
    }
    public void totalValue()
    {
        double totalCost=0;
        for(int i=0;i<gamesAdded.size();i++)
        {
            totalCost = ((videoGames) gamesAdded.get(i)).getGamePrice()+totalCost;
        }
        System.out.println(totalCost);
    }
    public void ratingsOfGames()
    {
        for(int i=0;i<gamesAdded.size();i++)
        {
            System.out.println(((videoGames) gamesAdded.get(i)).getGameRating());
        }
    }
    public void genreOfGames()
    {
        for(int i=0;i<gamesAdded.size();i++)
        {
            System.out.println(((videoGames) gamesAdded.get(i)).getgameGenre());
        }
    }
}
