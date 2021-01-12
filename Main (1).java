import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner kbd=new Scanner(System.in);
     int N=kbd.nextInt();
     if((1<=N)&&(N<=100)){
       for(int i=1;i<=N;i++){
         System.out.print(i+ " " + "Abracadabra"+"\n");
       }
     }    
  }
}