package strategyPattern;

public class Knight implements CharacterType{

    public String attack() {
        String output = new String();
        SwingSword swingSword = new SwingSword();

        output += "The Knight " + swingSword.attack() + "\n";

        return output;
    }
    
    public String defend() {
        String output = new String();
        Shield shield = new Shield();
        Dodge dodge = new Dodge();
        CreateMagic createMagic = new CreateMagic();

        output += "The Knight " + shield.defend() + "\n" +
                  "The Knight " + dodge.defend() + "\n" +
                  "The Knight " + createMagic.defend() + "\n";

        return output;
    }

}
