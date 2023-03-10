import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        LinkedList res = new LinkedList();
        for (int i = 1;i<=n;i++){
            if (i %3 == 0 && i % 5 == 0){
                res.add("FizzBuzz");
            } else if (i % 3 == 0){
                res.add("Fizz");
            } else if (i % 5 == 0){
                res.add("Buzz");
            } else res.add(String.format("%d",i));
        }
        return res;
    }

}