package day01;

import java.util.Scanner;

class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        
        answer = num1 + num2;
        return answer;
    }
}

public class Two_param_plus {
	
	public static void main(String[] args){
		int num1 = 0;
	    int num2 = 0;
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("num 1 : ");
	    num1 = sc.nextInt();
	    
	    System.out.println("num 2 : ");
	    num2 = sc.nextInt();
	    
	    Solution sol = new Solution();
	    
	    int result = sol.solution(num1, num2);
	    System.out.println("result : " + result);
	       
	}
	
}




