/**
 * Represents a cube and provides operations to compute
 * and display its volume.
 */
class Cube {

    private double side;

    /**
     * Creates a cube with the given side length.
     *
     * @param side the length of one side of the cube
     */
    Cube(double side) {
        this.side = side;
    }

    /**
     * Calculates the volume of this cube and prints it to standard output.
     */
    public void volume() {
        System.out.print("Volume is ");
        System.out.println(this.side * this.side * this.side);
    }

    /**
     * Updates the side length of this cube.
     *
     * @param side the new side length
     */
    private void updateSide(double side) {
        this.side = side;
    }
}

/**
 * Entry point that demonstrates creating a {@link Cube} and
 * printing its volume.
 */
class CubeMain {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private CubeMain() {
    }

    /**
     * Main function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Cube c = new Cube(12);
        c.updateSide(100);
        c.side = 122;
        c.volume();
    }
}
