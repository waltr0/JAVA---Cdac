package ass2;
public class Date{
		private int month;
		private int day;
		private int year;
		public Date(int month,int day,int year){
			this.month=month;
			this.day=day;
			this.year=year;
		}
		public void setMonth(int month) {
			this.month=month;
		}
		public void setDay(int day) {
			this.day=day;
		}
		public void setYear(int year) {
			this.year=year;
		}
		public void getMonth(int month) {
			this.month=month;
		}
		public void getDay(int day) {
			this.day=day;
		}
		public void getYear(int year) {
			this.year=year;
		}
		public void displayDate() {
		System.out.println(+month+"/"+day+"/"+year);
		}		
public static void main(String[] args) {
    Date nd=new Date(6,27,2025);
    nd.displayDate();
    nd.setMonth(11);
    nd.setDay(03);
    nd.setYear(2098);
    System.out.println("remaining time:");
    nd.displayDate();
}
}