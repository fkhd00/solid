package solidPrinciples;

public class Computer extends Plotter implements ReportPdf,EmailSubmission {
    //to loosen the tight coupling
    MeanSquaredValues msValues;
    public Computer(MeanSquaredValues ms){
        this.msValues=ms;
    }

    @Override
    public void twoDGraph() {
        msValues.calculateValues();
        System.out.println("This is a two Dimensional Graph by computer.");
    }

    @Override
    public void threeDGraph() {
        msValues.calculateValues();
        System.out.println("This is a three dimensional graph by computer.");
    }

    @Override
    public void createPdfReport() {
        System.out.println("Pdf report Created");
    }

    @Override
    public void emailSubmission() {
        System.out.println("Submitted through email.");
    }
}
