package com.auctionCoding.beans;

/**
 * 
 * @author Stanley Chouloute
 *
 * This class is used for constructing a bidder object
 * 
 */
public class Bidder {

	private String name;
	private final int bidSubmissionNum;
	private final double STARTING_BID;
	private final double MAX_BID;
	private double autoIncrement;
	private double currentBid = 0;

	/**
	 * @param name
	 * @param bidSubmissionNum
	 * @param sTARTING_BID
	 * @param mAX_BID
	 * @param autoIncrement
	 * 
	 *            Constructor used to build Bidder object
	 * 
	 */
	public Bidder(String name, int bidSubmissionNum, double sTARTING_BID, double mAX_BID, double autoIncrement) {
		super();
		this.name = name;
		this.bidSubmissionNum = bidSubmissionNum;
		STARTING_BID = sTARTING_BID;
		MAX_BID = mAX_BID;
		this.autoIncrement = autoIncrement;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the autoIncrement
	 */
	public double getAutoIncrement() {
		return autoIncrement;
	}

	/**
	 * @param autoIncrement
	 *            the autoIncrement to set
	 */
	public void setAutoIncrement(double autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	/**
	 * @return the currentBid
	 */
	public double getCurrentBid() {
		return currentBid;
	}

	/**
	 * @param currentBid
	 *            the currentBid to set
	 */
	public void setCurrentBid(double currentBid) {
		this.currentBid = currentBid;
	}

	/**
	 * @return the bidSubmissionNum
	 */
	public int getBidSubmissionNum() {
		return bidSubmissionNum;
	}

	/**
	 * @return the sTARTING_BID
	 */
	public double getSTARTING_BID() {
		return STARTING_BID;
	}

	/**
	 * @return the mAX_BID
	 */
	public double getMAX_BID() {
		return MAX_BID;
	}

}
