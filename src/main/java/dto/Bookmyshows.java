package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Bookmyshows {
	@Id
	@GeneratedValue 
	private int bookingid;
	private String customer_name;
	private String movie_name;
	private int seat_number;
	private double ticket_price;
	private int no_of_ticket;
	
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}
	public double getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}
	public int getNo_of_ticket() {
		return no_of_ticket;
	}
	public void setNo_of_ticket(int no_of_ticket) {
		this.no_of_ticket = no_of_ticket;
	}
	
	public int getBookingid() {
		return bookingid;
	}
}
