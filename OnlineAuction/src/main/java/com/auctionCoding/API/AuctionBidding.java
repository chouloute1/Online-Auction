package com.auctionCoding.API;

import java.util.ArrayList;

import com.auctionCoding.beans.Listing;
import com.auctionCoding.beans.Bidder;

/**
 * 
 * @author Stanley Chouloute
 *
 *  Interface used for any class that
 *  want to implement bidWinner method
 */
public interface AuctionBidding {

	Bidder determineWinner(Listing bid, ArrayList<Bidder> bidders);

}
