class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    // four data types- int, double , boolean, char
    // simplest unit of data//non primitive data types are built from primitive data
    // types

    // variables
    // hold data

    int age = 13; // holds integers
    double gpa = 4.0; // allows decimal numbers(both ints and doubles can hold positive and negative numbers)
    boolean likesCats = true;
    // booleans are either true or false
    char g = 'g'; // holds a chacter
    String greetings = "hi hi";// holds a string of characters

    // mathematical operators, comparison operators, and logical operators
    // Ex. +, -, *, /, %, >=, >, <=, <, ==, !=, ||, &&
    // can be used to change data

    boolean ifSunny = true;
    if (!ifSunny) {
      System.out.println("we better get home quick");
    } else {
      System.out.println("we should enjoy the nice day");
    }

    // else if
    // goes after an if and before an else and can use as many as needed

    age = 5;

    if (age < 16) {
      System.out.println("you are too young to drive");
    } else if (age >= 16 && age < 65) {
      System.out.println("vroom");
    } else {
      System.out.println("please go to the dmv to renew your license");
    }

    // updating variables
    // System.out.println(counter);
    // possible in compsci because code runs right side first

    // loops

    // while vs for loops
    // while loops are used more for qualitative conditions

    // for loops are more for quantitative conditions(when you know how many times
    // you want to loop)

    // while (counter < 6){
    // System.out.println(counter);
    // counter++;
    // }
    // System.out.println(counter);

    // if (true)
    // System.out.println("");
    // int counter = 10;
    // while (counter >=0){
    // System.out.println(counter);
    // counter= counter-1;
    // }
    // for loops
    // format
    // for(starting point; condition; updating variable) {
    // body;
    // }
    // starting point: int i = 0; (but can start at any whole number you want)
    // condition: i < 10
    // updating variable: i = i + 1 or i++;
    int i;
    for (i = 0; i < 5; i++) {
      System.out.println(i);
    }
    System.out.println(i);

    for (int t = 10; t >= 0; t = t - 1) {
      System.out.println(t);

    }
  }
}