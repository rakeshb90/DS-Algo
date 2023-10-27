package com.app.stadardEdition;

public class MultiThreadingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.print(i*i+" ");
			}
			System.out.println("Child thread");
			System.out.println("Current thread: "+Thread.currentThread().getName());
		}
			);
		System.out.println("Current thread: "+Thread.currentThread().getName());
		t1.start();
				
		}

	}
