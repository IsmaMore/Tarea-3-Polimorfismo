public class Rectangulo extends Forma{
    private double logitud;
    private double ancho;
    private double area;

    public Rectangulo(String nombre, double logitud, double ancho){
        super(nombre);
        this.logitud = logitud;
        this.ancho = ancho;
    }

    public String toString() {
        return logitud + " " + ancho + " " + area;
    }

    public double getLogitud() {
        return logitud;
    }

    public void setLogitud(double logitud) {
        this.logitud = logitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double area() {
        this.area = logitud * ancho;
        return area;
    }
}
