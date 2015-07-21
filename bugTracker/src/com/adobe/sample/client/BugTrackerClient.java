/**
 * 
 */
package com.adobe.sample.client;

import java.util.Date;
import java.util.Iterator;

import com.adobe.sample.dao.BugTrackerDao;
import com.adobe.sample.entity.Employee;
import com.adobe.sample.entity.Ticket;
import com.adobe.sample.mem.BugTrackerDatMemImple;
import com.adobe.sample.util.KeyboardUtil;

/**
 * @author Shagun Sodhani
 *
 */
public class BugTrackerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BugTrackerDao trackerDao = new BugTrackerDatMemImple(); 
		while(true){
			printMenu();
			int choice = KeyboardUtil.getInt(" \nEnter choice : 1, 2, 3 or 4");
			switch (choice) {
			case 1:
				Ticket ticket = new Ticket();
				int empId = KeyboardUtil.getInt("\nEnter Employee Id : ");
				ticket.setRaisedBy(trackerDao.getEmployee(empId));
				String desc = KeyboardUtil.getString("\nEnter ticket description");
				ticket.setDescription(desc);
				ticket.setRaisedDate(new Date());
				trackerDao.raiseTicket(ticket);
				break;
			case 2:
				Ticket[] tickets = trackerDao.getOpenTickets();
				for (Ticket tkt : tickets) {
					System.out.printf("%4d%20s%20s", tkt.getId(), tkt.getDescription(), tkt.getRaisedBy().getName());
					System.out.print("\n");
				}
				Ticket resolveTicket = trackerDao.getTicket(KeyboardUtil.getInt("\nEnter Ticket Id"));
				empId = KeyboardUtil.getInt("\nEnter Employee Id who is resolving");
				resolveTicket.setResolvedBy(trackerDao.getEmployee(empId));
				resolveTicket.setResolvedDate(new Date());
				trackerDao.resolveTicket(resolveTicket);
				break;
			case 3:
				tickets = trackerDao.getResolvedTickets();
				for (Ticket tkt : tickets) {
					System.out.println(("Description : " + tkt.getDescription()));
					System.out.println(("Raised By : " + tkt.getRaisedBy().getName()));
					System.out.println(("Resolved By : " + tkt.getResolvedBy().getName()));
					System.out.println("TAT : " 
							+ (tkt.getResolvedDate().getTime() - tkt.getRaisedDate().getTime()) + " ms");
				}
				break;
			case 4:
				System.exit(1);
			default:
				System.out.println("Select proper option");
			}
		}
	}
	
	public static void printMenu(){
		System.out.println("1. Raise a ticket");
		System.out.println("2. Resolve a ticket");
		System.out.println("3. View Turn around time");
		System.out.println("4. Exit");
		
		
	}

}
