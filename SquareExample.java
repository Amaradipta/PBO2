public class SquareExample {
    public static void main(String[] args) {
        Square square1 = new Square(4, 4);
        System.out.println("Luas: " + square1.getLuas());
        System.out.println("Perimeter: " + square1.getPerimeter());

        square1.setWidth(5);
        square1.setHeight(5);
        System.out.println("Luas: " + square1.getLuas());
        System.out.println("Perimeter: " + square1.getPerimeter());
    }
}