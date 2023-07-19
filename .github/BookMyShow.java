import java.util.Scanner;

class Theatre
{
	int seats = 100;
	static Theatre t= null;
	private Theatre() { }
	
	public static Theatre getInstance() 
	{
		if(t==null) t=new Theatre();
		return t;
	}
	public void reserveSeats(int numOfSeats) 
	{
		if(numOfSeats>seats)
		{
			System.out.println(numOfSeats+"Seats are Availble !");
			System.out.println(seats+"Seats are Not Availble");
			return;
		}
		seats=seats-numOfSeats;
		System.out.println(numOfSeats+"Seats are Reserved !");
		System.out.println(seats+"Seats are Available !");
	}
}
class BookingApp
{	public void bookTickets()
	{
		System.out.print("Enter Number of Tickets to Booked :");
		int tickets= new Scanner(System.in).nextInt();
		
		Theatre theatre =Theatre.getInstance();
		theatre.reserveSeats(tickets);
	}
}
public class BookMyShow 
{
	public static void main(String[] args) 
	{	
			BookingApp customer1=new BookingApp();
			customer1.bookTickets();
			
			BookingApp customer2=new BookingApp();
			customer2.bookTickets();
			
			BookingApp customer3=new BookingApp();
			customer3.bookTickets();
			
			BookingApp customer4=new BookingApp();
			customer4.bookTickets();
			
			BookingApp customer5=new BookingApp();
			customer5.bookTickets();
	}
}
