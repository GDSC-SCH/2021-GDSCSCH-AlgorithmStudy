import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    boolean[] check = new boolean[50*20+1];
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N-i; j++) { 
        for (int k = 0; k <= N-i-j; k++) { 
          int l = N-i-j-k; int sum = i+5*j+10*k+50*l; check[sum] = true;
        } 
      }
    } 
    
    int result = 0; 
    for (int i = 1; i < 50*20+1; i++) { 
      if(check[i]) result++; } System.out.println(result);
  } 
}
