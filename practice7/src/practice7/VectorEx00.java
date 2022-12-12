package practice7;
import java.util.*;

public class VectorEx00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> height = new Vector<Integer>();
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		System.out.print(">>");
		for(int i = 0; i < 10; i++) {
			height.add(sc.nextInt());
		}
		
		int max = 0;
		int max_index = 0;
		for(int i = 0; i< 9; i++) {
			if(max < (height.get(i+1) - height.get(i))) {
			    max = height.get(i+1) - height.get(i);
				max_index = i;
			}
		}
		System.out.println("가장 키가 많이 자란 년도는 200" + max_index + "년 " + (float)max + "cm");
	}
}
