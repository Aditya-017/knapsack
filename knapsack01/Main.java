package knapsack01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import knapsack.Item;

class Item{
	double weight, value,i;

	Item(double weight, double value, double i) {
		super();
		this.weight = weight;
		this.value = value;
		this.i = i;
	}
	
}

class Main {
	int knapsack(int value[],int weight[],int n,int m) {
		int [][]c=new int[n+1][m+1];
		for(int )
		return c[n][m];
	}

	public static void main(String[] args) {
		List<Item> Items=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no, of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter value and weight of item "+i+1+" ");
			double weight=sc.nextDouble();
			double value=sc.nextDouble();
			Items.add(new Item(weight,value,i+1));
		}
		System.out.print("Enter capacity of bag ");
		int m=sc.nextInt();
		double [][]c=new double[n+1][(int) (m+1)];
		for(int w=0;w<m;w++) {
			
		}

	}

}
