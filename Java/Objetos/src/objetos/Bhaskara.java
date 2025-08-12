package objetos;

public class Bhaskara {
    
    public String calcular(double a, double b, double c) {
        
        double delta = b * b - 4 *a * c;
        if(delta < 0) {
            return "Sem raízes reais.";
        }
        double x1 = (-b +Math.sqrt(delta) / (2 *a));
        double x2 = (+b +Math.sqrt(delta) / (2 *a));
        return "Bhaskara:\nX1 = " + x1 + "\nX2 = " + x2;
    }
    
}
