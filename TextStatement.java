import java.util.Enumeration;

public class TextStatement extends Statement {
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = result(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += showFigures(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
        }
        //add footer lines
        result += addFooterLines(String.valueOf(aCustomer.getTotalCharge()),
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
        return result;
    }
   
    private String result(String name){
        return "Rental Record for" + name + "\n";
    }
    private String showFigures(String Title, String Charge)
    {
        return "\t" + Title+ "\t" + Charge + "\n";
    }
    private String addFooterLines(String Charge, String TotalFrequentRenterPoints){
        String increment = "";
        increment += "Amount owed is " + Charge + "\n";
        increment += "You earned " + TotalFrequentRenterPoints + " frequent renter points";
        return increment;
    }
}