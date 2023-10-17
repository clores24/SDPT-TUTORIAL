package Interface;

public class GalaxyTabS9Plus implements Samsung {
    String words;
    public void price(int price){
        System.out.println(price);
    }

    public void words(String words){
        this.words = words;
        System.out.println(words);
        
    }
}
