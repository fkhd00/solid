package solidPrinciples;

import java.util.Objects;
import java.util.Scanner;

public class Display {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which user you want. Human or Computer");
        String user = scanner.nextLine();
        System.out.println("Enter dimension of your data. 2D or 3D");
        String dimension=scanner.nextLine();

        if(user.equalsIgnoreCase("computer") && Objects.equals(dimension, "2D")){
            Computer comp=new Computer(new MStowDimensional());
            comp.twoDGraph();
            comp.createPdfReport();
            comp.emailSubmission();
        }
        else if(user.equalsIgnoreCase("computer") && Objects.equals(dimension, "3D")){
            Computer comp=new Computer(new MSThreeDimensional());
            comp.threeDGraph();
            comp.createPdfReport();
            comp.emailSubmission();
        }
        else if(user.equalsIgnoreCase("human") && Objects.equals(dimension, "2D")){
            Human human = new Human(new MStowDimensional());
            human.twoDGraph();
            human.createPaperReport();
            human.physicalSubmission();
        }
        else if(user.equalsIgnoreCase("human") && Objects.equals(dimension, "3D")){
            System.out.println("Sorry human can't plot the three dimensional graph");
        }
        else throw new AssertionError("User or dimensions are incorrect");


    }
}
