package sub4;

import java.util.Arrays;

/*
	날짜 : 2025/07/08
	이름 : 이민준
	내용 : 삽입정렬 알고리즘 실습
*/

public class InsertionSortTest {

	public static void main(String[] args) {
		
		int[] arr = {4,2,1,5,3};
		
		for(int i = 1; i < arr.length; i++) {
			
			int key = arr[i];
			int j = i -1;
			
			while(j >= 0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
			
		}

	}

}
