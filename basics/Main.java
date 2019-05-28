import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
   
    String noDog = pluralize("dog", 0);
    String oneDog = pluralize("dog", 1);
    String threeDogs = pluralize("dog", 3);
    
    System.out.println("I have 0 " + noDog);
    System.out.println("I have 1 " + oneDog);
    System.out.println("I have 3 " + threeDogs);


    flipNHeads(2);
    flipNHeads(3);

    clock();

  }

  
  public static void flipNHeads(int n) {
    int count = 0;
    int headCount = 0;
    int headsInRow[] = new int[n];

   while(headCount < headsInRow.length){

    double rand= Math.random();
    if(rand < 0.5){
      System.out.println("tails");
      headCount = 0;
      headsInRow = new int[n];
    }else{
      System.out.println("heads");
      headsInRow[headCount++] = 1;
    }
    count++;
   }

   System.out.println("It took " + count + " flips to flip " + n + " heads in a row.");

  }

  public static void clock() {
    int prevSec = 0;
    while(true){
      LocalDateTime now = LocalDateTime.now();
      int second = now.getSecond();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if(prevSec != second){
        System.out.println(time);
        prevSec = second;
      }
    }
  }

  
  public static String pluralize(String myString, int count) {
    String plural = myString;
   
    if(count > 1 || count == 0){
      plural += "s";
    }

    return plural;
  }
}