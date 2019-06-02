package lab1;

public class Fibonaci {
    
    private String fib_text;
    
     public String getStr() {
        return this.fib_text;
    }
     
     public Fibonaci() {

    }

    void fib(int n) {

        int lo = 1;
        int hi = 1;
        String result = "";    
        
        System.out.print("1 ");
        while (hi < n) {

            hi = lo + hi;
            lo = hi - lo;

            String mark;
            if ((hi % 2) == 0) {
                mark = "*";
            } else {
                mark = "";
            }
                      
            result = result + hi + mark + " ";
            
        }
        System.out.println(result);
        fib_text = result;
        
        
    }
}
