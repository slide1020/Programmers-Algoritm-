/*
 * 프로그래머스 > 코테연습 > 코테고득점kit > 해시
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * 해시 포켓몬
 * 대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다. N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, 
 * N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요
 * 제한사항
 * nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
 * nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
 * 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
 * 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
 *
 */

package day2_hash_poketmon;

import java.util.Random;

public class solution {
	public static void main(String[] args) {
		Random ran = new Random();
		int pocketNum = ran.nextInt(10000); // 짝수 랜덤부터 생성.
		
		
		int[] nums = new int[10000]; // 배열 선언
	}
	
    public int solution(int[] nums) {
        int answer = 0;
        return answer;
    }
}
