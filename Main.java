import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Random generator = new Random();

    int losowa[] = new int[11];
    int suma=0;
    int srednia;
    
    for (int i = 1; i < 11; i++) {
    int x = generator.nextInt(2);
    if (x == 1) {
    int zmienna = generator.nextInt(100);
     losowa[i] = zmienna;
       } else {
       int zmienna = (generator.nextInt(100))-100;
        losowa[i] = zmienna;
         }
       System.out.println(losowa[i]);
        }
    
        for(int i=0;i<10;i++){
          suma=suma+losowa[i];
        }
        srednia=suma/10;
        System.out.println("Średnia ocen wynosi: "+srednia); 
    
  }
}