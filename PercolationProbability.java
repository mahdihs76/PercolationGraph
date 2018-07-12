import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac PercolationProbability.java
 *  Execution:    java PercolationProbability n p trials
 *  Dependencies: Percolation.java StdOut.java
 * 
 *  Repeatedly generated n-by-n boolean matrices, where each site
 *  is true with probability p, and compute the probability that
 *  the system percolates.
 *
 *  % java PercolationProbability 32 0.4 10000
 *
 ******************************************************************************/


public class PercolationProbability {

    // do specified number of trials and return fraction that percolate
    public static double evaluate(int n, double p, int trials) {
        int count = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] isOpen = Percolation.random(n, p);
            if (Percolation.percolates(isOpen))
                count++;
        }
        return (double) count / trials;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double p = scanner.nextDouble();
        int trials = scanner.nextInt();
        double q = evaluate(n, p, trials);
        StdOut.println(q);
    }
}