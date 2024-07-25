package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TvMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        System.out.println("TV Show Menu");
        System.out.println("Enter nothing to stop the loop.");

        while (true) {
            System.out.println("Enter the name of a show:");
            String showName = scanner.nextLine();
            if (showName == null || showName.isEmpty()) {
                break;
            } else {
                System.out.println("How many episodes does it have?");
                int episodes = scanner.nextInt();
                scanner.nextLine(); // This is why it wasn't grabbing the genre! Maybe it's the type change?
                if (episodes <= 0) {
                    break;
                } else {
                    System.out.println("What is the genre of the show?");
                    String genre = scanner.nextLine();

                    TvShow tvShow = new TvShow(showName, episodes, genre);
                    tvShows.add(tvShow);
                }
            }

        }
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
