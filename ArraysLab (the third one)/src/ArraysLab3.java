
public class ArraysLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 4, 5};
		int[] arr2 = {8, 6, 5};
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//sum(arr1, arr2);
		//append(arr1, 2);
		//remove(arr1, 0);
		//System.out.println(sumEven(arr1));
		rotateRight(arr3);
		

	}

		public static int[] sum(int[] arr1, int[] arr2) {
			int[] arr3 = new int[arr1.length];
			for (int i=0; i< arr1.length;i++) {
				arr3[i]=arr1[i]+arr2[i];
				//System.out.println(arr3[i]);
			}
			return arr3;
		}
		public static int[] append(int[] arr1, int num) {
			int[] arr2 = new int[arr1.length+1];
			for (int i=0; i<arr1.length; i++) {
				arr2[i]=arr1[i];
			}
			arr2[arr1.length]=num;
			return arr2;
		}
		public static int[] remove(int[] arr1, int idx) {
			int[] arr2 = new int[arr1.length-1];
			int idxArr2=0;
			for (int i=0; i<arr1.length; i++) {
				if (i!=idx) {
					arr2[idxArr2]=arr1[i];
					idxArr2++;
				}
			}
			return arr2;
			}
		public static int sumEven(int[] arr) {
			int sum=0;
			for (int i=0;i<arr.length;i++) {
				if (i%2==0) {
					sum+=arr[i];
				}
			}
			return sum;
		}
		public static void rotateRight (int[] arr) {
			if (arr.length>1) {
				int temp = arr[0];
				int temp2 = arr[0];
				arr[0] = arr[arr.length-1];
				for (int i=1; i<arr.length; i++) {
						temp2 = arr[i];
						arr[i] = temp;
						temp=temp2;		
				}
			}
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
}
