
public class ArraysLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 4, 5};
		int[] arr2 = {8, 6, 5};
		sum(arr1, arr2);
		append(arr1, 2);
		remove(arr1, 0);
		System.out.println(sumEven(arr1));
		
		

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
}
