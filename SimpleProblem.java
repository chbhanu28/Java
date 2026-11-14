public class SimpleProblem {

public static void rec(){//Find area of a rectangle
int l=5;
int b=6;
System.out.print((l*b));
}

public static void swap(int a,int b){//Swap value of three variables

    int temp=a;
    a=b;
    b=temp;
    System.out.print("A : "+a);
    System.out.print("B :"+b);
}

public static void swapp(int a,int b){//Swap value of two variables
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.print("a :"+a);
    System.out.print("B :"+b);
}

public static void check(int num){//Check the given number is odd or even
if(num%2==0){
    System.out.print("Even Number : "+num);
}
else{
    System.out.print("Odd Number : "+num);
}
}

public static void largest(int a,int b,int c){//Find largest among three numbers
    if(a>=b&&a>=c){
        System.out.println("largest number : a");
    }
    else if(b>=c&&b>=c){
                System.out.println("largest number : b");
    }
    else {
                System.out.println("largest number : c");
    }
}

public static void leap(int num){
    if(num%4==0 &&num%100!=0){
        System.out.print("It Is Leap Year");
    }
    else{
        System.out.print("It is Not Leap Year");
    }
}

public static void check1(int num){//Positive negative checking
    if(num > 0){
        System.out.print("Positive Number");
    }
    else if(num < 0){
        System.out.print("Negative Number");
    }
    else{
        System.out.print("Zero");
    }
}


public static void main(String[]args){
   
}
}