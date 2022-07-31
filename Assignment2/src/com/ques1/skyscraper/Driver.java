package com.ques1.skyscraper;

import java.util.Scanner;

public class Driver {


		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the total no of floors in the building");
			int floor=sc.nextInt();
			SkyScraper skyscraper=new SkyScraper();
			skyscraper.NumberOfFloor(floor);
			skyscraper.Assemble();
			sc.close();

		}
	}
	
