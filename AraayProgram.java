package com.assignmentDay3;

import java.util.Arrays;

public class AraayProgram {

	public void arrayOne() {
		int arr[]=new int [4];
		arr[0]=5;
		arr[1]=10;
		arr[2]=15;
		arr[3]=20;
		System.out.println(Arrays.toString(arr));
	}
//----------------------------------------------------------------------------------
	public void arrayTwo() {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};    
		int [] arr2 = new int [arr.length];  
		int visited = -1;  
		for(int i = 0; i < arr.length; i++){  
			int count = 1;  
			for(int j = i+1; j < arr.length; j++){  
				if(arr[i] == arr[j]){  
					count++;  
					//To avoid counting same element again  
					arr2[j] = visited;  
				}  
			}  
			if(arr2[i] != visited)  
				arr2[i] = count;  
		}  

		System.out.println("Element | Frequency");  
		System.out.println("---------------------------------------");  
		for(int i = 0; i < arr2.length; i++){  
			if(arr2[i] != visited)  
				System.out.println(arr[i] + "    :      " + arr2[i]);  
		}  
		System.out.println("----------------------------------------");  
	} 
//-------------------------------------------------------------------------------------
	public void arrayThreeFour() {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
		Arrays.sort(arr);
		System.out.println("The largest number is "+arr[arr.length-1]);
		System.out.println("The Smallest number is "+arr[0]);
	}
//------------------------------------------------------------------------------------
	public void arrayFive() {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};    
		System.out.println(" The elements of an array present on an EVEN position");  
		for(int i = 0; i < arr.length; i++){  
			if ((i%2)==0) {
				System.out.print(arr[i]+"   ");
			}
		}
	}
//------------------------------------------------------------------------------------
	public void arraySix() {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
		System.out.println(" The elements of an array in reverse order");
		for(int i = arr.length-1; i > -1; i--){ 
			System.out.print(arr[i]+"   ");
		}
	}
//-----------------------------------------------------------------------------------
	public void arraySeven() {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};    
		System.out.println(" The elements of an array present on an ODD position");  
		for(int i = 0; i < arr.length; i++){  
			if ((i%2)!=0) {
				System.out.print(arr[i]+"   ");
			}
		}
	}
//-----------------------------------------------------------------------------------
	public void arrayNineTen() {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("The Second Largest Number is  "+arr[arr.length-2]);
	}
//------------------------------------------------------------------------------------
	// Main Method 
	public static void main(String arg[]) {
		AraayProgram obj=new AraayProgram();
	}
}


