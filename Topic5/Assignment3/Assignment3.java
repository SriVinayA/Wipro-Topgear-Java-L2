package Topic5.Assignment3;

import Topic5.Assignment3.automobile.Honda;
import Topic5.Assignment3.automobile.twowheeler.Hero;

public class Assignment3 {
    public static void main(String[] args) {

        Hero hero = new Hero("Hero Moto", "DL12345", "SARA", 80);
        hero.getModelName();
        hero.getRegistrationNumber();
        hero.getOwnerName();
        hero.getSpeed();
        hero.getRadio();

        System.out.println();

        Honda honda = new Honda("Honda City", "TARA", "TN12345", 100);
        honda.getModelName();
        honda.getRegistrationNumber();
        honda.getOwnerName();
        honda.getSpeed();
        honda.CdPlayer();

        System.out.println();
    }
}