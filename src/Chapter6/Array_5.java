package Chapter6;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}		
				};
		int count =0;
		int sum = 0;
		double avg = 0.0;
		for (int i =0; i<array.length;i++ ) {
			for(int j =0; j<array[i].length;j++) {
				sum +=array[i][j];
				count ++;	//평균값을 위한 배열 총 갯수
			}
		}
		avg = sum/count;
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);
	}

}
