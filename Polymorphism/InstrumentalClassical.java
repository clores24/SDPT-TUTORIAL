package Polymorphism;

public class InstrumentalClassical extends Songs{
    String piano, guitar;

    InstrumentalClassical(String songTitle, String genre, int year, String piano, String guitar){
        super(songTitle, genre, year);
        this.piano = piano;
        this.guitar = guitar;

            System.out.println("Instrumental, Clasiical Music");
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
