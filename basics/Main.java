
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
  public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);

int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
//-------------------------------------------------------------------------------------------
int n=3;
System.out.println("It took " + flipNHeads(n)+ " flips to flip " + n + "  head in a row.");
//-------------------------------------------------------------------------------------------
clock();
}
//-------------------------------------------------------------------------------------------
  public static String pluralize (String word,int num) {
    if (num >1 || num ==0 ){
      return  word+'s';
    
}
  return  word;
    
}
//--------------------------------------------------------------------------------------------------
public static int flipNHeads (int n ) {
int counflip=0;
for(int i=0;i<n;i++){
while(Math.random()<.5){
counflip=counflip+1;
System.out.println("tails");
}
counflip=counflip+1;
System.out.println("head");
}
return counflip;
}

//--------------------------------------------------------------------------------------------------
public static void clock() {

LocalDateTime now = LocalDateTime.now();
String oldtime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
System.out.println(oldtime);
  while (true) {
                 now = LocalDateTime.now();
                String newtime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                if (oldtime.equals(newtime)) {
                    continue;
                }
                System.out.println(newtime);
                oldtime = newtime;
            }

}

















}