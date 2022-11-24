import java.util.Enumeration;

public class HtmlStatement extends Statement {
    
    public String initResult(String name){
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }
    public String showFigures(String Title, String Charge){
        return Title + ": " + Charge + "<BR>\n";
    }
    public String addFooterLines(String Charge, String TotalFrequentRenterPoints){
        String increment = "";
        increment += "<P>You owe <EM>" + Charge + "</EM><P>\n";
        increment += "On this rental you earned <EM>" + TotalFrequentRenterPoints + "</EM> frequent renter points<P>";
        return increment;
    }
}