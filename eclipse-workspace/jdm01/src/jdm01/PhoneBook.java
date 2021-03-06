package jdm01;
import java.util.Scanner;

class Phone {
	public String name;
	public String tel;
	public Phone (String name, String tel) {//phone함수의 변수 선언
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
public class PhoneBook{
	public static void main(String[] args) {
		System.out.print("인원수>>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Phone[] phone = new Phone[n];
		
		for(int i = 0; i < n; i++) { //phonebook함수에 정보입력
			System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>> ");
			phone[i] = new Phone(scanner.next(), scanner.next());
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>> ");
			String string = scanner.next();
			if(string.equals("그만")) // 그만을 입력하면 멈춤
				break;
			for(int i = 0; i<n; i++) {
				if(string.equals(phone[i].name)) {
				System.out.println(string + "의 번호는 " + phone[i].tel + "입니다.");
				break;
			}
			if(i == n-1)
				System.out.println(string + "이 없습니다. ");
		}
	}
		scanner.close();
	}
}