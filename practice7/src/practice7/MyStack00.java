package practice7;
class GStack00<T> {
	int tos;
	Object [] stck;
	public GStack00() {
		tos = 0;
		stck = new Object [10];
	}
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}

public class MyStack00 {
	public static void main(String[] args) {		
		GStack00<Point> PointStack = new GStack00<Point>();		
		PointStack.push(new Point(2, 3));
		PointStack.push(new Point(-5, 20));
		PointStack.push(new Point(30, -8)); 
		
		for(int n=0; n<3; n++)
			System.out.println(PointStack.pop()); //포인트스택 pop(삭제)
	}
}
