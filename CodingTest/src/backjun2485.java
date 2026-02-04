package test.codingTest;

import java.util.*;

public class backjun2485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=k;i++){
            st = new StringTokenizer(scanner.nextLine());
            int k1 = Integer.parseInt(st.nextToken());
            list.add(k1);
        }
        List<Integer> flist= new ArrayList<>();
        for (int j=0; j< list.size(); j++){
            if((j+1)== list.size()){
                break;
            }
            int list1= list.get(j+1);
            int list2= list.get(j);
            int list3=list1-list2;
            flist.add(list3);
        }
        int u = flist.get(0);
        for (int i = 1; i < flist.size(); i++) {
            u = (int) gcd(u, flist.get(i));

        }
        //기존 코드가 틀린 이유
        //flist에는 연속된 나무들 간의 간격들이 들어 있습니다.
        //
        //이 간격들 모두의 **최대공약수(GCD)**를 구해야 합니다.
        //
        //그런데 현재는 최댓값과 최솟값의 GCD만 구하고 있습니다.
        //
        //이는 간격이 2, 4, 6일 때 GCD(6, 2) = 2처럼 우연히 맞을 수는 있지만,
        //
        //2, 4, 5처럼 나머지 간격이 다른 경우엔 오답이 됩니다.

        int totalGap = list.get(list.size() - 1) - list.get(0);
        int needed = totalGap / u + 1;
        int toPlant = needed - list.size();
        System.out.println("toPlant = " + toPlant);




    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
