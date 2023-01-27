package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        videoGames game1 = new videoGames("Sony","Sonic","Adventure",4.0,20.5);
        videoGames game2 = new videoGames("FromSoftware","Elden Ring","Adventure",4.5,30.1);
        videoGames game3 = new videoGames("RockStar","GTA 5","Adventure",3.8,27.5);

        ArrayList<videoGames> mylist = new ArrayList();
        mylist.add(game1);
        mylist.add(game2);
        mylist.add(game3);
        shoppingCart mycart = new shoppingCart(mylist);
        mycart.ratingsOfGames();
        mycart.totalValue();
        mycart.genreOfGames();
    }
}
