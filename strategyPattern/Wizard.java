package strategyPattern;

public class Wizard implements CharacterType {

    public String attack() {
        String output = new String();
        CastSpell castSpell = new CastSpell();

        output += "The Wizard " + castSpell.attack() + "\n";

        return output;
    }
    
    public String defend() {
        String output = new String();
        CreateMagic createMagic = new CreateMagic();

        output += "The Wizard " + createMagic.defend() + "\n";

        return output;
    }

}