import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.PriorityQueue;


class Solution
{
    
	static int x;
	static int p;
	
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			System.out.println("");
			int N = sc.nextInt();
			System.out.print("#" + test_case);
            for(int i = 0; i < N; i++) {
            	int c = sc.nextInt();
            	
            	if ( c == 1 ) { 
            		x = sc.nextInt();
            		PQ.add(x);
            		}
            	else {
            		if ( PQ.isEmpty() ) {
            			System.out.print(" " + "-1");
            		} else {
            			p = PQ.poll();
            			System.out.print(" " + p);
            		}
            	}

            	}
            }
		sc.close();   
		}
	}

// 삭제 연산을 구현할 때에, 자식 노드 2개가 모두 존재한다면 둘 중 큰 키값을 가지는 노드와 현재 노드의 위치를 바꾸어주는 식으로 구현함에 주의합니다.
// 이부분 연구요망