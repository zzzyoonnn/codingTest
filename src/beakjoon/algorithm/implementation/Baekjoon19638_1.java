package beakjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon19638_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());   // 인구 수
    int h = Integer.parseInt(st.nextToken());   // 센티의 키
    int t = Integer.parseInt(st.nextToken());   // 뿅망치 횟수

    // 거인 키 저장(내림차순 정렬)
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
      pq.offer(Integer.parseInt(br.readLine()));    // O(log n)
    }   // O(n log n)

    int i;      // 뿅망치 사용 횟수
    for (i = 0; i < t; i++) {
      int num = pq.peek();      // O(1)

      if (num == 1) break;
      if (num < h) break;

      pq.offer(pq.poll() / 2);  // O(log n)
    }

    // O(1)
    if(pq.peek() >= h) {
      System.out.println("NO");
      System.out.println(pq.peek());
    } else {
      System.out.println("YES");
      System.out.println(i);
    }
  }
}
