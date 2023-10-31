package main;

import java.util.ArrayList;

public class CountingSumPairs {
    public static void main(String[] args) {
        //examples
        int[] example1 = {3, 4, 5, 6};
        System.out.println(totalArrayPairs(example1, 1));

        int[] example2 = {0, 15, 32, 2000, 15000};
        System.out.println(totalArrayPairs(example2, 15));

        int[] example3 = {1, 1, 10, 32, 41};
        System.out.println(totalArrayPairs(example3, 42));
    }

    public static int totalArrayPairs(int[] numbers, int goalValue){
      int pairs = 0;
      ArrayList<Integer> unmatchedNumbers = new ArrayList<>();

      for(int i: numbers){
          //number required to make the goalValue
          int diff = goalValue - i;

          //if list of unmatched numbers contains the required diff to complete a pair
          boolean isNumberMatched = false;
          if(unmatchedNumbers.contains(diff)){
              //increment the pair count by one
              pairs++;
              //remove diff from unmatched numbers and use boolean to set that it found a match
              unmatchedNumbers.remove((Integer) diff);
              isNumberMatched = true;
          }

          //if not matched, add iterating number to list of unmatched numbers
          if(!isNumberMatched){
              unmatchedNumbers.add(i);
          }
      }

      return pairs;
    }
}
