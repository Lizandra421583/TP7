public class Quadrado extends Quadrilateros
{
    private double lado;
    private double perimetro;
    private double area;
    
    public void setlado(double lado) {
        this.lado = lado;
    }
    public double getlado(){
        return lado;
    }
    
    public double CalculoPerimetro() {
        perimetro = 4*lado;
        return(perimetro);
    }
    
    public double CalculoArea() {
        area = lado*lado;
        return(area);
    }
    
    public void ImprimeDados() {
        System.out.println("Lado do quadrado: " +lado);
        System.out.println("Perímetro do quadrado: " +perimetro);
        System.out.println("Área do quadrado: " +area);
    }
}
