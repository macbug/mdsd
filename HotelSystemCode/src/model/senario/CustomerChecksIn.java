package model.senario;

import java.awt.image.RescaleOp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import model.Booking;
import model.BookingController;
import model.BookingExpert;
import model.DatabaseInterface;
import model.ExpenseExpert;
import model.ModelFactory;
import model.PromotionExpert;
import model.ReceiptExpert;
import model.ReceptionistController;
import model.Resident;
import model.Room;
import model.RoomExpert;
import model.UserExpert;
import model.impl.ModelFactoryImpl;

public class CustomerChecksIn {
	public static void main(String[] args) {
		
		ModelFactory mf = ModelFactoryImpl.init();
		DatabaseInterface db = mf.createMSAccessDB();
		
		ExpenseExpert expenseExpert = mf.createExpenseExpert();
		expenseExpert.ExpenseExpert(db);
		
		RoomExpert roomExpert = mf.createRoomExpert();
		roomExpert.RoomExpert(db);
		
		UserExpert userExpert = mf.createUserExpert();
		userExpert.UserExpert(db);
		
		PromotionExpert promotionExpert = mf.createPromotionExpert();
		promotionExpert.PromotionExpert(db);
		
		ReceiptExpert receiptExpert = mf.createReceiptExpert();
		receiptExpert.ReceiptExpert(db);
		
		BookingExpert bookingExpert = mf.createBookingExpert();
		bookingExpert.BookingExpert(db);
		
		ReceptionistController receptionistController = mf.createReceptionistController();
		receptionistController.ReceptionistController(receiptExpert, expenseExpert, roomExpert, bookingExpert, promotionExpert, userExpert);
		
		BookingController bookingController = mf.createBookingController();
		
		//Receptionist Login
		//Get booking, searches for all bookings made today, under the surname "Greenman"
		Calendar frDate = Calendar.getInstance();
		Calendar myCalendar = new GregorianCalendar(2015, 1, 20);
		Date toDate = myCalendar.getTime();

		System.out.println("Receptionist will now try to check you in with your provided credentials");
		Booking booking = null;
		boolean bookingExists = true;
		try {
			System.out.println("Searching for bookings in your last name, Greenman, between the dates " +frDate.getTime() +" and "+toDate);
			booking = receptionistController.viewAllBookings("Greenman", frDate.getTime(), toDate).get(0);
		} catch (Exception ne) {
			bookingExists = false;
		}
		if (bookingExists) {
			EList<Room> bookedrooms = new BasicEList<Room>();
			EList<Resident> resList = new BasicEList<Resident>();
			Resident resOne = receptionistController.createResident("Magne" , "Herne", "8918286545");
			Resident resTwo = receptionistController.createResident("Alex" , "Herne", "8314286545");
			Resident resThree = receptionistController.createResident("Joel" , "Herne", "8518286545");
			Resident resFour = receptionistController.createResident("Niklers" , "Bjirne", "8228286545");
			resList.add(resOne);
			resList.add(resTwo);
			resList.add(resThree);
			resList.add(resFour);
			Map<String, Integer> freq = new HashMap<String, Integer>();
		for (String roomType : booking.getRoomTypes()) {
			if (freq.containsKey(roomType)) {
				freq.put(roomType, freq.get(roomType) + 1);
			} else {
				freq.put(roomType, 1);
			}
		}
		//Get available rooms 

		for (Map.Entry<String, Integer> entry : freq.entrySet()) {
			EList<Room> room = receptionistController.viewUnOccupiedRooms(entry.getKey());
			for (int i = 0; i<entry.getValue();i++) {
				bookedrooms.add(room.get(i));
				System.out.println("Added a " +room.get(i).getType() +" room to the booking, this is room " +i+" of " +entry.getValue() +" of this type, \n" + "this room has the number " +room.get(i).getNumber());
				//Fill rooms with residents
			}
		}
		for (Room r : bookedrooms) {
			 for (int i = 0; i < r.getBeds();i++) {
				r.getResidents().add(resList.get(i));
				System.out.println("Added resident " +resList.get(i).getFirstName() +" to a room in the booking");
				resList.remove(i);
			 }
			 booking.getRoom().add(r);
		}
		//Check in booking
		System.out.println(receptionistController.checkIn(booking, bookedrooms));
		}
		else {
			System.out.println("No booking existed, or the data was incorrect");
		}
	}
}
