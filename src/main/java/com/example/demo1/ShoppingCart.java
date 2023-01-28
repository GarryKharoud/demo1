package com.example.demo1;

import java.util.ArrayList;

public class ShoppingCart
{
    private ArrayList<VideoGame> cart = new ArrayList();

    public void createCartForItems(VideoGame videoGame)
    {
        cart.add(videoGame);
    }
    public double totalValue()
    {
        double totalCost=0;
        for(int i = 0; i< cart.size(); i++)
        {
            totalCost = ((VideoGame) cart.get(i)).getGamePrice()+totalCost;
        }
        return totalCost;
    }
    public ArrayList ratingsOfGames()
    {
        ArrayList<Double> allRatings= new ArrayList<Double>();
        for (VideoGame myGame:cart)
        {
            allRatings.add(myGame.getGameRating());
        }
        return  allRatings;
    }
    public ArrayList genreOfGames()
    {
        ArrayList<String> allGenres= new ArrayList<String>();
        for (VideoGame myGame:cart)
        {
            allGenres.add(myGame.getGameGenre());
        }
        return allGenres;
    }
}
