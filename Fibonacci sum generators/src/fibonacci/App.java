package fibonacci;

import java.util.ArrayList;

public class App {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(App.fib_sub());
		System.out.println(App.fib_subV2());
	}
	
	static int fib_sub() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		for (int i = 1; i <= 18; i++) {
			list.add((list.get(i) + list.get(i - 1)));
		}
		
		int total = 0;
		for(Integer i : list) {
			total+=i;
		}
		
		//list.forEach((a)->total+=a);
		
		return total;
	}
	
	static int fib_subV2() {
		int seclast = 0;
		int last = 1;
		int total = 1;
		
		for(int i=0; i<18; i++){
			int temp = last+seclast;
			seclast = last;
			last = temp;
			total += last;
		}
		return total;
	}

	

}
