package beakjoon.algorithm.implementation;
/*
문제
- 정보섬에 벚꽃이 피어났다!
  정보섬에 만발한 꽃송이들을 본 욱제는 한 가지 좋은 생각을 떠올렸다. 
  아래와 같은 네 개의 푯말을 준비해서 정보섬의 꽃밭에 세우는 것이다.
  정보섬의 1층 꽃밭에는 총 N개의 벚나무가 일렬로 늘어서 있다. 
  각 벚나무에는 늘어선 순서대로 A1, A2, ..., AN개의 벚꽃이 피어나 있다. 
  욱제는 이 벚나무를 총 네 개의 그룹으로 나누어 각 그룹을 대표하도록 푯말을 세웠다.
  이 그룹을 나눈 데에는 특별한 기준이 있다. 
  그룹 [i, j]의 벚꽃 개수들의 곱 Pi,j = Ai × Ai+1 × ... × Aj-1 × Aj (i ≤ j)가 네 개 있을 때, 
  네 개의 P의 합이 최대가 되도록 나누었다. 
  다시 말해, 그룹 내의 벚꽃 개수를 모두 곱하고, 그렇게 곱해진 값 네 개를 모두 더한 값이 최대가 되도록 나누었다. 
  욱제는 연속된 순서의 나무들만 하나의 그룹으로 묶고, 모든 나무들을 빠짐없이 정확히 하나의 그룹에 포함시켰다. 
  또한 하나의 그룹에는 반드시 하나 이상의 나무가 포함되었다.
  힘든 하루를 마치고 집으로 돌아가던 당신은 정보섬 1층에 만발한 꽃송이와 푯말을 보았다. 
  그리고 갑자기 최대화 된 네 개의 P의 합이 얼마인지 궁금해졌다.
  얼마일까?
입력
- 첫째 줄에 벚나무의 개수 N이 주어진다. (4 ≤ N ≤ 10)
  둘째 줄에 N개의 나무에 피어난 벚꽃의 개수 Ai가 순서대로 주어진다. (1 ≤ Ai ≤ 5)
출력
- 얼마일까?
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon17127 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());    // 벗나무 개수

    int[] tree = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < tree.length; i++) {
      tree[i] = Integer.parseInt(st.nextToken());
    }

    int max = 0;
    for (int i = 0; i < 4; i++) {   // 푯말 4개
      int total = 1;
      boolean[] check = new boolean[n];

      for (int j = i; j < tree.length - 3 + i ; j++) {  // 앞에서부터 4개의 푯말 중 가장 큰 부분
        total *= tree[j];
        check[j] = true;    // 가장 큰 부분에 포함된 부분은 check[j] = true;
      }

      for (int j = 0; j < tree.length; j++) {
        if (!check[j]) total += tree[j];    // 가장 큰 부분을 제외한 나머지 부분은 더하기
      }

      max = Math.max(max, total);
    }

    System.out.println(max);
  }
}