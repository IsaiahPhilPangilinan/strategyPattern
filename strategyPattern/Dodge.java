package strategyPattern;

public class Dodge implements DefenseStrategy{

    public String defend() {
        String output = new String();

        output += "is dodging to avoid attack!";

        return output;
    }
    
}
