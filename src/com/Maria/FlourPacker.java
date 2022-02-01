package com.Maria;

public class FlourPacker {

	public static void main(String[] args) {
		System.out.println(canPack(1,0,4));
		System.out.println(canPack(1,0,5));
		System.out.println(canPack(0,5,4));
		System.out.println(canPack(2,2,11));
		System.out.println(canPack(-3,2,12));
		System.out.println(canPack(1,0,6));
		System.out.println(canPack(0,5,5));
		System.out.println(canPack(2,2,12));

	}
   public static boolean canPack(int bigCount, int smallCount, int goal) {
	   if(bigCount < 0 || smallCount < 0 || goal < 0) {
	  
		return false; 
	   }
	   
	   int numberOfFiveBoxNeed = goal / 5;  // 1...5
	   int numOfOneBoxNeed = 0;
	   int goalMake = 0;
	     
	   while(bigCount > 0 && numberOfFiveBoxNeed > 0) {
		   
		   goalMake = goalMake + 5;  
		   if((goal - goalMake) <5) {
			   break;
		   }
		   
		   bigCount--;
		   numberOfFiveBoxNeed--;
		   
	   }
	   
	   numOfOneBoxNeed = goal - goalMake;
	   
	   while(smallCount > 0 && numOfOneBoxNeed > 0) {
		   
		   goalMake = goalMake + 1;  
		   if((goal - goalMake) == 0) {
			   break;
		   }
		   
		   smallCount--;
		   numOfOneBoxNeed--;
	   }	   
	   if(goal == goalMake) {
		   return true;
	   }
	return false;
		
	   }
}
