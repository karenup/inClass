package chapter1;
//—°‘Ò≈≈–Ú
public class selectionSort {
	public static void selection(int[]a) {
		int temp = 0;
		for(int start = 0;start<a.length-1;start++) {
			int min = a[start];
			int loc = start;
			for(int i = start; i<a.length; i++) {
				if(a[i]<min) {
					min = a[i];
					loc = i;
				}
			}
			temp = a[start];
			a[start] = min;
			a[loc] = temp;
			
		}
	}

	public static void main(String[] args) {
		int []test = {4,2,1,3,5,9,0};
		selection(test);
		for(int i = 0; i<test.length;i++) {
			System.out.println(test[i]);
		}
		
				

	}

}
