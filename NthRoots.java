/*
 * The purpose of this program is to compute the nth root of a number;
 * the square root method is just there for ease of use since it is more
 * common to use; the function is mathematically recursive, not recursive
 * in the context of computer science and is an implementation of the
 * nth root algorithm; furthermore, the importance of this program is 
 * that is does not use any libraries and uses elementary functions alone;
 * a fully recursive implementation would be done later.
 */
package nthroots;
import java.util.*;
/**
 *
 * @author Can
 */
public class NthRoots {
    
    /**
     * 
     * @param n: number to find the square root of
     * @return : square root of n
     */
    static double squareRoot(double n){
        int i = 0;
        double xn = 1.0/2*(1 + Double.valueOf(n)); // define X₀
        
        /* i represents the number of iterations; the more iterations, the closer
         * the value is to the square root of n
        */
        while(i<100){
            xn = 1.0/2*(xn + (Double.valueOf(n)/xn));
            i++;
        }
        return xn;
    }
    
    /**
     * This function computes the nth root of a number: ʳ√(b) using the
     * nth root algorithm
     * 
     * @param base: number to find the nth root of
     * @param root: value of the nth root
     * @return 
     */
    static double nthRoot(double base, int root){
        int i = 0;
        double a = 1.0;
        //define X₀
        double nth = 1.0/root*((root-1)*a + (base/nthRootHelper(a,root)));
        
        /*
         * As the number of iterations increase in the while loop,
         * the accuracy of the nth root also increases.
        */
        while(i<10000){
            nth = 1.0/root*( (root-1)*nth + (base/nthRootHelper(nth,root-1)));
            i++;
        }
        
        return nth;
    }
    /**
     * This helper function is necessary for the nth root algorithm because
     * it requires exponentiation dependent on what nth root is being 
     * calculated
     * @param d: represents current xₙ value
     * @param r: the power raised by the xₙ value
     * @return : d^(r-1)
     */
    static double nthRootHelper(double d, int r){
        double bd = 1.0;
        for(int i = 1;i<= r;i++){
            bd = d * bd; 
        }
        return bd;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();
        int b = sc.nextInt();
        
//        System.out.println(nthRoot(33.65,3)); //return  ³√(33.65)
        System.out.println(nthRoot(n,b));     //return  ᵇ√(n)
        System.out.println(squareRoot(n));      // return √(n)
    }
    
}
