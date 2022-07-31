package com.ques1.skyscraper;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class SkyScraper {
	
		PriorityQueue<Integer> PQueue=new PriorityQueue<>(Collections.reverseOrder());
		int []day;
		
		public void NumberOfFloor(int n)
		{	
			int size;
			Scanner sc=new Scanner(System.in);
			day=new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the floor size given on day:"+(i+1));
				size=sc.nextInt();
				day[i]=size;
				PQueue.offer(size);
				  if(size<=n)
		            {
		            	day[i]=size;
		            }
		            else
		            {
		                System.err.println("The floor size should be less than or equal to building size ("+n+")");
		            
				   break;
		        }}
			
		sc.close();
		}
		
		public void Assemble(){	
			
			PriorityQueue<Integer> pqueue = new PriorityQueue<>();
			System.out.println("The order of construction is as follows");
			
			for(int i=0;i<day.length;i++)
			{
				System.out.println("Day:"+(i+1));
				pqueue.add(day[i]);
				while(pqueue.contains(PQueue.peek()))
				{
					System.out.print(PQueue.poll()+" ");
				}
				System.out.println(" ");
			}
		}
		
	}

	
