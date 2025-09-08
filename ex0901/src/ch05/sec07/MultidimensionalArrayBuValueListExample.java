package ch05.sec07;

public class MultidimensionalArrayBuValueListExample {

	public static void main(String[] args) {
		int[][] scores = { 
				{80, 90, 96},
				{76, 88}
		};
		
		System.out.println("1차원 배열 길이 (반의 수) : " + scores.length);
		System.out.println("2차원 배열 길이 (첫번째반의 수) : " + scores[0].length);
		System.out.println("2차원 배열 길이 (두번째반의 수) : " + scores[1].length);
		
		System.out.println("scores[0][2] : " + scores[0][2]);
		System.out.println("scores[0][2] : " + scores[1][1]);


			}
		
		
	}


