package beakjoon.algorithm.implementation;
/*
문제
- 한글 프로그램의 메뉴에는 총 N개의 옵션이 있다. 
  각 옵션들은 한 개 또는 여러 개의 단어로 옵션의 기능을 설명하여 놓았다. 
  그리고 우리는 위에서부터 차례대로 각 옵션에 단축키를 의미하는 대표 알파벳을 지정하기로 하였다. 
  단축키를 지정하는 법은 아래의 순서를 따른다.
    1. 먼저 하나의 옵션에 대해 왼쪽에서부터 오른쪽 순서로 단어의 첫 글자가 이미 단축키로 지정되었는지 살펴본다. 
       만약 단축키로 아직 지정이 안 되어있다면 그 알파벳을 단축키로 지정한다.
    2. 만약 모든 단어의 첫 글자가 이미 지정이 되어있다면 왼쪽에서부터 차례대로 알파벳을 보면서 
      단축키로 지정 안 된 것이 있다면 단축키로 지정한다.
    3. 어떠한 것도 단축키로 지정할 수 없다면 그냥 놔두며 대소문자를 구분치 않는다.
    4. 위의 규칙을 첫 번째 옵션부터 N번째 옵션까지 차례대로 적용한다.
입력
- 첫째 줄에 옵션의 개수 N(1 ≤ N ≤ 30)이 주어진다. 
  둘째 줄부터 N+1번째 줄까지 각 줄에 옵션을 나타내는 문자열이 입력되는데 하나의 옵션은 5개 이하의 단어로 표현되며, 
  각 단어 역시 10개 이하의 알파벳으로 표현된다. 
  단어는 공백 한 칸으로 구분되어져 있다.첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력
- N개의 줄에 각 옵션을 출력하는데 단축키로 지정된 알파벳은 좌우에 [] 괄호를 씌워서 표현한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon1283 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Set<Character> registered = new HashSet<>();    // 단축키로 사용되는 글자 저장용 Set

    point : for (int tc = 0; tc < n; tc++) {    // 단어의 첫 글자를 단축키로 지정할 수 있다면
      String s = br.readLine();
      String[] arr = s.split(" ");  // 공백을 기준으로 String배열 생성

      for (int i = 0; i < arr.length; i++) {
        if (!registered.contains(arr[i].charAt(0))) {     // 단어의 첫 글자가 단축키인지 확인
          registered.add(Character.toUpperCase(arr[i].charAt(0)));
          registered.add(Character.toLowerCase(arr[i].charAt(0)));

          // 단축키 지정된 단어에 괄호 붙이기
          StringBuilder sb = new StringBuilder(arr[i]);
          sb.insert(0, '[');
          sb.insert(2, ']');

          arr[i] = sb.toString();

          print(arr);
          continue point;
        }
      }

      // 모든 단어의 첫 글자가 단축키로 지정되어 있다면
      for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j < arr[i].length(); j++) {
          if (!registered.contains(arr[i].charAt(j))) {
            registered.add(Character.toUpperCase(arr[i].charAt(j)));
            registered.add(Character.toLowerCase(arr[i].charAt(j)));

            // 단축키 지정된 단어에 괄호 붙이기
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.insert(j, '[');
            sb.insert(j + 2, ']');

            arr[i] = sb.toString();

            print(arr);
            continue point;
          }
        }
      }

      // 단축키 존재 불가한 경우
      print(arr);
    }
  }

  public static void print(String[] arr) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) sb.append(arr[i]);
      else sb.append(arr[i]).append(" ");
    }
    System.out.println(sb.toString());
  }
}
