package com.swabhav;

import java.util.Random;
import java.util.Scanner;

public class PigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Let's Play PIG!");
		System.out.println("*See how many turns it takes you to get to 20.");
		System.out.println("* Turn ends when you hold or roll a 1.");
		System.out.println("* If you roll a 1, you lose all points for the turn.");
		System.out.println("* If you hold, you save all points for the turn.");
		int maxScore = 20;
		int turn = 1;
		String playerInput;
		int dice, totalScore = 0,turnScore = 0;
		do {
			System.out.println("Turn "+turn);
			do {
				System.out.println("Roll or hold?(r/h):");
				playerInput = scan.nextLine();

				if(playerInput.equals("r")){
					dice = rand.nextInt(5) + 1;
					System.out.println("Die:"+dice);
					if(dice == 1) {
						turnScore = 0;
						System.out.println("Turn over.No score");
						System.out.println("\n");
						turn = turn +1;
						break;
					}
					else {
						turnScore+=dice;   
					}
				}
				else {
					totalScore+= turnScore;
					System.out.println("Score for turn: "+turn);
					System.out.println("Total score: "+totalScore);
					if(totalScore >=maxScore) {
						System.out.println("\n");
						System.out.println("You finished in "+turn);
						System.out.println("Game over");
						System.exit(0);
					}
					turn = turn + 1;
					turnScore = 0;
				}
			}while(!playerInput.equals("h"));

		}while(true);
	}
	public static ArrayList<Theatre>searchTheatreByCapacity(Theatre[] th,double input)
    {
        ArrayList<Theatre> bs=new ArrayList<Theatre>();
        for(int i=0;i<th.length;i++)
        {
            if(th[i].getSeatCapacity()>input)
            {
                bs.add(th[i]);
            }
        }
        return bs;
    }
    
     public static void findTheatreCategory(Theatre[] t,int search)
     {
         
         int m=0;
         for(int i=0;i<t.length;i++)
         {
             if(t[i].isBalconyAvailable() && t[i].getTheatreRating()>=4)
             {
                 System.out.println("Ultra Premium"); 
             }
             else  if(t[i].getTheatreRating()>=3 && t[i].getTheatreRating()<=4 && t[i].isBalconyAvailable())
             {
                 System.out.println("Premium"); 
             }
             else if(t[i].getTheatreRating()>=0 && t[i].getTheatreRating()<=2)
             {
                 System.out.println("Normal");
             }
             else
             {
                 System.out.println("Null");
             }
             
            
         }
        
         
     }

}


class Theatre
{
    public Theatre(int theatreid, int seatCapacity, String theatreName, double ticketRate, double theatreRating,
            boolean balconyAvailable) {
        super();
        this.theatreid = theatreid;
        this.seatCapacity = seatCapacity;
        this.theatreName = theatreName;
        this.ticketRate = ticketRate;
        this.theatreRating = theatreRating;
        this.balconyAvailable = balconyAvailable;
    }
    public int getTheatreid() {
        return theatreid;
    }
    public void setTheatreid(int theatreid) {
        this.theatreid = theatreid;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    public String getTheatreName() {
        return theatreName;
    }
    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
    public double getTicketRate() {
        return ticketRate;
    }
    public void setTicketRate(double ticketRate) {
        this.ticketRate = ticketRate;
    }
    public double getTheatreRating() {
        return theatreRating;
    }
    public void setTheatreRating(double theatreRating) {
        this.theatreRating = theatreRating;
    }
    public boolean isBalconyAvailable() {
        return balconyAvailable;
    }
    public void setBalconyAvailable(boolean balconyAvailable) {
        this.balconyAvailable = balconyAvailable;
    }
    private int theatreid,seatCapacity;
    private String theatreName;
    private double ticketRate,theatreRating;
    private boolean balconyAvailable;
    
}

}
