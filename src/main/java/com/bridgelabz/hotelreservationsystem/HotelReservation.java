package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation 
{
	private static Scanner scanner = new Scanner(System.in);

	public static void main( String[] args )
    {
        System.out.println("***********************Welcome to the Hotel Reservation Program**********************" );
       
        List<Hotel> hotels = new ArrayList<Hotel>();
        HotelReservation hotelReservation = new HotelReservation();
        
        //Option
        int ch = 1;
        int chooseHotel = 0;
        do {
        	System.out.println("Select Menu... below one");
        	System.out.println("1 => Add Hotel \n2 => Display Hotels");
        	System.out.println("Enter your choice...");
        	chooseHotel = scanner.nextInt();
        	
        	switch(chooseHotel) {
        	case 1 : hotelReservation.addHotel(hotels);
        		break;
        	case 2 : hotelReservation.displayHotels(hotels);
    			break;
        	default :
        		break;
        	}
        	System.out.println("Do you want to contineu... press 1 else any..");
        	ch = scanner.nextInt();
        }while(ch == 1);
    }
    
    public void addHotel(List<Hotel> hotels) {
    	System.out.println("Enter the Hotel Name");
    	String hotelName = scanner.next();
    	System.out.println("Enter the Type of Customer");
    	String typeCustomer = scanner.next();
    	System.out.println("Enter the rates");
    	int rates = scanner.nextInt();
    	Hotel hotel = new Hotel(hotelName, typeCustomer, rates);
    	hotels.add(hotel);
    }
    
    public void displayHotels(List<Hotel> hotels) {
    	System.out.println(hotels);
    }
}
