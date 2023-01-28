package com.example.demo1;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        VideoGame game1 = new VideoGame("Sony","Sonic","Adventure",4.0,20.5);
        VideoGame game2 = new VideoGame("FromSoftware","Elden Ring","Adventure",4.5,30.1);
        VideoGame game3 = new VideoGame("RockStar","GTA 5","Adventure",3.8,27.5);
        ShoppingCart mycart = new ShoppingCart();
        mycart.createCartForItems(game1);
        mycart.createCartForItems(game2);
        mycart.createCartForItems(game3);
        double totalCost = mycart.totalValue();
        System.out.println(totalCost);
        ArrayList<Double> myRatings = mycart.ratingsOfGames();
        System.out.println(myRatings);
        ArrayList<String> myGenre = mycart.genreOfGames();
        System.out.println(myGenre);
    }
}
