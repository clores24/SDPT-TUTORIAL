package Polymorphism;

public class Songs {
    
    String song = "Song";
    String songTitle, genre;
    int year;

    Songs(){
        // to make other classes accesible without constructor
    }
    
    Songs(String songTitle, String genre, int year){
        this.songTitle = songTitle;
        this.genre = genre;
        this.year = year;
    }

    void songDetails(){
        System.out.println("Song Title: "+ songTitle);
        System.out.println("Genre: "+ genre);
        System.out.println("Year release: "+ year);
    }

    void songType(Songs songs){
        System.out.println(songTitle + " is a type of " + songs.song);
    }


}
