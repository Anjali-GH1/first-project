import java.util.ArrayList;
import java.util.Scanner;

public class CustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> accounts = new ArrayList<>();
        int m = in.nextInt();
        int n = in.nextInt();
        //initialization
        for(int i = 0; i<m; i++){
            accounts.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                accounts.get(i).add(in.nextInt());
            }
        }
//      System.out.println(accounts);
        int wealth = maximumWealth(accounts, m, n);
        System.out.println(wealth);

    }
    public static int maximumWealth(ArrayList<ArrayList<Integer>> accounts, int m, int n) {

        int maxSum = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts.get(i).get(j);
            }
            if(maxSum < sum){
               maxSum = sum;
            }
        }
        return maxSum;
    }

}
