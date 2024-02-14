package strategyPattern;

public class Shield implements DefenseStrategy{

    public String defend() {
        String output = new String();

        output += "uses a shield to defend!";

        return output;
    }

}