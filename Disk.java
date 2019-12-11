
// OS Project By Rafael Perez, Edison Blum, Christopher Estevez, Ramish Saqib, Brian Jamal Jones
package homework;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
class Disk{ //skeleton by Rafael Perez

   public static int[] takeOutNode(int[] arr, int index)
{
  

if (arr == null || index < 0 || index >= arr.length) {
return arr;
}


int[] ArrayTwo = new int[arr.length - 1];
  

for (int i = 0, k = 0; i < arr.length; i++) {
  

if (i == index) {
continue;
}

ArrayTwo[k++] = arr[i];
}
  

return ArrayTwo;
}
//FCFS GOES HERE - Ed
   int FCFS(int[] arr, int size){
       int totalmoves=0;
       for (int i=0;i<size-1;i++){
           totalmoves+=Math.abs(arr[i]-arr[i+1]);
       }
       return totalmoves;
   }
  
// SSTF GOES HERE - Chris & Ramish
   
// INSERT SCAN HERE - Brian
 

   
 //MAIN METHOD
   public static void main(String[] args) {
       int[] arr=new int[1000];
       Random rand = new Random();
       for (int i=0;i<arr.length;i++) {
           arr[i] = rand.nextInt(5000);
       }
       int firstNum=arr[0];

       Disk m = new Disk();
       System.out.print("Total Distance with FCFS: ");
       System.out.println(m.FCFS(arr,arr.length));
       System.out.print("Total Distance with SSTF: ");
       System.out.println(m.SSTF(arr,arr.length,firstNum));
       System.out.print("Total Distance with SCAN: ");
       System.out.println(m.SCAN(arr,arr.length,firstNum));
   }
}