package inheritance;

public class DemoTaxation {
	public static void main(String[] args) {
		IncomeTax incomeTax = new IncomeTax();
	    Gst gst = new Gst();
		int Tax = gst.calculateTax(10000);
		System.out.println("tax is "+Tax);
	}
	
}


