public class CountGreaterThanAverage { 
    public static void main(String[] args) {
     
        int[] responseTimes = { 100, 200, 150, 300 }; 
        int count = countGreater(responseTimes); 
        
        System.out.println("Output: " + count); 
    } 
    
    public static int countGreater(int[] arr) { 
        if (arr.length < 2) return 0; 
        int count = 0; 
        double sum = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) { 
            double average = sum / i; 
            if (arr[i] > average) count++; 
            sum += arr[i]; 
        } 
        
        return count; 
    } 
}
