package chapter1;
//Ã°ÅÝÅÅÐò
public class BubbleSort {
	public static void bubble(int []a) {
		for(int i = a.length-1;i>=0;i--) {
			int temp = 0;
			int flag = 0;
			for(int j = 0;j<i;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					flag = 1;
				}
			}
			if(flag == 1) {
				continue;
			}
			else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int []test = {4,2,1,3,5,9,0};
		bubble(test);
		for(int i = 0;i<test.length;i++) {
			System.out.println(test[i]);
		}

	}

}
