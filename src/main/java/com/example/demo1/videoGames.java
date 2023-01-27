package com.example.demo1;

public class videoGames
{
    private String gameCompany;
    private String gameName;
    private String gameGenre;
    private double gameRating;
    private double gamePrice;

    public videoGames(String gameCompany, String gameName, String gameGenre, double gameRating, double gamePrice)
    {
        this.setGameCompany(gameCompany);
        this.setGameName(gameName);
        this.setgameGenre(gameGenre);
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

    public String getgameGenre()
    {
        return gameGenre;
    }

    public void setgameGenre(String gameReleaseYear)
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
