
package com.mycompany.exercise03;

import java.util.*;


public class MainClass {
	
	public static void main(String[] args){
		
//		Queue<Integer> myQueue = new LinkedList<>();
//		Stack<Integer> myStack = new Stack();
//		
//		myQueue.add(1);
//		myQueue.add(2);
//		myQueue.add(3);
//		
//		myStack.add(1);
//		myStack.add(2);
//		myStack.add(3);
//		
//		System.out.println("My Queue: " + myQueue);
//		System.out.println("My Stack: " + myStack);
//		
//		int headOfQueue = myQueue.remove();
//		int headOfStack = myStack.pop();
//		
//		System.out.println("After removing/popping the head element:");
//		System.out.println("My Queue: " + myQueue);
//		System.out.println("My Stack: " + myStack);
	PriorityQueue<Integer> pQueue = new PriorityQueue();
	pQueue.add(45);
	pQueue.add(99);
	pQueue.add(2);
	pQueue.add(16);
	
	System.out.println("Priority queue: " + pQueue);
	System.out.println("Head of the pQueue: " + pQueue.peek());
	}
	public static Boolean isPalindrome(String word){
		char[] wordArray = word.toCharArray();
			
		Queue<Character> wordQueue = new LinkedList<>();
		Stack<Character> wordStack = new Stack();
		
		for(int i = 0; i<wordArray.length;i++){
			if(wordQueue.remove() != wordStack.pop()){
				return false;
			}
		}
		return true;
	}
	
}
