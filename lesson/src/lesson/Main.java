package lesson;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Video v = new Video();
		v.name = "Java基礎";
		v.playCount = 4;
		System.out.println(v.name);
		
		v.play();
		System.out.println(v.playCount);
	}	
}
