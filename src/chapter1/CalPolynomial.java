package chapter1;
//计算多项式𝑝(𝑥)= 𝑎_𝑛 𝑥^𝑛+𝑎_(𝑛−1) 𝑥^(𝑛−1)+…+𝑎_1 𝑥^1+𝑎_0的
public class CalPolynomial {
	public static int poly(int[]a,int x) {
		int temp = 1;
		int []var = new int[a.length];
		var[0] = temp;
		for(int i = 1;i<a.length;i++) {
			temp = temp * x;
			var[i] = temp;
		}
		int result = 0;
		for(int i = 0;i<var.length;i++) {
			result = result + a[i]*var[i];
		}
		return result;	
	}
	
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int x = 2;
		int result = poly(a,x);
		System.out.println(result);

	}

}
