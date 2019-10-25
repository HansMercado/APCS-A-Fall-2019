
public class ArraysLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 4, 5};
		int[] arr2 = {8, 6, 5};
		sum(arr1, arr2);
		append(arr1, 2);
		
		
		

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
			for (int i=0; i<arr1.length+1; i++) {
				System.out.println(arr2[i]);
			}
			return arr2;
		}
		public static int[] remove(int[] arr1, int num) {
			int[] arr2 = new int[arr1.length+1];
			for (int i=0; i<arr1.length; i++) {
				arr2[i]=arr1[i];
			}
			arr2[arr1.length]=num;
			for (int i=0; i<arr1.length+1; i++) {
				System.out.println(arr2[i]);
			}
			
			return arr2;
		}
		
}
