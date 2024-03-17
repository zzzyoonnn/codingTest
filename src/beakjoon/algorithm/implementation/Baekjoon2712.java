package beakjoon.algorithm.implementation;
/*
문제
- 싸이가 강남 스타일로 2012년 10월 4일 현재 빌보드 핫100 차트 2위에 2주 연속 랭크되고 있다. 
  싸이는 곧 다시 미국으로 가서 해외 활동할 예정이라고 한다.
  하지만 미국은 한국과 사용하는 단위 체계가 다르다. 
  한국은 미터법을 사용하지만, 미국은 미국 단위계를 사용한다. 
  싸이를 위해 단위를 바꾸어 주는 프로그램을 작성하시오.
  아래 표를 참고해서 계산하면 되고, 킬로그램 <-> 파운드, 리터 <-> 갤런만 변환하면 된다.
  종류          미터법 미국 단위계
  무게  1.000 킬로그램  2.2046 파운드
       0.4536 킬로그램  1.0000 파운드
  부피     1.0000 리터  0.2642 갤런
           3.7854 리터   1.0000 갤런
입력
- 첫째 줄에 테스트 케이스의 개수 T(1<=T<=1,000)가 주어진다. 
  각 테스트 케이스는 한 줄로 이루어져 있다. 
  첫 번째 숫자는 값이고, 두 번째 등장하는 문자는 단위이다. 
  값은 소수일 수도 있고, 이 경우 소수점 아래 최대 넷째 자리까지 주어진다. 
  단위는 kg, lb, l, g 중 하나이며, 순서대로 킬로그램, 파운드, 리터, 갤런이다.
출력
- 각 테스트 케이스에 대해서 바꾼 값과 단위를 출력한다. 
  값은 반올림해서 소수점 4째자리까지 출력한다. 
  단위는 kg, lb, l, g중 하나이며, 설명은 입력 설명에 있다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2712 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());        // 테스트 케이스 개수
    StringTokenizer st;

    for (int tc = 0; tc < t; tc++) {
      st = new StringTokenizer(br.readLine());
      double value = Double.parseDouble(st.nextToken());     // 값
      String unit = st.nextToken();         // kg : 킬로그램, lb : 파운드, l : 리터, g : 갤런

      if (unit.equals("kg")) System.out.println(String.format("%.4f lb", value * 2.2046));
      else if (unit.equals("lb")) System.out.println(String.format("%.4f kg", value * 0.4536));
      else if (unit.equals("l")) System.out.println(String.format("%.4f g", value * 0.2642));
      else if (unit.equals("g")) System.out.println(String.format("%.4f l", value *  3.7854));
    }
  }
}
