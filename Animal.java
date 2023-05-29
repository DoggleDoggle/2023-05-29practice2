package sec2.exam02;

public class Animal {

	//필드
	
	String tribe;
	int speed;
	
	//생성자
	Animal(String tribe){
		this.tribe = tribe;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		 for (int i=10; i<=100; i+=10){
			this.setSpeed(i);
			System.out.println(this.tribe+"가 달립니다"
					+ "(시속:"+this.speed+"km/h");
		}
	}
	
}
