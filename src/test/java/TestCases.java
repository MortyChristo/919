import org.Revature.digitTotal;
import org.Revature.pickNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void pickTest1(){
        int N = 1;
        int[][] nums = {{1,8,16},{55,8,1000},{3,800,5},{99,100,90},{888,999,777}};
        int[] expected = {8};
        int[] actual = pickNumber.pickMiddleNumber(N, nums);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void pickTest2(){
        int N = 2;
        int[][] nums = {{1,8,16},{55,8,1000},{3,800,5},{99,100,90},{888,999,777}};
        int[] expected = {8,55};
        int[] actual = pickNumber.pickMiddleNumber(N, nums);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void pickTest3(){
        int N = 3;
        int[][] nums = {{1,8,16},{55,8,1000},{3,800,5},{99,100,90},{888,999,777}};
        int[] expected = {8,55,5};
        int[] actual = pickNumber.pickMiddleNumber(N, nums);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void pickTest4(){
        int N = 4;
        int[][] nums = {{1,8,16},{55,8,1000},{3,800,5},{99,100,90},{888,999,777}};
        int[] expected = {8,55,5,99};
        int[] actual = pickNumber.pickMiddleNumber(N, nums);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void pickTest5(){
        int N = 5;
        int[][] nums = {{1,8,16},{55,8,1000},{3,800,5},{99,100,90},{888,999,777}};
        int[] expected = {8,55,5,99,888};
        int[] actual = pickNumber.pickMiddleNumber(N, nums);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void digitTotalTest1(){
        int T = 1;
        String[] S = {"abced568bfjks8"};
        int[] expected = {27};
        int[] actual = digitTotal.digitSum(T, S);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void digitTotalTest2(){
        int T = 2;
        String[] S = {"abced568bfjks8", "00000011000fskajsd"};
        int[] expected = {27, 2};
        int[] actual = digitTotal.digitSum(T, S);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void digitTotalTest3(){
        int T = 3;
        String[] S = {"abced568bfjks8", "00000011000fskajsd", "usms8sj]-s2"};
        int[] expected = {27, 2, 10};
        int[] actual = digitTotal.digitSum(T, S);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void digitTotalTest4(){
        int T = 4;
        String[] S = {"abced568bfjks8", "00000011000fskajsd", "usms8sj]-s2", "dfjhagsdlk1fgosad"};
        int[] expected = {27, 2, 10, 1};
        int[] actual = digitTotal.digitSum(T, S);
        Assertions.assertArrayEquals(expected, actual);
    }

}
