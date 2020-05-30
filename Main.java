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
    //calls method for each number, sets it to variable, sets second variable for calculating//
    numberOne = getValidNumber();
    numberOneCalc = numberOne;
    numberTwo = getValidNumber();
    numberTwoCalc = numberTwo;
    
    //explains Russian math to user//
    System.out.println(
      "You are multiplying "  +numberOne + " and " +numberTwo + "\n"
      + "In 'Russian Math' you take your two numbers " +numberOne + " and " + numberTwo + "\n"
      + "And you half and double your numbers...\n"
      + "So, you half " +numberOne + " and you'll double " + numberTwo
    );

   //adds numbers to arraylist// 
  numberOneList.add(numberOne);
  numberTwoList.add(numberTwo);

  //halves first number until we reach one, doubles second number the same number of times, counts number of times it is halved/doubled //
  while (numberOneCalc > 1) {
    numberOneCalc = numberOneCalc/2;
    numberOneList.add(numberOneCalc);
    numberTwoCalc = numberTwoCalc*2;
    numberTwoList.add(numberTwoCalc);
    count++; 
  }

//explains next steps//
  System.out.println("First, we half our first number " +numberOne);
  System.out.println("And if we get a fraction, we get rid of those, we round down. For example, 11 divided by 2 is 5.5, but we would keep 5.");
  System.out.println("So, we get: ");

  //lists numbers in second arraylist/column //
  for (int i = 0; i < numberOneList.size(); i++) {
    System.out.println("and " +numberOneList.get(i));
  } 
  System.out.println("And we double our second number as many times as needed to half our first number, in this case: " +count);

  //lists numbers in second arraylist/column //
  for (int i = 0; i < numberTwoList.size(); i++) {
    System.out.println("and we get" +numberTwoList.get(i));
  } 
  System.out.println(" ");
  System.out.println("We now have: " +numberOneList);
  System.out.println("and we have: " +numberTwoList);
  System.out.println(" ");
  System.out.println("We put them into columns, the first number and it's halves on the left and the second number and it's doubles on the right.");
 

 //lists the numbers in columns to more easily show the matching numbers//
  for (int i = 0; i < numberTwoList.size(); i++) {
    System.out.println(numberOneList.get(i)+ " and " + numberTwoList.get(i));
  }
  System.out.println("And we remove any even numbers in the lefthand column and the numbers that correspond in the righthand column, too.");
  
 // removes numbers if they are even, and the corresponding item number in the second list//
  int j = 0;
  while (j < numberOneList.size()) {
    int even=numberOneList.get(j)%2;
    if (even==0){
      System.out.println(numberOneList.get(j)+" is an Even Number, so we remove it and "+ numberTwoList.get(j));
      numberOneList.remove(j);
      numberTwoList.remove(j);
    } else {
      j++;
    }
  }

//shows resulting columns of numbers side by side//
  System.out.println("We now have the following columns:");

  for (int i = 0; i < numberTwoList.size(); i++) {
    System.out.println(numberOneList.get(i)+ " and " + numberTwoList.get(i));
  }

  System.out.println("We add up the numbers in our righthand column, to get our answer:");

//adds numbers in righthand column
  for (int i = 0;  i < numberTwoList.size(); i++){
    sum += numberTwoList.get(i);
    System.out.println(+numberTwoList.get(i));
  }


//gives result.
  System.out.println("equals");
  System.out.println(sum);
  System.out.println("And " +sum + " is the same as " +numberOne +" times " +numberTwo);
  }
} 
  
