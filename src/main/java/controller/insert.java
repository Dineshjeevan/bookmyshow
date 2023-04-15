package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Bookmyshowdao;
import dto.Bookmyshows;

public class insert extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String s1=req.getParameter("name");
		String s2=req.getParameter("movies");
		String s3=req.getParameter("seat");
		String s5=req.getParameter("noofticket");
	
	int a=Integer.parseInt(s3);
	int c=Integer.parseInt(s5);
	double b=c*250;
	
	 Bookmyshows bookmyshows=new Bookmyshows();
	  bookmyshows.setCustomer_name(s1);
	  bookmyshows.setMovie_name(s2);
	  bookmyshows.setSeat_number(a); 
	  bookmyshows.setNo_of_ticket(c);
	   bookmyshows.setTicket_price(b);
	  Bookmyshowdao bookmyshowdao=new Bookmyshowdao();
	  bookmyshowdao.insert(bookmyshows);
	
	
	}
	  
	  
	
}
