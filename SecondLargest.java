import java.io.*;

public class SecondLargest {
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc=new Scanner (System.in);
        /*
        10
        1 2  4 5 6 7 8 99 2 1
        */
        int sum =  Integer.parseInt(br.readLine());//Integer.parseInt()-> String to int conversion


        //getting multiple numbers in a single line separated by space
        String[] numbers = br.readLine().split(" ");//split()->tor do based on parameter " "="\s+"
        //"1 2 3 4" =>["1","2","3","4"];
        int[] ary=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            ary[i]=Integer.parseInt(numbers[i]);
        }
        int largest=ary[0];
        int secondLargest=ary[0];
    }
}

//optimization
//int[][] ary=new int[n][n];
//time complixity reduce or space complexity