package beakjoon.algorithm.ShortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1956 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int v = Integer.parseInt(st.nextToken());   // number of villages
    int e = Integer.parseInt(st.nextToken());   // number of roads

    int[][] roads = new int[v + 1][v + 1];
    final int INF = Integer.MAX_VALUE;

    for (int i = 1; i <= v; i++) {
      for (int j = 1; j <= v; j++) {
        roads[i][j] = INF;
      }
    }

    for (int i = 0; i < e; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      roads[a][b] = Math.min(roads[a][b], c);
    }

    for (int k = 1; k <= v; k++) {
      for (int i = 1; i <= v; i++) {
        for (int j = 1; j <= v; j++) {
          if (roads[i][k] != INF && roads[k][j] != INF) {
            roads[i][j] = Math.min(roads[i][j], roads[i][k] + roads[k][j]);
          }
        }
      }
    }

    int min = INF;
    for (int i = 1; i <= v; i++) {
      for (int j = 1; j <= v; j++) {
        if (roads[i][j] != INF && roads[j][i] != INF) {
          min = Math.min(min, roads[i][j] + roads[j][i]);
        }
      }
    }

    if (min == INF) System.out.print(-1);
    else System.out.println(min);
  }
}
