
	import java.util.Enumeration;
	import java.util.Vector;
	class Customer3{
	private String _name;
	private Vector _rentals=new Vector();
		 public Customer3(String name) {
			 this._name=_name;	 
		 };
		 public void addRental(Rental arg) {
			 this._rentals.addElement(arg);
		 }
		 public String getName() {
			 return _name;
		 };
		 //����
	public String statement() {
		
	}
		//  double totalAmount=0;
		//int frequentRenterPoints=0;
		Enumeration rentals=_rentals.elements();
		String result="Rental Record for"+getName()
	+"\n";
		
	while(rentals.hasMoreElements()) {
		Rental each=(Rental) rentals.nextElement();
		//frequentRenterPoints+=each.getFrequentRenterpoints();
		/*double thisAmount=0;
		Rental each=(Rental)rentals.nextElement();
		*/
		/*
		//determine amounts for each line
		switch(each.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			thisAmount+=2;
			if(each.getDaysRented()>2)
				thisAmount+=(each.getDaysRented()-2)*1.5;
			break;
		case Movie.NEW_RELEASE:
			thisAmount+=1.5;
			if(each.getDaysRented()>3)
				thisAmount+=(each.getDaysRented()-3)*1.5;
			break;
		}
		*/
		//add frequent renter points
		//frequentRenterPoints++;
		//add bonus for a two day new release rental
	//	if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&each.getDaysRented()>1)
		//		frequentRenterPoints++;
			//show figure for this rental
		result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
	//	totalAmount+=each.getCharge();
	}
			
		//add footer lines
	result+="Amount owed is"+String.valueOf(getTotalCharge())+"\n";
	result+="You earned "+String.valueOf(getTotalFrequentRenterPoints())+"frequent renter points";
	return result;	
	}
	private int getTotalFrequentRenterPoints() {
		int result;
		Enumeration rentals=_rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each=(Rental)rentals.nextElement();
			result+=each.getFrequentRenterPoints();
		}
		return result;
	}
	
	
	
	
	/*private double getTotalCharge() {
		double result=0;
		Enumeration rentals=_rentals.elements();
		while(rentals.hasMoreElements()) {
		Rental each=(Rental) rentals.nextElement();
		result+=each.getCharge();
		}
		return result;
	}
	}
	//private double amountFor(Rental aRental) {
	
	/*double getCharge() {
		double  result=0;
		switch(aRental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result+=2;
			if(aRental.getDaysRented()>2)
				result+=(aRental.getDaysRented()-2)*1.5;
			break;
		case Movie.NEW_RELEASE:
			result+=1.5;
			if(aRental.getDaysRented()>3)
				result+=(aRental.getDaysRented()-3)*1.5;
			break;
		}
		return result;
	}
	*/
	*/
	
	//}


