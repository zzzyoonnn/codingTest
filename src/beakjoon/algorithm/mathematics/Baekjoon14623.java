package beakjoon.algorithm.mathematics;
/*
문제
- 감정이입에 대해서 알고 있는가? 
  감정이입이란 자신의 감정을 특정 대상에 이입시키거나 특정 대상의 감정을 자신에게 이입시켜서 서로 공감하는 것이다. 
  이렇게 자신이 다른 대상이 됐다고 생각을 하면 그전에는 느끼지 못했던 감정을 느낄 수 있어 풍부한 사고를 할 수 있다. 
  감정이입에 몰입하게 되면 어떠한 단계에 이르게 된다. 
  이 단계에서는 자신이 감정이입을 하는 대상이 되어 사고를 할 수 있게 된다.
  예로부터 많은 천재들이 이 단계에 다다라 많은 업적을 세웠다. 
  알베르트 아인슈타인은 빛이 되어 상대성 이론을 발견했고, 
  찰리 채플린은 자신이 연기하는 대상 그 자체가 되어 많은 사람들이 기억하는 희극배우가 됐다.
  컴퓨터 공학에서도 이런 단계에 다다를 수 있을까? 
  CPU가 되어서 주변 입/출력 장치를 제어하거나, 
  뉴럴 네트워크에 존재하는 수많은 뉴런들 중 한 뉴런이 되어 계산에 관여하는 상상을 할 수 있을까?
  천 리 길도 한 걸음부터. 컴퓨터에서는 없어서 안될 ALU(Arithmetic Logic Unit)가 되는 상상을 해보자. 
  ALU는 두 이진수의 산술 연산 혹은 논리 연산을 계산하는 회로다. 
  두 이진수가 주어졌을 때 덧셈은 가산기를, 뺄셈은 보수기와 가산기를 이용해 이루어진다. 
  그렇다면 두 이진수의 곱셈은 어떻게 이루어 질까? ALU가 되어 이 문제를 해결해보자.
입력
- 첫 번째 줄에 이진수 B1이 주어진다. 
  두 번째 줄에 이진수 B2가 주어진다. 
  입력으로 주어지는 두 이진수의 길이는 1 이상 30 이하의 자연수이다. 
  또한 두 이진수들이 1로 시작하는 것이 보장된다.
출력
- 첫 번째 줄에 입력으로 주어진 두 이진수 B1, B2의 곱을 이진수로 출력한다. 
  출력하는 이진수 앞에 불필요한 0이 붙으면 안 됨에 주의해야 한다. 
  즉 출력하는 이진수의 시작은 항상 1이어야 한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14623 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long b1 = Integer.parseInt(br.readLine(), 2);
    long b2 = Integer.parseInt(br.readLine(), 2);

    long multiple = b1 * b2;

    System.out.println(Long.toString(multiple, 2));
  }
}
