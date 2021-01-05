package Chapter6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5]; // 전체 => 0으로 초기화

		// 초기값
		int k = 1;
		for (int i = 0; i < 5; i++) // 행
		{
			for (int j = 0; j < 5; j++) // 열
			{
				arr[i][j] = k; // [0][0] ~[0][4]
				k++;
			}
		}
		// 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("arr[%d][%d]=%d\t", i, j, arr[i][j]);
			}
			System.out.println();

		}
	}
}
