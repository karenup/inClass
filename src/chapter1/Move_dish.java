package chapter1;

public class Move_dish {
	public static int[] dish(int []a) {
		int temp = 0;
		int n = a.length/2;
		for(int count = 0;count<=n-1;count++) {
			for(int i = count;i<2*n-count-1;i = i+2) {
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int []test = {1,0,1,0,1,0,1,0,1,0};
		int []result = dish(test);
		for(int i = 0; i< result.length;i++) {
			System.out.print(result[i]);
			System.out.print(" ");

		}

	}

}
