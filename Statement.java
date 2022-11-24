import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = initResult(aCustomer.getName());
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
    abstract String initResult(String name);
    abstract String showFigures(String Title, String Charge);
    abstract String addFooterLines(String Charge, String TotalFrequentRenterPoints);
}