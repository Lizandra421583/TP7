public class Retangulo extends Quadrilateros
{
    private double base;
    private double altura;
    private double perimetro;
    private double area;
    
    public void setbase(double base) {
        this.base = base;
    }
    public double getbase(){
        return base;
    }
    
    public void setaltura(double altura) {
        this.altura = altura;
    }
    public double getaltura(){
        return altura;
    }
    
    public double CalculoPerimetro() {
        perimetro = 2*base + 2*altura;
        return(perimetro);
    }
    
    public double CalculoArea() {
        area = base*altura;
        return(area);
    }
    
    public void ImprimeDados() {
        System.out.println("Base do retângulo: " +base);
        System.out.println("Altura do retângulo: " +altura);
        System.out.println("Perímetro do retângulo: " +perimetro);
        System.out.println("Área do retângulo: " +area);
    }
}
