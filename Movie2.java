
public class Movie2{
	public static final int CHILDRENS=2; 
	public static final int REGULAR=0;
	public static final int NEW_RELEASE=1;
	private String _title ;
	private int _priceCode;
	public Movie2(String title,int priceCode) {
		this._title=title;//�����������
		this._priceCode=priceCode;	
	}
	public int getPriceCode() {
		return _priceCode;
	}
	public void setPriceCode(int arg) {
		this._priceCode=arg;
	}
	public String getTitle() {
		return _title;
	}
	int getFrequentRenterPoints(int daysRented) {
		if((getPriceCode()==Movie.NEW_RELEASE)&&daysRented>1)
				return 2;
		else
			return 1;
	}
/*double getCharge(int daysRented) {
	double  result=0;
	switch(getPriceCode()) {
	case Movie.REGULAR:
		result+=2;
		if(daysRented>2)
			result+=(daysRented-2)*1.5;
		break;
	case Movie.NEW_RELEASE:
		result+=1.5;
		if(daysRented>3)
			result+=(daysRented-3)*1.5;
		break;
	}
	return result;
}
*/
}