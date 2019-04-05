package com.edvardas;

import java.time.LocalTime;

public class Films implements Methods {

    private Film[] arr;

    public Films(Film[] arr) {
        this.arr = arr;
    }

    /**
     * @param arr Passing an array of films
     * @return Returns the oldest film in the array
     */

    public Film findOldestFilm(Film[] arr) {
        int min = Integer.MAX_VALUE;
        int index;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i].getProductionYear()) {
                index = i;
                return arr[index];
            }
        }

        return null;
    }

    /**
     * @param arr Passing an array of films
     * @return Returns the newest film in the array
     */

    public Film findNewestFilm(Film[] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].getProductionYear()) {
                max = arr[i].getProductionYear();
                index = i;
            }
        }

        return arr[index];
    }

    /**
     * @param arr Passing an array of films
     * @return Returns the film with the longest name
     */

    public Film longestName(Film[] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].getName().length()) {
                max = arr[i].getName().length();
                index = i;
            }
        }

        return arr[index];
    }

    /**
     * @param arr Passing an array of films
     * @return Returns the film with the longest run time
     */

    public Film findLongestRunning(Film[] arr) {
        LocalTime max = LocalTime.of(0,0);
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max.isBefore(arr[i].getRunTime())) {
                max = arr[i].getRunTime();
                index = i;
            }
        }
        return arr[index];
    }

    /**
     * @param arr Passing an array of films
     * @return Returns the most viewed film
     */

    public Film findMostViewed(Film[] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].getViewerCount()) {
                max = arr[i].getViewerCount();
                index = i;
            }
        }
        return arr[index];
    }

    public String toString() {
        return "Oldest film = " + findOldestFilm(arr).getName() +
                "\nNewest film = " + findNewestFilm(arr).getName() +
                "\nFilm with longest name = " + longestName(arr).getName() +
                "\nLongest running film = " + findLongestRunning(arr).getName() +
                "\nMost viewed film = " + findMostViewed(arr).getName();
    }
}
