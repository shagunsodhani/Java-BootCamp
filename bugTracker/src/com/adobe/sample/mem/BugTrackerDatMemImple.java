/**
 * 
 */
package com.adobe.sample.mem;

import com.adobe.sample.dao.BugTrackerDao;
import com.adobe.sample.entity.Employee;
import com.adobe.sample.entity.Ticket;

/**
 * @author ssodhani
 *
 */
public class BugTrackerDatMemImple implements BugTrackerDao {
	private static Employee[] employees = new Employee[5];
	private static Ticket[] tickets = new Ticket[10];
	
	static {
		employees[0] = new Employee(1, "Rakesh");
		employees[1] = new Employee(2, "Tim");
		employees[2] = new Employee(3, "Roger");
		employees[3] = new Employee(4, "Kim");
		employees[4] = new Employee(5, "Rahul");
	}
	
	/* (non-Javadoc)
	 * @see com.adobe.sample.dao.BugTrackerDao#raiseTicket(com.adobe.sample.entity.Ticket)
	 */
	@Override
	public void raiseTicket(Ticket ticket) {
		for (int i = 0; i < tickets.length; i++) {
			if(tickets[i] == null){
				tickets[i].setId(i+1);
				tickets[i] = ticket;
				break;
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.adobe.sample.dao.BugTrackerDao#resolveTicket(com.adobe.sample.entity.Ticket)
	 */
	@Override
	public void resolveTicket(Ticket ticket) {
		for (int i = 0; i < tickets.length; i++) {
			if(tickets[i].getId() == ticket.getId()){
				tickets[i] = ticket;
				break;
			}
			
		}
	}

	/* (non-Javadoc)
	 * @see com.adobe.sample.dao.BugTrackerDao#getEmployee(int)
	 */
	@Override
	public Employee getEmployee(int id) {
		
		Employee emp = null;
		
		for (int i = 0; i < employees.length; i++) {
			if(employees[i] != null && employees[i].getId() == id){
				emp = employees[i];
				break;
			}
		}
		return emp;
	}

	/* (non-Javadoc)
	 * @see com.adobe.sample.dao.BugTrackerDao#getOpenTickets()
	 */
	@Override
	public Ticket[] getOpenTickets() {
		int count = 0;
		Ticket [] tic = new Ticket[10];
		for (int i = 0; i< employees.length; i++){
			if(tickets[i] != null && tickets[i].getResolvedBy() == null){
				tic[count++] = tickets[i] ;
			}
		}
		return tic;
	}

	/* (non-Javadoc)
	 * @see com.adobe.sample.dao.BugTrackerDao#getResolvedTickets()
	 */
	@Override
	public Ticket[] getResolvedTickets() {
		int count = 0;
		Ticket [] tic = new Ticket[10];
		for (int i = 0; i< employees.length; i++){
			if(tickets[i] != null && tickets[i].getResolvedBy() == null){
				tic[count++] = tickets[i] ;
			}
		}
		return tic;
	}

}
