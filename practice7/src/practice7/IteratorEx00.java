package practice7;
import java.util.*;

public class IteratorEx00 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		v.add(3, 200);
		v.add(4, 300);
		v.add(5, 400);
		v.add(6, 500);
		v.add(7, 600);
		v.add(8, 700);
		v.add(9, 800);
		v.add(10, 900);
		v.add(11, 1000);
		
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}
