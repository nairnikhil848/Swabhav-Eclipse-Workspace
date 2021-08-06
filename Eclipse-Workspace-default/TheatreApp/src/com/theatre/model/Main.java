package com.theatre.model;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre[] theatres = new Theatre[3];
		Theatre[] result;
		String res;
		theatres[0] = new Theatre(1, "Nikhil", 50, 5, 200, true);
		theatres[1] = new Theatre(2, "NotMe", 55, 3, 100, true);
		theatres[2] = new Theatre(3, "Me", 60, 4, 500, true);
		
		res = findTheatreCategory(theatres,5);
		try {
			if(res.equals(null)) {
				System.out.println(res);
			}
			else {
				System.out.println(res);
			}
			
		}
		catch(NullPointerException e)
        {
            System.out.print("There is no Theatre with the given Theatre ID\n");
        }
//		if(null.equals(res)) {
//			System.out.println("There is no Theatre with the given Theatre ID");
//		}
//		else {
//			System.out.println(findTheatreCategory(theatres,5));
//		}
		
		
		result = searchTheatreByCapacity(theatres, 45);
		if (result.equals(null)) {
			System.out.println("Only low capacity theatres available");
		} else {
			for (Theatre val : result) {
				System.out.println(val.gettheatreId());
			}
		}

	}

	public static String findTheatreCategory(Theatre[] Theatres, int value) {
		for (Theatre Theatre : Theatres) {
			if (Theatre.gettheatreId() == value) {
				if (Theatre.getbalconyAvailable() && Theatre.gettheatreRating() > 4) {
					return "Ultra Premium";
				} else {
					if (Theatre.getbalconyAvailable() && Theatre.gettheatreRating() >= 3
							&& Theatre.gettheatreRating() <= 4) {
						return "Premium";
					} else {
						return "Normal";
					}
				}
			}

		}
		return null;
	}

	public static Theatre[] searchTheatreByCapacity(Theatre[] Theatres, double values) {
		Theatre[] ascTheatres = new Theatre[0];
		for (Theatre Theatre : Theatres) {
			if (Theatre.getseatCapacity() > values) {
				ascTheatres = Arrays.copyOf(ascTheatres, ascTheatres.length + 1);
				ascTheatres[ascTheatres.length - 1] = Theatre;
			}
		}
		if (ascTheatres.length > 0) {
			Theatre temp;
			for (int i = 0; i < ascTheatres.length; i++) {
				for (int j = i + 1; j < ascTheatres.length; j++) {
					if (ascTheatres[i].getticketRate() > ascTheatres[j].getticketRate()) {
						temp = ascTheatres[i];
						ascTheatres[i] = ascTheatres[j];
						ascTheatres[j] = temp;
					}
				}
			}
//			Arrays.sort(ascTheatres);
			return ascTheatres;
		} else {
			return null;
		}
	}

}

class Theatre {
	private int theatreid;
	private String theatreName;
	private int seatCapacity;
	private double ticketRate;
	private double theatreRating;
	private boolean balconyAvailable;

	public Theatre(int theatreid, String theatreName, int seatCapacity, double theatreRating, double ticketRate,
			boolean balconyAvailable) {
		this.theatreid = theatreid;
		this.theatreName = theatreName;
		this.seatCapacity = seatCapacity;
		this.ticketRate = ticketRate;
		this.theatreRating = theatreRating;
		this.balconyAvailable = balconyAvailable;
	}

	public int gettheatreId() {
		return theatreid;
	}

	public String gettheatreName() {
		return theatreName;
	}

	public double getseatCapacity() {
		return seatCapacity;
	}

	public double getticketRate() {
		return ticketRate;
	}

	public double gettheatreRating() {
		return theatreRating;
	}

	public boolean getbalconyAvailable() {
		return balconyAvailable;
	}

}
