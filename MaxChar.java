import java.io.BufferedInputStream;
import java.io.*;

public class MaxChar {
    //"adiaiyaa"
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();


        int[] freq = new int[26];
        for(int i=0; i<inp.length();   i++){
            Character chr= inp.charAt(i);
            freq[chr-'a']++;
        }


        int maxValue=freq[0];
        int maxIdx = 0 ;

        for(int i=0; i<freq.length;   i++){
            if(freq[i]>maxValue){
                maxValue = freq[i];
                maxIdx = i;
            }
        }


        //maxIdx is used to unmap
        char  ch =(char)('a'+maxIdx);
        System.out.println("Character "+ (char)('a'+maxIdx)  +  "#" + maxValue);//asciii to  character
    }
}
