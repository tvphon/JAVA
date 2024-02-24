package chapter;

public class ArrayDi2 {
	public static void main(String[] args) {
		// 2x3 2차원 배열을 만든다.
		int[][] arr = new int[2][3]; // 행(row), 열(column)

		arr[0][0] = 1; // 0행, 0열
		arr[0][1] = 2; // 0행, 0열
		arr[0][2] = 3; // 0행, 0열
		arr[1][0] = 4; // 0행, 0열
		arr[1][1] = 5; // 0행, 0열
		arr[1][2] = 6; // 0행, 0열

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 3; column++) {
				// column를 0, 1, 2로 변경하면서 다음 코드를 반복
				System.out.print(arr[row][column] + " "); // column열 출력
			}
			System.out.println(); // 한 행이 끝나면 라인을 변경한다.
		}
	}

}
