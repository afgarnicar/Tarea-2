public class ObjetosDeAutomovil {
    public static void main(String[] args) {
        //Herencia(capacidad de crear clases u objetos a partir de otras clases)
        Automovil carrito1 = new Automovil("Mercedes","AMG","Blanco");
        carrito1.setCilindraje((short)2000);
        System.out.println("Caracteristicas del carrito 1: ");
        System.out.println("Marca : " + carrito1.getMarca());
        System.out.println("Modelo :" + carrito1.getModelo());
        System.out.println("Color : " + carrito1.getColor());
        System.out.println("Cilindraje : " + carrito1.getCilindraje());

        Automovil carrito2 = new Automovil("Testarossa","Rojo");
        carrito1.setCilindraje((short)4933);
        System.out.println("\nCaracteristicas del carrito 2: ");
        System.out.println("Marca : " + carrito2.getMarca());
        System.out.println("Modelo :" + carrito2.getModelo());
        System.out.println("Color : " + carrito2.getColor());
        System.out.println("Cilindraje : " + carrito2.getCilindraje());

        Automovil carrito3 = new Automovil((short)3667);
        carrito3.setMarca("Audi");
        carrito3.setModelo("Q8");
        carrito3.setColor("Negro mate");
        System.out.println("\nCaracteristicas del carrito 3: ");
        System.out.println("Marca : " + carrito3.getMarca());
        System.out.println("Modelo :" + carrito3.getModelo());
        System.out.println("Color : " + carrito3.getColor());
        System.out.println("Cilindraje : " + carrito3.getCilindraje());
    }
}
