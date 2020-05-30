import java.io.*; 
import java.lang.*; 
import java.util.*; 
import java.util.Scanner;

class Main {
  // gets and validates a user's input as an int
  public static int getValidNumber() {
    Scanner textScanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    String input = textScanner.nextLine();
    while (true){
      if (input.matches("-?\\d+")) {
        // input is composed of only digits, so it is safe to parse
        int number = Integer.parseInt(input);
        System.out.println("You entered a number " + number);
        return number;
      }

      //prompts for invalid data, requests input//
      System.out.println("Sorry, couldn't understand you!");
    }
  }

  public static void main(String[] args) {
    int numberOne = 0;
    int numberTwo = 0;
    int numberOneCalc = 0;
    int numberTwoCalc = 0;
    int count = 0;
    int sum = 0;
    ArrayList<Integer> numberOneList = new ArrayList<Integer>();
    ArrayList<Integer> numberTwoList = new ArrayList<Integer>();
    
    numberOne = getValidNumber();
    numberOneCalc = numberOne;
    numberTwo = getValidNumber();
    numberTwoCalc = numberTwo;
    
    System.out.println(
      "You are multiplying "  +numberOne + " and " +numberTwo + "\n"
      + "In 'Russian Math' you take your two numbers " +numberOne + " and " + numberTwo + "\n"
      + "And you half and double your numbers...\n"
      + "So, you half " +numberOne + " and you'll double " + numberTwo
    );
  numberOneList.add(numberOne);
  numberTwoList.add(numberTwo);
  while(numberOneCalc > 1){
    numberOneCalc = numberOneCalc/2;
    numberOneList.add(numberOneCalc);
    numberTwoCalc = numberTwoCalc*2;
    numberTwoList.add(numberTwoCalc);
    count++; 
  }
  "First, we half our first number " +numberOne);
  System.out.println("And if we get a fraction, we get rid of those, we round down. For example, 11 divided by 2 is 5.5, but we would keep 5.");
  System.out.println("So, we get: ");
  for (int i = 0; i < numberOneList.size(); i++) {
            System.out.println("and " +numberOneList.get(i));
        } 
  System.out.println("And we double our second number as many times as needed to half our first number, in this case: " +count);
  for (int i = 0; i < numberTwoList.size(System.out.println(); i++) {
            System.out.println("and " +numberTwoList.get(i));
        } 
  System.out.println(" ");
  System.out.println("We now have: " +numberOneList);
  System.out.println("and we have: " +numberTwoList);
  System.out.println(" ");
  System.out.println("We put them into columns, the first number and it's halves on the left and the second number and it's doubles on the right.");
  for (int i = 0; i < numberTwoList.size(); i++) {
  System.out.println(numberOneList.get(i)+ " and " + numberTwoList.get(i));
  }
  System.out.println("And we remove anything even in the lefthand column");
  
 // numberOneList.removeIf(num -> num%2==0);
  int j = 0;
  while (j < numberOneList.size()) {
    int even=numberOneList.get(j)%2;
    if (even==0){
      System.out.println(numberOneList.get(j)+" is an Even Number, so we remove it and "+ numberTwoList.get(j));
      numberOneList.remove(j);
      numberTwoList.remove(j);}
      //i = i-1;}
    else {
      j++;
    }
  }
  System.out.println("We now have the following columns:");
  for (int i = 0; i < numberTwoList.size(); i++) {
    System.out.println(numberOneList.get(i)+ " and " + numberTwoList.get(i));
  }
  System.out.println("We add up the numbers in our righthand column, to get our answer:");
  for (int i = 0;  i < numberTwoList.size(); i++){
    sum += numberTwoList.get(i);
    System.out.println(+numberTwoList.get(i));
  }
  System.out.println("equals");
  System.out.println(sum);
  System.out.println("And " +sum + " is the same as " +numberOne +" times " +numberTwo);
  }
} 
  
