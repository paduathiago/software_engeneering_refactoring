import java.util.Enumeration;

public class HtmlStatement extends Statement {
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = result(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += showFigures(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
        }
        //add footer lines
        result += addFooterLines(String.valueOf(aCustomer.getTotalCharge()),
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
        return result;
    }

    private String result(String name){
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }
    private String showFigures(String Title, String Charge)
    {
        return Title + ": " + Charge + "<BR>\n";
    }
    private String addFooterLines(String Charge, String TotalFrequentRenterPoints){
        String increment = "";
        increment += "<P>You owe <EM>" + Charge + "</EM><P>\n";
        increment += "On this rental you earned <EM>" + TotalFrequentRenterPoints + "</EM> frequent renter points<P>";
        return increment;
    }
}