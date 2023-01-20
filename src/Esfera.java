public class Esfera extends Forma{
    private double radio;
    private double area;

    public Esfera(String nombre, double radio){
        super(nombre);
        this.radio = radio;
        //System.out.println("Area Esfera: " + Math.PI*4*Math.pow(radio, 2));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double area() {
        area = Math.PI*4*Math.pow(radio, 2);
        return area;
    }
}
