package basics;
public class Debugdemo {
	public static void main(String[] args) {
		System.out.println("DebugDemo-- main");
		calculator calc = new calculator();
		int sum = calc.add(10, 20);
		System.out.println("the sum is--"+sum);
		//Student abdul = new Student("ansari",123);
		//Student myStudent = new Student();
		//Student yourStudent = new Student ("deepika");
		
		for(int a=0; a<5; a++) {
			int j = a*2;
			int f = a+ 5 *3;
			System.out.println("the no is="+f);
		}
	}
}