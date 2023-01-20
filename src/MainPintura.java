public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 20, 35);
        Esfera esfera = new Esfera("Esfera", 15);
        Cilindro cilindro = new Cilindro("Cilindro", 10, 30);
        System.out.println(pintura.cantidadPintura(rectangulo));
        System.out.println(pintura.cantidadPintura(esfera));
        System.out.println(pintura.cantidadPintura(cilindro));
    }
}
