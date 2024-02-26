package Map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Map_01 {
	static int N, M;
	static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// 리스트와 리스트를 비교하는 방법 ---> 맞기는 하나 시간 초과가 나옴 ---> 이진탐색법을 사용

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list2 = new ArrayList<Integer>();
//		
//		int N = Integer.parseInt(br.readLine());
//		String K= br.readLine();
//		
//		int M = Integer.parseInt(br.readLine());
//		String Y= br.readLine();
//		
//		StringTokenizer st ;
//		st= new StringTokenizer(K);
//		for (int i = 0; i < N; i++) {
//			list.add(Integer.parseInt(st.nextToken()));
//		}
//		
//		st= new StringTokenizer(Y);
//		for (int i = 0; i < M; i++) {
//			list2.add(Integer.parseInt(st.nextToken()));
//		}
//		
//		StringBuffer sb = new StringBuffer();
//		for (Integer item : list2) {
//			if(list.contains(item)) {
//				sb.append("1 ");
//			}else {
//				sb.append("0 ");
//			}
//		}
//		
//		System.out.println(sb);
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		
		String K= br.readLine();
		
		StringTokenizer st = new StringTokenizer(K);
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M; i++) {
			
            int num = Integer.parseInt(st.nextToken());
            if(binarySearch(num)) bw.write("1 ");
            // 이분 탐색을 해서 해당 숫자가 없는 경우
            else bw.write("0 ");
        }
		
		bw.close();
        br.close();
		
	}
	
	private static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = N - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = arr[midIndex];

            if(num < mid) rightIndex = midIndex - 1;
            else if(num > mid) leftIndex = midIndex + 1;
            else return true;
        }
        return false;
    }

}
