/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc01042015;

/**
 *
 * @author yeswanth
 */
import java.io.*;
import java.util.Arrays;
import java.util.BitSet;
public class Solution2 {

    public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    String input="";
    
    while(!(input=in.readLine()).equals("0"))
    {
        try
        {
            
         //callmethod(Integer.parseInt(input));
            erato();
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }
    
    
}
    public static void callmethod(int input)
        {
      
            
    }
    public static void erato()
    {
        boolean arr[]=new boolean[65100];
        int b[]=new int[65100];
        for(int i=0;i<b.length;i++)
        {
           b[i]=1;
        }
        for(int i=2;i<=65000+1;i++)
        {
           if(b[i]==1)
           {
               for(int j=i*i;j<=65000+1;j+=i)
               {
                  b[j]=0;
                  arr[i]=true;
               }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
    

/*
#include<vector>
#include<bitset>
#include<cstdio>

using namespace std;
 
int n;
bitset<10000010> bs;
bool is_prime[65100], is_carmichael[65100];
 
void sieve(long long upper_bound) {
    bs.set();
    bs[0] = bs[1] = 0;
    for(long long i = 2; i <= upper_bound + 1; i++) {
        if(bs[i]) {
            for(long long j = i * i; j <= upper_bound + 1; j += i)
                bs[j] = 0;
            is_prime[i] = true;
        }
    }
}
 
int mod_pow(long long base, int exp, int mod) {
    long long result = 1;
    while(exp > 0) {
        if(exp % 2 == 1)
            result = (result * base) % mod;
        exp = exp >> 1;
        base = (base * base) % mod;
    }
    return result;
}
 
bool carmichael(int n) {
    if(is_prime[n]) return false;
    for(int i = 2; i < n; i++) {
        if(mod_pow(i, n, n) != i) return false;
    }
    return true;
}
 int main() 
 {
    sieve(65000);
    for(int i = 2; i <= 65000; i++)
        is_carmichael[i] = carmichael(i);
    for(;;) {
        scanf("%d", &n);
        if(n == 0) break;
        if(n>=65000||n<=2)
            {
            printf("Not Possible.");
        }
        printf(is_carmichael[n]? "The number %d is a Carmichael number.\n" : "%d is normal.\n", n);
    }
}
*/
