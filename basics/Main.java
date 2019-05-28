public class Main {
  public static void main(String[] args) {
   
    String noDog = pluralize("dog", 0);
    String oneDog = pluralize("dog", 1);
    String threeDogs = pluralize("dog", 3);
    
    System.out.println("I have 0 " + noDog);
    System.out.println("I have 1 " + oneDog);
    System.out.println("I have 3 " + threeDogs);




  }

  
  public static void loopTo(int max) {
   
  }

  
  public static String pluralize(String myString, int count) {
    String plural = myString;
   
    if(count > 1 || count == 0){
      plural += "s";
    }

    return plural;
  }
}