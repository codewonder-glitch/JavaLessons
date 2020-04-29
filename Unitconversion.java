import java.util.Scanner;
public class Unitconversion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Pls enter the no");
        Float f=in.nextFloat();
        System.out.println(f +" inch is "+ (float)f*0.0254);

    }
}
