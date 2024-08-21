/*
 * @author ltoma, 10/17/2023 
 */

import java.math.BigInteger;


public class Fib {

    public static final BigInteger INITIAL_VALUE = new BigInteger("-1"); 
       
    //recursive. Running time is exponential.
    public static int fib(int n) {
	
	if (n==0) return 0; 
	if (n==1) return 1; 
	
	return fib(n-1) + fib(n-2); 
    }
    

    
    //recursive with DP. Running time is O(n) 
    public static BigInteger fibDP(int n, BigInteger[] table) {
	
	if (n==0) return new BigInteger("0"); 
	if (n==1) return new BigInteger("1"); 

	//if this value was computed, return it 
	if (!table[n].equals(INITIAL_VALUE))  return table[n];

	//otherwise compute it and store it in the table 
	table[n] = fibDP(n-1, table).add(fibDP(n-2, table));

	return table[n]; 
    }
    
    
    
    public static void main(String[] args) {
    
	int n = 1000; 
	
	//algorithm 1 (this takes forever)
	// System.out.println("n= " + n + ", fib= " + fib(n)); 

	//algorithm 2: DP iterative 
	BigInteger table[] = new BigInteger[n+1];
	table[0] = new BigInteger("0");
	table[1] = new BigInteger("1");

	
	for (int i=2; i<= n; i++) {
	    table[i] = table[i-1].add(table[i-2]); 
	}
	System.out.println("n= " + n + ", fib= " + table[n]);	


	//algorithm 3: DP with recursion 
	//initialize table
	for (int i=0; i<=n; i++)
	    table[i] = INITIAL_VALUE; 

	System.out.println("n= " + n + ", fib= " + fibDP(n, table));	
    }

};
