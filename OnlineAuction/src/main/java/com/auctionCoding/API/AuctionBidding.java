package com.auctionCoding.API;

import java.util.ArrayList;

import com.auctionCoding.bid.Bid;
import com.auctionCoding.bidder.Bidder;

/**
 * 
 * @author Stanley Chouloute
 *
 *  Interface used for any class that
 *  want to implement bidWinner method
 */
public interface AuctionBidding {

	Bidder bidWinner(Bid bid, ArrayList<Bidder> bidders);

}
