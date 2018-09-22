package q2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M, count;
	static int[] A;
	static int[] memo;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N];
		memo = new int[N];
		count = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			memo[i] = A[i];
			if (memo[i] == M) count++;
		}
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<N-i; j++) {
				memo[j] += A[i+j];
				if(memo[j] == M) count++;
			}
		}
		
		System.out.println(count);
		br.close();
		
	}
}
