package no_k2_arrays;

//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]

import java.util.Arrays;

class Solution {
  public int[] solution(int[] array, int[][] commands) {
      int[] answer = new int [commands.length];
      
      for ( int i = 0 ; i < commands.length ; i++) {
    	  int[] a = new int[commands[i][1] - commands[i][0] + 1];
    	  
    	  a = Arrays.copyOfRange(array , commands[i][0]-1 , commands[i][1]);
    	  Arrays.sort(a);
    	  answer[i] = a[commands[i][2] - 1];
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