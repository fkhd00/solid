package solidPrinciples;

public class MStowDimensional implements MeanSquaredValues{

    DataInterface data=new Data();

    @Override
    public void calculateValues() {
        data.twoDimensionalData();
        System.out.println("these are mean squared values for 2D data");
    }
}
