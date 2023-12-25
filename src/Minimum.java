
public class Minimum {
	public static int findmin (int n1, int n2) {
		int min;
		if (n1 < n2)
			min = n1;
		else
			min = n2;
			return min;
	}
	public static void main(String[] args) {
		System.out.println("Minimum od dvata broja e : " + findmin(10,5));	

	}

}
