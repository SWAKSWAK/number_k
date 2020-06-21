//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]

package no_k;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int[][] a = new int [commands.length][]; // i���� j������ �迭�� ���� �迭a
        
        for (int i = 0 ; i < commands.length ; i++) {
        	a[i] = new int [commands[i][1] - commands[i][0] + 1];//a�� �ึ�� ���� ���̰� �ٸ��� ������ j-i+1 ������ �ʱ�ȭ.
        	for (int j = 0 ; j < commands[i][1] - commands[i][0] + 1 ; j++) {//a�� �� �ึ���� ���� ���� ��ŭ for���� ��
        		a[i][j] = array[commands[i][0]-1 + j]; //a�ʱ�ȭ
        	}
        }	
        
        for (int i = 0 ; i < a.length ; i++) {
        	Arrays.sort(a[i]); //�� �� ���� ��������
        	answer[i] = a[i][commands[i][2]-1]; //answer �ʱ�ȭ
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
