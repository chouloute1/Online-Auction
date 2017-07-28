package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.auctionCoding.API.AuctionBiddingAPI;
import com.auctionCoding.bid.Bid;
import com.auctionCoding.bidder.Bidder;

public class Testing {

	@Ignore
	@Test
	public void test() {
		Bid bid = new Bid("Record player", 1);
		Bidder winner = null;
		AuctionBiddingAPI auction = new AuctionBiddingAPI();

		ArrayList<Bidder> bidders = new ArrayList<Bidder>();

		bidders.add(new Bidder("Linda", 1, 170.00, 240.00, 3));
		bidders.add(new Bidder("Dave", 2, 160.00, 243.00, 7));
		bidders.add(new Bidder("Eric", 3, 190.00, 240.00, 4));

		winner = auction.bidWinner(bid, bidders);

		assertEquals("Linda", winner.getName());
	}

	@Ignore
	@Test
	public void test1() {
		Bid bid = new Bid("Snow shoes", 2);
		Bidder winner = null;
		AuctionBiddingAPI auction = new AuctionBiddingAPI();

		ArrayList<Bidder> bidders = new ArrayList<Bidder>();

		bidders.add(new Bidder("Linda", 1, 30.00, 70.00, 4));
		bidders.add(new Bidder("Dave", 2, 30.00, 70.00, 3));
		bidders.add(new Bidder("Eric", 3, 40.00, 90.00, 2));

		winner = auction.bidWinner(bid, bidders);

		assertEquals("Eric", winner.getName());
	}

	@Test
	public void test2() {
		Bid bid = new Bid("Piano", 3);
		Bidder winner = null;
		AuctionBiddingAPI auction = new AuctionBiddingAPI();

		ArrayList<Bidder> bidders = new ArrayList<Bidder>();

		bidders.add(new Bidder("Linda", 1, 20000.00, 65000.00, 2000));
		bidders.add(new Bidder("Dave", 2, 10000.00, 70000.00, 15000));
		bidders.add(new Bidder("Eric", 3, 22000.00, 70000.00, 8000));

		winner = auction.bidWinner(bid, bidders);

		assertEquals("Dave", winner.getName());
	}

}
