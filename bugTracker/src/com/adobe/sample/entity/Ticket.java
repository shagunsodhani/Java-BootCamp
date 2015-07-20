package com.adobe.sample.entity;

import java.util.Date;

public class Ticket {
	
	private int id;
	private Employee raisedBy;
	private Date raisedDate;
	private String description;
	private Employee resolvedBy;
	private Date resolvedDate;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the raisedBy
	 */
	public Employee getRaisedBy() {
		return raisedBy;
	}
	/**
	 * @param raisedBy the raisedBy to set
	 */
	public void setRaisedBy(Employee raisedBy) {
		this.raisedBy = raisedBy;
	}
	/**
	 * @return the raisedDate
	 */
	public Date getRaisedDate() {
		return raisedDate;
	}
	/**
	 * @param raisedDate the raisedDate to set
	 */
	public void setRaisedDate(Date raisedDate) {
		this.raisedDate = raisedDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the resolvedBy
	 */
	public Employee getResolvedBy() {
		return resolvedBy;
	}
	/**
	 * @param resolvedBy the resolvedBy to set
	 */
	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	/**
	 * @return the resolvedDate
	 */
	public Date getResolvedDate() {
		return resolvedDate;
	}
	/**
	 * @param resolvedDate the resolvedDate to set
	 */
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}
	
	
}
