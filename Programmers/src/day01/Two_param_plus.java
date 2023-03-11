/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120802?language=java
 * 230307..Fail
 * 230311 success
 */
package day01;

import java.util.Scanner;

class Solution {
    
    public static void main(String[] args){
		int num1 = 0;
	    int num2 = 0;
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("num 1 : ");
	    num1 = sc.nextInt();
	    
	    System.out.println("num 2 : ");
	    num2 = sc.nextInt();
	    
	    int result = solution(num1, num2);
	    System.out.println("result : " + result);
	       
	}
    
	public static int solution(int num1, int num2) {
        int answer = -1;
        
        answer = num1 + num2;
        return answer;
    }
}




