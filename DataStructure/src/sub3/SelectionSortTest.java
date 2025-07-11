package sub3;

import java.util.Arrays;

/*
	날짜 : 2025/07/08
	이름 : 이민준
	내용 : 선택정렬 알고리즘 실습
*/

public class SelectionSortTest {

	public static void main(String[] args) {
		int arr[] = {4,2,1,5,3};
		
		for (int i= 0; i < 4; i++) {
			System.out.println(Arrays.toString(arr));
			for(int j = i+1; j<5; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			
		}
		
		
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

}
