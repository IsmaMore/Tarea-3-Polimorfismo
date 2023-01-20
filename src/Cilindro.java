public class Cilindro extends Forma{
    private double radio;
    private double altura;
    private double area;

    public Cilindro(String nombre, double radio, double altura){
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    public String toString() {
        return radio + " " + altura + " " + area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double area() {
        this.area = Math.PI * Math.pow(radio, 2) * altura;
        return area;
    }
}
