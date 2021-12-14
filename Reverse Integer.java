class Solution {
    public int reverse(int x) {
       int result = 0;

        while (x != 0)
        {
            int tail = x % 10; 
            System.out.println("tail "+ tail);
            int newResult = result * 10 + tail; 
            System.out.println("newResult "+ newResult);
            System.out.println("newResult -tail "+ (newResult - tail));
            System.out.println((newResult - tail) / 10);
            
            if ((newResult - tail) / 10 != result) // checking if it's not valid. Return 0.
            { 
                
                return 0; 
            }
            result = newResult; // dumping the newResult value in result
            x = x / 10; // updating our x integer/
            
            System.out.println("result "+ result);
            System.out.println("x "+ x);
            
        }

        return result;
        
    }
}
