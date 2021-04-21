package home_tasks;

import java.util.concurrent.SynchronousQueue;

public class Movie {
    public static void main(String[] args){
      String name = "The Fast and the Furious";
      String genre = "Race";
      int duration = 160;
      String releaseDate = "September 16.2020";
      char rating = 'R';
      int rottenTomatoesRating = 99;
      boolean sequels = true;
      boolean isOnDvd = false;

      System.out.println("                    ------ Welcome to the Cinema ------");
      System.out.println("Tonight we are streaming " + name + " which was released on " + releaseDate);
      System.out.println("This " + genre + " move got a " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
      System.out.println("This rating is " + rating + " and it runs for " + duration + " hours.");
      System.out.println("This is sequel " + sequels + " and is on dvd " + isOnDvd);
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("Move name is:     " + name);
      System.out.println("Genre is:         " + genre);
      System.out.println("Duration is:      " + duration);
      System.out.println("Release Date is:  " + releaseDate);
      System.out.println("Rating is:        " + rating);





    }
}
