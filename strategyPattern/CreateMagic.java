package strategyPattern;

public class CreateMagic implements DefenseStrategy{
    
    public String defend() {
        String output = new String();

        output += "creates a magic barrier for defense!";

        return output;
    }

}
