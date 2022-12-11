
import java.util.ArrayList;
import java.util.List;

public class KidsGreatCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> wealth = new ArrayList<>();
        wealth = kidsWithCandies(candies, extraCandies);
        System.out.println(wealth);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i =0; i < candies.length; i++){
            max = Math.max(max, candies[i]);

        }
        for(int i = 0; i < candies.length; i++){
            if((extraCandies + candies[i] >= max)){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;


    }
}