package matematica;

public class Matematica {

    public double soma(double a, double b) {
            return a + b;
    }
    
    public String paridade(int a) {
        
        String text;
        
        if(a % 2 == 0) {
            text = "O número " + a + " é par";
        } else {
            text = "O número " + a + " é impar"; 
        }
        
        return text;
        
    }
    
    public String bhaskara(int a, int b, int c) {
        
       double delta = Math.pow(b, 2) - 4 * a * c;
       
       double x1 = (-b + Math.sqrt(delta)) / (2 * a);
       double x2 = (-b - Math.sqrt(delta)) / (2 * a);
       
       String text = "delta: " + delta + " x1: " + x1 + " x2: " + x2;
       
       return text;
       
    }

}
    

