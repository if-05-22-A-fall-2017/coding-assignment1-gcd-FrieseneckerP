/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd_calculater;

/**
 *
 * @author Pascal
 */
public class Gcd_calculater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int res1 = gcdPrimeFactors(66, 666);
       int res2 = gcdEucledian(66,666);
       System.out.println(res1);
       System.out.println(res2);
    }
    public static int gcdPrimeFactors(int a, int b){
       int factorA = 2;
       int factorB = 2;
       int res = 1;
       while(a > 1|| b > 1)
       {
           
          factorA = gcdPrimeFactorsLoop(factorA,a);
          factorB = gcdPrimeFactorsLoop(factorB,b);
          
          a/= factorA;
          b/= factorB;
          
           if (factorA == factorB) {
               res*=factorA;
           }
       
        }
       return res;
    }
    public static int gcdEucledian(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcdEucledian(b,a%b);
        
    }
    static int gcdPrimeFactorsLoop(int factor,int num){
        while(num > 1 && num % factor != 0 || isPrime(factor)== false)
            {
                    factor++;
            }
        return factor;
    }
    static boolean isPrime(int n) {
        for(int i = 2;i < n; i++) {
            
            if(n % i == 0)
                return false;
        }
    return true;
}

}
