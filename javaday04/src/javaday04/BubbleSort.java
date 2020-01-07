package javaday04;

public class BubbleSort {

	public static void main(String[] args) {
		int [] ar = {20,30,40,50,10};
		
		
		int len = ar.length;

		//최대 n-1회전
		for(int i=0;i<len-1; i=i+1){
			//1회전 동안의 데이터의 이동 여부를 판별하기 위한 변수
			boolean flag = false;
			//자신의 인접한 데이터와 비교하기 위한 제어문
			for(int j=0; j<len-i-1; j=j+1){
				//뒤의 데이터가 더 작으면 swap
				if(ar[j] > ar[j+1]){
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					//데이터 이동 여부 표시
					flag = true;
				}
			}
			//데이터의 이동이 없으면 정렬 종료
			if(flag == false){
				break;
			}
		}
		
		//데이터 출력
		for(int temp : ar) {
			System.out.print(temp + "\t");
		}

		


	}

}
