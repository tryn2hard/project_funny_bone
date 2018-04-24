package com.example.jokelib;


import java.util.Random;


public class JavaJoke {

    public String selectedJoke;

    public String getJoke() {

        jokeSelector();

        return selectedJoke;
    }

    public void jokeSelector() {

        Random rand = new Random();

        int n = rand.nextInt(2);

        switch (n) {
            case 0:
                selectedJoke = "Best joke ever!";
                break;
            case 1:
                selectedJoke = "2nd best joke ever!";
                break;
            default:
                selectedJoke = "Best joke ever!";
                break;

        }

    }

}

