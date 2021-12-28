package bridglabz.functionalprograms;

import java.io.PrintWriter;
import java.util.Scanner;
		public class TwoDArray {

			int mArray[][];
			int m,n;
			
			PrintWriter mPrintWriter;
			public TwoDArray(int m,int n){
				mArray=new int[m][n];
				this.m=m;	
				this.n=n;
				mPrintWriter=new PrintWriter(System.out,true);
				
			}

			static Scanner sc = new Scanner(System.in);
			public static void main(String args[]){
				
				System.out.println("Enter number of Column:");
				int n=sc.nextInt();

				System.out.println("Enter number of Row:");
				int m=sc.nextInt();
				TwoDArray twoDyArray=new TwoDArray(m,n);
				twoDyArray.takeArrayInput();
				System.out.println("2D Array is");
				twoDyArray.printArray();
			}
			
			//Take 2D Array as Input
			public void takeArrayInput(){
				for(int row=0;row<m;row++){
					for(int col=0;col<n;col++){
						System.out.print("Array["+row+"] ["+col+"] :");
						mArray[row][col]=sc.nextInt();
						System.out.println();
					}
				}
			}
		
			public void printArray(){
				for(int row=0;row<m;row++){
					for(int col=0;col<n;col++){
						mPrintWriter.print(" "+mArray[row][col]);
					}
					mPrintWriter.println();
				}
			}
		}
