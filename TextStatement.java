import java.util.Enumeration;

public class TextStatement extends Statement {
   
    public String initResult(String name){
        return "Rental Record for" + name + "\n";
    }
    public String showFigures(String Title, String Charge){
        return "\t" + Title+ "\t" + Charge + "\n";
    }
    public String addFooterLines(String Charge, String TotalFrequentRenterPoints){
        String increment = "";
        increment += "Amount owed is " + Charge + "\n";
        increment += "You earned " + TotalFrequentRenterPoints + " frequent renter points";
        return increment;
    }
}