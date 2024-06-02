package demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Continents {

    int continent;

    public Continents(int continent) {
        this.continent = continent;
        switch (continent){
            case 1:
                System.out.println("North America: Mexico City, Mexico.");
                break;
            case 2:
                System.out.println("South America: Sao Paulo, Brazil.");
                break;
            case 3:
                System.out.println("Europe: Moscow, Russia.");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria.");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China.");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia.");
                break;
            case 7:
                System.out.println("Antarctica: McMurder Station, US.");
                break;
            default:
                System.out.println("Undefined continent!");

        }
    }

    public static void main(String[] args) {
        new Continents(4);

        String[] favoriteSongs = {"a","b","c","d","e","f","g","h","i","j"};
        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("k");
        desertIslandPlaylist.add("l");
        desertIslandPlaylist.add("m");
        desertIslandPlaylist.add("n");
        desertIslandPlaylist.add("o");
        System.out.println(desertIslandPlaylist);
        Collections.reverse(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);
        List<String> songs = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        desertIslandPlaylist.addAll(songs);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        System.out.println(desertIslandPlaylist);
        int tempN = desertIslandPlaylist.indexOf("n");
        int tempG = desertIslandPlaylist.indexOf("g");
        desertIslandPlaylist.set(tempN,"g");
        desertIslandPlaylist.set(tempG,"n");
        System.out.println(desertIslandPlaylist);
    }

}
