package solidPrinciples;

public class MSThreeDimensional extends Data implements MeanSquaredValues{
    DataInterface data=new Data();

    @Override
    public void calculateValues() {
        data.threeDimensionalData();
        System.out.println("These are mean squared values for 3D data");
    }
}
