public class RoundOff {
	public static void main(String[] args) {
		double n = 19.999;// 20
		int m = (int)(n * 1000);// 19999
		int r = m % 10;
		m = m / 10;// 1999
		if(r > 5) {// 9 > 5
			m++;
		}
		// 1999+1----2000/ 100
		m = m /100;
		n = m;
		System.out.println(n);
	}

}
