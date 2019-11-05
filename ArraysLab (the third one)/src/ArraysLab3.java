import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int appendNum = 200;
		int removeIdx = 5;
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = sum(a1, a2);
		int[] appendArr = append(a1, appendNum);
		int[] removeArr = remove(a2, removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));

	}

		public static int[] sum(int[] arr1, int[] arr2) {
			//makes a new array, same index length as the two input indexes. 
			//each index' element of this new array is the elements of the two input arrays (in the same index) added together
			int[] arr3 = new int[arr1.length]; 
			for (int i=0; i< arr1.length;i++) {
				arr3[i]=arr1[i]+arr2[i];
				//System.out.println(arr3[i]);
			}
			return arr3;
		}
		public static int[] append(int[] arr1, int num) {
			//makes a new array that replicates the input array, but has an extra index in which to put the input num
			int[] arr2 = new int[arr1.length+1];
			for (int i=0; i<arr1.length; i++) {
				arr2[i]=arr1[i];
			}
			arr2[arr1.length]=num;
			return arr2;
		}
		public static int[] remove(int[] arr1, int idx) {
			//replicates the array, but skips the input index.
			//variable idxArr2 is used to keep track of which index the new array is on.
			//since input idx is skipped, idxArr2 will only ever reach the length of the new array. (actually i'm not sure of anything lol)
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
			//if the index is even, adds that element to the sum.
			int sum=0;
			for (int i=0;i<arr.length;i++) {
				if (i%2==0) {
					sum+=arr[i];
				}
			}
			return sum;
		}
		public static void rotateRight (int[] arr) {
			//this method doesn't care about 1 length arrays and i'm scared of index outofbounds
			//uses two temp variables to store values
			//initializes 
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
		}
}
