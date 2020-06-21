//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]

package no_k;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int[][] a = new int [commands.length][]; // i부터 j까지의 배열을 담을 배열a
        
        for (int i = 0 ; i < commands.length ; i++) {
        	a[i] = new int [commands[i][1] - commands[i][0] + 1];//a는 행마다 열의 길이가 다르기 때문에 j-i+1 값으로 초기화.
        	for (int j = 0 ; j < commands[i][1] - commands[i][0] + 1 ; j++) {//a의 각 행마다의 열의 길이 만큼 for문이 돎
        		a[i][j] = array[commands[i][0]-1 + j]; //a초기화
        	}
        }	
        
        for (int i = 0 ; i < a.length ; i++) {
        	Arrays.sort(a[i]); //각 행 별로 오름차순
        	answer[i] = a[i][commands[i][2]-1]; //answer 초기화
        }
        
        
        return answer;
    }
}
public class SolutionTest {
	public static void main(String[] args) {
		Solution s = new Solution();
		int sol[] = s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, 
				new int[][]{{2, 5, 3},  {4, 4, 1}, {1, 7, 3}});
	

		for (int i = 0 ; i< sol.length ; i++) {
			System.out.print(sol[i]);
		}
	}
}
