public class Str
{
    public static void factorial(int n){//Factorial without using function
         int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print("factorial :"+fact);
    }
    public static void sq(int n){//square of num
        System.out.print("square : "+(n*n));
    }
    public static void multiple(int n){//Multiplication table

        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    
    public static void power(int x,int y){//Calculate x to the power y
        int result=1;
        for(int i=0;i<y;i++){
            result=result*x;
        }
        System.out.print(result);
    }
    
    public static void sum(int n){//Sum of natural numbers
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
    
public static void lower(char c){//lower to upper
    for(char ch='a';ch<=c;ch++){
        System.out.print((char)(ch-32));
    }
}
public static void upper(char c){//upper to lower
    for(char ch='A';ch<=c;ch++){
        System.out.print((char)(ch+32));
    }
}

public static void rangeprime(){//range of prime
    int start=0;
    int end=30;
    
    for(int num=start;num<=end;num++){
        boolean prime =true;
        if(num<2){
            prime=false;
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    prime=false;
                
                }
            }
            if(prime){
                System.out.print(num+" ");
            }
        }
    }
}

public static void factor(int n){
    for(int i=1;i<n;i++){
        if(n%i==0){
            System.out.print("factor :"+i);
        }
    }
}
public static void Celsius ( double celsius){//Celsius to Fahrenheit Formula
double n = (celsius * 9 / 5) + 32;
System.out.print(" Celsius : "+n);
}
public static void Fahrenheit(double f){//Fahrenheit to Celsius Formula
    double n = (f - 32) * 5 / 9;
    System.out.print("Fahrenheit :"+n);
}

public static void count(int n){ //Count the number of digit in an integer
    int count=0;
    for (int i=0;i<=n;i++){
        count++;
    }
    System.out.print(" total count : "+count);
}

public static void revnum(int n) {//Reverse the digits of given number

    int result = 0;

    while(n > 0) {

        int rem = n % 10;//last digits of number

        result = result * 10 + rem;

        n = n / 10;
    }

    System.out.println("Reverse Number: " + result);
}



    public static void  replace(String word){//replace String without build function
  word=word.toUpperCase();
  String result="";
  for(int i=0;i<word.length();i++){
char c=word.charAt(i);
if(c>='A'&& c<='Z'){
  result=result+c;
}
  }
   System.out.print(result);
}


      public static void frequencychar(String words){//Find the Frequency of a Character in a String
    char target='a';
    int count=0;
    for(int i=0;i<words.length();i++){
      char c=words.charAt(i);
      if(c==target){
        count++;
      }
    }
    System.out.print(count);
  }

    
    


public static void main(String[] args) {
    revnum(12345);
}


}
