package test;

import main.CountingSumPairs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingSumPairsTest {

    @Test
    void checkShortStandardList(){
        int[] numbers = {1, 2, 4, 5, 6};
        Assertions.assertEquals(CountingSumPairs.totalArrayPairs(numbers, 6), 2);
    }

    @Test
    void checkListWithDuplicates(){
        int[] numbers = {2, 3, 5, 5, 5, 6, 7, 8};
        Assertions.assertEquals(CountingSumPairs.totalArrayPairs(numbers, 10), 3);
    }

    @Test
    void checkListWithNegativeValues(){
        int[] numbers = {-15, -2, -1, 3, 12, 17, 23, 30};
        Assertions.assertEquals(CountingSumPairs.totalArrayPairs(numbers, 15), 3);
    }

    @Test
    void checkListWithZero(){
        int[] numbers = {0, 5, 7, 15, 16, 20};
        Assertions.assertEquals(CountingSumPairs.totalArrayPairs(numbers, 20), 2);
    }

    @Test
    void checkListOfAllDuplicates(){
        int[] numbers = {5,5,5,5,5,5,5};
        Assertions.assertEquals(CountingSumPairs.totalArrayPairs(numbers, 10), 3);
    }

    @Test
    void checkListWithNoPairs(){
        int[] numbers = {0, 1, 2};
        Assertions.assertEquals(CountingSumPairs.totalArrayPairs(numbers, 7), 0);
    }
}
