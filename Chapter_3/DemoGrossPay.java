public class DemoGrossPay {

     public static final double HOURLY_RATE = 22.75;
     
     public static void main(String[] args) {
          calculateGross(10.0);
          calculateGross(25.0);
          calculateGross(37.5);
    
     }
     
     public static void calculateGross(double hours) {
          double grossPay = hours * HOURLY_RATE;
          System.out.printf("%.1f hours at $%.2f per hour is $%.3f%n", hours, HOURLY_RATE, grossPay);
     
     }
}