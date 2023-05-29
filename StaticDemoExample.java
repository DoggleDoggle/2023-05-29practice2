package sec2.exam02;

public class StaticDemoExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * StaticDemo.pi;
		int result2 = StaticDemo.plus(10, 20);
		int result3 = StaticDemo.minus(100, 30);

		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result3:" + result3);
	}

}
