cpackage knapsack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//comment
//new comment
class Item implements Comparable<Item>{
	double getWeight() {
		return weight;
	}
	void setWeight(double weight) {
		this.weight = weight;
	}
	double getValue() {
		return value;
	}
	void setValue(double value) {
		this.value = value;
	}
	double getVperW() {
		return VperW;
	}
	void setVperW(double vperW) {
		VperW = vperW;
	}
	double getX() {
		return x;
	}
	void setX(double x) {
		this.x = x;
	}
	int getI() {
		return i;
	}
	void setI(int i) {
		this.i = i;
	}
	double weight;
	double  value;
	double VperW;
	double x;
	int i;
	@Override
	public int compareTo(Item o) {
		
		return (int) (this.VperW-o.VperW);
	}
	
}

class Main {

	public static void main(String[] args) {
		List<Item> Items=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no, of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Item I=new Item();
			System.out.print("Enter value and weight of item "+i+1+" ");
			I.setValue(sc.nextDouble());
			I.setWeight(sc.nextDouble());
			I.setVperW(I.getValue()/I.getWeight());
			I.setX(0);
			I.setI(i+1);
			Items.add(I);
		}
		Collections.sort(Items,Collections.reverseOrder());
		System.out.print("Enter capacity of bag ");
		double W=sc.nextInt();
		double value;
		double weight=value=0;
		List<Item> dq=new ArrayList<>();
		for(Item l:Items) {
			if((weight+l.getWeight())<=W) {
				l.setX(1);
				dq.add(l);
				weight=weight+l.getWeight();
			}
			else {
				double temp=(W-weight)/l.getWeight();
				l.setX(temp);
				weight=W;
				dq.add(l);
				break;
			}
			
		}
		
		for(Item l:dq) {
			System.out.println("I"+l.getI());
			System.out.println("value= "+l.getX()+"*"+l.getValue());
			System.out.println("Weight= "+l.getX()+"*"+l.getWeight()+"\n\n");
			value=value+(l.getX()*l.getValue());
		}
		System.out.println(value);
		sc.close();
	}

}
