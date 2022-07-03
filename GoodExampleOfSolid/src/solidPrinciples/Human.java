package solidPrinciples;

public class Human implements TwoDimensionalPlot ,ReportPaper,PhysicalSubmission{

    MeanSquaredValues msvalues;
    public Human(MeanSquaredValues ms){
        this.msvalues=ms;
    }
    @Override
    public void twoDGraph() {
        msvalues.calculateValues();
        System.out.println("This is a two dimensional graph by human");
    }

    @Override
    public void physicalSubmission() {
        System.out.println("Submitted Physically.");
    }

    @Override
    public void createPaperReport() {
        System.out.println("Paper report created.");
    }
}
