// Abstraccion: capacidad de crear una clase con propiedades y metodos o tipo de dato nuevo
public class Automovil {
    
    // Propiedades

    // Se hace uso del encapsulamiento (private static), para que las propiedades solo
    // puedan ser modificados con metodos propios de la clase
    
    private static String marca, modelo, color;
    private static short cilindraje;

    // Metodos
    // Crear el constructor de la clase
    public Automovil (String marca, String modelo, String color) { //constructor
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    // Polimorfismo: El mismo metodo realiza acciones diferentes
    public Automovil (String modelo, String color) {
        this.marca = "Ferrari";
        this.modelo = modelo;
        this.color = color;
    }
    public Automovil(short cilindraje){
        this.cilindraje = cilindraje;
    }

    // Getter y Setter

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Automovil.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Automovil.modelo = modelo;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Automovil.color = color;
    }

    public static double getCilindraje() {
        return cilindraje;
    }

    public static void setCilindraje(short cilindraje) {
        Automovil.cilindraje = cilindraje;
    }

}
