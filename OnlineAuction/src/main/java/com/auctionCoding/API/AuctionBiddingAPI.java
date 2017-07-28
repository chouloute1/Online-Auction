package com.auctionCoding.API;

import java.awt.List;
import java.util.ArrayList;

import com.auctionCoding.bid.Bid;
import com.auctionCoding.bidder.Bidder;

/**
 * 
 * @author Stanley Chouloute
 *
 *         This class is the API build to determine the winner of each bid
 */
public class AuctionBiddingAPI implements AuctionBidding {

	/**
	 * 
	 * Method to return the bid winner object Inside object contains Bidding
	 * price and name of bidder.
	 * This method uses to enhanced for loops to compare all bidders prices
	 * and makes sure that the highest bidder is chosen
	 * If there is a tie it returns the bidder who bidded first
	 * 
	 */
	public Bidder bidWinner(Bid bid, ArrayList<Bidder> bidders) {

		Bidder winner = new Bidder("", 0, 0, 0, 0);				//Object used to choose the best bidder
		bid.setBidderList(bidders);								//Setting list of bidders for current bid
		ArrayList<Bidder> bidList = bid.getBidderList();		//passing copy of bidders to a new list to manipulate

		//enhanced forloop used to iterate through list
		for (Bidder bidder1 : bidList) {

			//enhanced forloop used to iterate through list again
			for (Bidder bidder2 : bidList) {

				//setting bidder1 current bid based on starting bid input
				if (bidder1.getCurrentBid() < bidder1.getSTARTING_BID()) {
					bidder1.setCurrentBid(bidder1.getSTARTING_BID());
				}

				//setting bidder2 current bid based on starting bid input
				if (bidder2.getCurrentBid() < bidder2.getSTARTING_BID()) {
					bidder2.setCurrentBid(bidder2.getSTARTING_BID());
				}

				//loop used to get the maximum bidding price for a bidder1
				while ((bidder1.getCurrentBid() + bidder1.getAutoIncrement()) <= bidder1.getMAX_BID()) {
					bidder1.setCurrentBid(bidder1.getCurrentBid() + bidder1.getAutoIncrement());
				}

				//loop used to get the maximum bidding price for a bidder2
				while ((bidder2.getCurrentBid() + bidder2.getAutoIncrement()) <= bidder2.getMAX_BID()) {
					bidder2.setCurrentBid(bidder2.getCurrentBid() + bidder2.getAutoIncrement());
				}

				//checks to see if current winner still has the best bid
				if (winner.getCurrentBid() < bidder1.getCurrentBid()) {
					winner = bidder1;
				}

				//checks to see if there is a tie amongst bidders
				if (winner.getCurrentBid() == bidder2.getCurrentBid()) {
					//checks to see which bidder placed a bid first
					if (winner.getBidSubmissionNum() > bidder2.getBidSubmissionNum()) {
						winner = bidder2;
					}
				}
				// Checks to see if current winner has the best bid or not
				else if (winner.getCurrentBid() < bidder2.getCurrentBid()) {
					winner = bidder2;
				}

			}

		}

		return winner;			//returns the winner and the best bidding price all in one object
	}

}
