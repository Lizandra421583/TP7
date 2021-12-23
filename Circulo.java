public class Circulo extends Quadrilateros
{
    public double raio;
    private double perimetro;
    private double area;
    
    public Circulo() {
        raio = 1;
    }
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double CalculoPerimetro() {
        perimetro = 2*3.14*raio;
        return(perimetro);
    }
    
    public double CalculoArea() {
        area = 3.14*raio*raio;
        return(area);
    }
    
    public void ImprimeDados() {
        System.out.println("Lado do quadrado: " +raio);
        System.out.println("Perímetro do quadrado: " +perimetro);
        System.out.println("Área do quadrado: " +area);
    }
}
