import java.util.Scanner;
import java.util.Random;
 class java_lab1{
    public static void main(String[] args){
     boolean cycle=true;
     while(cycle==true){
      Scanner scan =new Scanner(System.in);
      System.out.println("Введите задание");
       System.out.println("Задание 0. a^2+b^2=c^2");
      System.out.println("Задание 1. A^3+B^3+C^3=ABC");
      System.out.println("Задание 2. 2^n");
      System.out.println("Задание 3. factorial n");
      System.out.println("Задание 4. iстиннiсть теореми Ферма");
      System.out.println("Задание 5. В масивi помiняти мiсцями min та max ");
      int menu=scan.nextInt();
       if(menu==0){
     Zadanie0 zadanie0=new Zadanie0();
     zadanie0.katet();
     }
     if(menu==1){
     Zadanie1 zadanie1=new Zadanie1();
     zadanie1.sortingout();
     }
     else if(menu==2){
     Zadanie2 zadanie2 = new Zadanie2();
         zadanie2.n();
     }
     else if(menu==3){
          Zadanie3 zadanie3=new Zadanie3();
          zadanie3.factorial();

     }
     else if(menu==4){
          Zadanie4 zadanie4=new Zadanie4();
          zadanie4.Ferma();

     }
     else if(menu==5){
          Zadanie5 zadanie5=new Zadanie5();
          zadanie5.array();

     }
      else{
          cycle=false;
          System.out.println("\t\tThe end!");
      }
}
    }
} 
class Zadanie0{
     public void katet(){
          Scanner scan =new Scanner(System.in);
          double a, b, c;
           System.out.println("Введiть a: ");
          a=scan.nextDouble();
           System.out.println("Введiть b: ");
          b=scan.nextDouble();
            c =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
           System.out.println(c);
     }
}
class Zadanie1{
     public void sortingout(){
      for(int A=0; A<1000; A++){
      for(int B=0; B<5000; B++){
       for(int C=0; C<5000; C++){
          long result=A*A*A+B*B*B+C*C*C;
           long abc=A*B*C;
            if(result==abc && result>0){
              System.out.println(" A= "+ A + " B= " + B +" C= " + C +" Result= " + abc);
}
                }
            }
         }
     }
}
class Zadanie2{
     public void n(){
          long res=1;
          Scanner scan =new Scanner(System.in);
         System.out.println("Введiть степiнь 2: ");
         int num = scan.nextInt();
         for(int i=0; num>i; i++){
          res=2*res;
         }
         System.out.println(res);
     }
     }

class Zadanie3{
     public void factorial(){
          Scanner scan =new Scanner(System.in);
           System.out.println("Введiть число:");
          long num = scan.nextLong();
          long result;
          if(num==0){
               result=1;
          }
          else{
               result=1;
               for(int i=1; i<num+1;i++){
                    result=result*i;
               }
          }
           System.out.println(result);
     }
}

class Zadanie4 {
    public void Ferma() {
        int chet = 0;
        for (int a = 1; a < 101; a++) {
            for (int b = 1; b < 101; b++) {
                for (int c = 1; c < 101; c++) {
                    for (int n = 2; n <= 10; n++) {
                        long res1 = (long) Math.pow(a, n);
                        long res2 = (long) Math.pow(b, n);
                        long res3 = (long) Math.pow(c, n);
                        if (res1 + res2 == res3) {
                            chet++;
                            System.out.println(chet + " " + res1 + " + " + res2 + " = " + res3 + "\t\t" + a + "^" + n + " + " + b + "^" + n + " = " + c + "^" + n);
                        }
                    }
                }
            }
        }
    }
}

class Zadanie5 {
    public void array() {
      Scanner scan =new Scanner(System.in);
           System.out.println("Введiть число для arr: ");
          int n = scan.nextInt();
     int max=0;
     int min=100;
     int[] arr = new int[n];
     Random random = new Random();
     for(int i=0; i<n; i++){
          arr[i]=random.nextInt(50);
          if(i==n-1){
            System.out.print(arr[i]+". ");
          }
          else if(i<n){
            System.out.print(arr[i]+", ");
          }
            if(arr[i]>max){
          max=arr[i];
     }
     if(arr[i]<min){
          min=arr[i];
     }  
     }
     System.out.print("\n");
for(int i=0; i<n; i++){
   if(arr[i]==min){
arr[i]=max;
   }
   else if(arr[i]==max){
    arr[i]=min;
   }
    if(i==n-1){
            System.out.print(arr[i]+". ");
          }
          else if(i<n){
            System.out.print(arr[i]+", ");
          }
     }
     System.out.print("\n min = "+min +"\t\tmax = "+ max+"\n");
    }
}




