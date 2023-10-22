package beakjoon.algorithm.implementation;
/*
문제
- 2022년 12월, 다섯 번째로 개최된 ZOAC의 오프닝을 맡은 성우는 누구보다 화려하게 ZOAC를 알리려 한다.
  매번 새로운 방식으로 문자열을 보여주던 성우는 이번 대회에서는 평범하게 앞 글자부터 하나씩 보여주기로 했다. 
  성우는 문자를 입력하기 위해 키보드로 손을 뻗은 순간, 
  실수로 마시던 소주를 키보드에 쏟아버리고 말았다... 
  알코올에 취한 키보드는 어떤 자판을 한 번만 눌러도 N번 누른 것처럼 인식을 하게 되어버렸다!
  소중한 키보드를 고치기 위해 고장 접수를 하는 성우는 N을 정확하게 알아야 한다. 
  눈물이 앞을 가려 모니터를 제대로 볼 수 없는 성우를 위해 대신 N을 구해주도록 하자!
입력
- 첫째 줄에 성우가 고장 난 키보드로 입력한 문자열이 주어진다.
  문자열의 길이는 1,000,000보다 크지 않고, 빈 문자열은 주어지지 않는다.
  성우는 알파벳 대문자만 입력하고, 어떤 알파벳도 두 번 이상 입력하지 않는다.
  성우는 독수리 타법이므로 한 번에 하나의 자판만 누를 수 있다.
출력
- 첫째 줄에 N을 출력한다.
 */
import java.util.Scanner;

public class Baekjoon26594 {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 1;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) count++;
      else break;
    }
    System.out.println(count);
  }
}