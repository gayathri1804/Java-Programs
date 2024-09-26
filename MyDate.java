package relationship;

public class MyDate {
	int dd,mm,yy;
	
	public MyDate() {
		dd = 18;
		mm = 04;
		yy = 2002;
	}
	
	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display() {
		System.out.println("Date:"+dd+"-"+mm+"-"+yy);
	}
}
