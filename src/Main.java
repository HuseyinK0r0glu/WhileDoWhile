import java.util.*;
public class Main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Start of the loop");
        while(i<=5){
            System.out.print(i + ",");
            i++;
        }
        System.out.println("\nEnd of the Loop");


        int z = 10;
        do{
            System.out.println(z + ",");
            z++;
        }while(z<=5);


        for(int u = 1; u<=5; u++){
            System.out.print(u + ",");
        }
    }
}