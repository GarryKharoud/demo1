package com.example.demo1;

public class VideoGame
{
    private String gameCompany;
    private String gameName;
    private String gameGenre;
    private double gameRating;
    private double gamePrice;

    public VideoGame(String gameCompany, String gameName, String gameGenre, double gameRating, double gamePrice)
    {
        this.setGameCompany(gameCompany);
        this.setGameName(gameName);
        this.setGameGenre(gameGenre);
        this.setGameRating(gameRating);
        this.setGamePrice(gamePrice);
    }

    public String getGameCompany()
    {
        return gameCompany;
    }

    public void setGameCompany(String gameCompany)
    {
        this.gameCompany = gameCompany;
    }

    public String getGameName()
    {
        return gameName;
    }

    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }

    public String getGameGenre()
    {
        return gameGenre;
    }

    public void setGameGenre(String gameReleaseYear)
    {
        this.gameGenre = gameReleaseYear;
    }

    public double getGameRating()
    {
        return gameRating;
    }

    public void setGameRating(double gameRating)
    {
        this.gameRating = gameRating;
    }

    public double getGamePrice()
    {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice)
    {
        this.gamePrice = gamePrice;
    }
}
