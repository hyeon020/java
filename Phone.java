import java.util.Scanner;

class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class PhoneManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("인원수 >> ");
		int Persons = sc.nextInt();
			
		Phone[] Array = new Phone[Persons];
			
		for(int i = 0; i < Persons; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> "); //이름과 전화번호 입력
			Array[i] = new Phone(sc.next(), sc.next());
		}
			
		System.out.println("저장되었습니다...");
			
		label : while(true) {
			System.out.print("검색할 이름  >> ");
			String serchName = sc.next();
				
			for(int i = 0; i < Persons; i++) {
				if(serchName.equals("exit")) {
					break label;
				}
				else if(serchName.equals(Array[i].getName())) {
					System.out.println(Array[i].getName() + "의 번호는 " + Array[i].getTel() + " 입니다.");
				}
				else if(!serchName.equals(Array[i].getName()) && i == (Persons-1)) {
					System.out.println(serchName + "이(가) 없습니다.");
				}
			}
		}
		System.out.println("프로그램을 종료합니다...");
	}
}
