package BasicJavaProgramming;



public class Arrays {
	public static void main(String[] args) {
	double[] numbers = new double[] {52.7,60.2,75.6,80.1,100.2};

	
	
	for(int i = 0; i<numbers.length; i++) {
		System.out.printf("%.2f ", numbers[i]);
	}

}
}