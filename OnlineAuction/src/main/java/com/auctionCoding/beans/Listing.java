package com.auctionCoding.beans;

import java.util.ArrayList;

import com.auctionCoding.beans.Bidder;

/**
 * 
 * @author Stanley Chouloute
 *
 * This class is to form an Bid
 *  Object
 */
public class Listing {

	private String item;					//string item 
	private int bidID;						// bid Identification
	private ArrayList<Bidder> bidderList;	// List of Bidders for bid
	
	
	/**
	 * 
	 * @param item
	 * @param bidID
	 * @param bidderList
	 * 
	 *  Constructor used to form a new bid
	 */
	public Listing(String item, int bidID) {
		super();
		this.item = item;
		this.bidID = bidID;
	}


	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}


	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}


	/**
	 * @return the bidID
	 */
	public int getBidID() {
		return bidID;
	}


	/**
	 * @param bidID the bidID to set
	 */
	public void setBidID(int bidID) {
		this.bidID = bidID;
	}


	/**
	 * @return the bidderList
	 */
	public ArrayList<Bidder> getBidderList() {
		return bidderList;
	}


	/**
	 * @param bidderList the bidderList to set
	 */
	public void setBidderList(ArrayList<Bidder> bidderList) {
		this.bidderList = bidderList;
	}
	
	

}
