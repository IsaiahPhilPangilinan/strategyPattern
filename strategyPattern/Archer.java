package strategyPattern;

public class Archer implements CharacterType {

    public String attack() {
        String output = new String();
        ShootArrow shootArrow = new ShootArrow();

        output += "The Archer " + shootArrow.attack() + "\n";

        return output;
    }
    
    public String defend() {
        String output = new String();
        Shield shield = new Shield();

        output += "The Archer " + shield.defend() + "\n";

        return output;
    }

}
