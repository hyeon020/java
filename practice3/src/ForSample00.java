public class ForSample00 {
	public static void main(String[] args) {
		int i, sum = 0;
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			if(i<=9)
				System.out.print("+"); //+출력
			else {
				System.out.print("="); //=출력
				System.out.print(sum);
			}
		}
	}
}
