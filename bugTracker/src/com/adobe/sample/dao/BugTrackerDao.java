package com.adobe.sample.dao;

import com.adobe.sample.entity.Employee;
import com.adobe.sample.entity.Ticket;

public interface BugTrackerDao {
	void raiseTicket(Ticket ticket);
	
	void resolveTicket(Ticket ticket);
	
	Employee getEmployee(int id);
	
	Ticket[] getOpenTickets();
	
	Ticket[] getResolvedTickets();

	Ticket getTicket(int id);

}
