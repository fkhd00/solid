package solidPrinciples;

public class Data implements DataInterface{
    @Override
    public void twoDimensionalData() {
        System.out.println("This is 2D data.");
    }

    @Override
    public void threeDimensionalData() {
        System.out.println("This is 3D data.");
    }
}
