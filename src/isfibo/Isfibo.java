package isfibo;
import java.io.*;
import java.util.*;
public class Isfibo {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*We initialize the previous and current fibonacci numbers.*/
        long prevFib, curFib;
/*We create an ordered set to hold all the Fibonacci numbers.*/
        Set<Long> fibs = new TreeSet<Long>();
 /*We add the first two Fibonacci numbers.*/
        fibs.add(prevFib = 0L);
        fibs.add(curFib = 1L);
/*A for loop to run the test for each test case.*/
        for(int T = Integer.parseInt(br.readLine()); T > 0; --T){
/*We read in the potential Fibonacci number N.*/
            long N = Long.parseLong(br.readLine());
/*We make sure we've acquired all the Fibonacci numbers up to N.*/
            while (curFib < N){
                long temp = curFib;
/*We add the two previous numbers to find the current number*/
                fibs.add(curFib += prevFib);
                prevFib = temp;
            }

            //Check if the Fibonacci number is in the set
            sb.append(fibs.contains(N) ? "IsFibo\n" : "IsNotFibo\n");
        }

        //Print
        System.out.print(sb);
    }
}