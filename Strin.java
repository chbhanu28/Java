import java.util.*;

public class Strin {

public static void count(String words){//Program to Count Blanks,Tabs and Newlines
int Blanks=0;
int Tabs=0;
int Newlines=0;
int Underline=0;
for(int i=0;i<words.length();i++){
  char c=words.charAt(i);
if(c=='\t'){
  Tabs++;
}
else if(c=='\b'){
  Blanks++;
}
else if(c=='\n')
{
Newlines++;
}
else if(c=='_'){
  Underline++;
}
}
System.out.println("Blanks : "+Blanks);
System.out.println("Tabs : "+Tabs);
System.out.println("Newlines :"+Newlines);
System.out.println("Underline : "+Underline);

}

public static void len(String words){//calculating string length without strlen function

  int length=0;
  for(int i=0;i<words.length();i++){
    length++;
  }
  System.out.print(length);
}

public static void Palindrome(String word){//check Palindrome
boolean Palindrome=true;
  for(int i=0;i<word.length()/2;i++){
    if(word.charAt(i)!=word.charAt(word.length()-1-i)){
      Palindrome=false;
    }
  }
  boolean t=Palindrome?true:false;
  System.out.print(t);
}

public static void ascii(){
  int number=65;
  System.out.println("Character : "+(char)(number));

  char ch='A';
  System.out.println("Number : "+(int)(ch));
}

public static void replace(String word){//replace without build functions
  String result="";
  for(int i=0;i<word.length();i++){
    char ch=word.charAt(i);
if(ch=='*'){
result=result+"_@";
}
  else{
    result=result+ch;
  }
}
System.out.print(result);
}

public static void copy(String word){//copying one to another String
  String update="";
  for(int i=0;i<word.length();i++){
update+=word.charAt(i);
  }
  System.out.println(word);
  System.out.print(update);
}

public static void strcmp(String words,String words1){//comparing 2 strings without strcmp function
boolean equal=true;
if(words.length()!=words1.length()){
equal=false;
}
else
for(int i=0;i<=words.length()-1;i++){
  if(words.charAt(i)!=words1.charAt(i)){
    equal=false;
  }
}
String t=equal ? "Equal":"Not Equal";
System.out.print(t);
}

public static void strcat(String word1,String word2){//string concatenation without using strcat function
  String result="";
  for(int i=0;i<word1.length();i++){
    char c=word1.charAt(i);
    result+=c;
  }
  for(int j=0;j<word2.length();j++){
    char c=word2.charAt(j);
    result=result+c;
  }
  System.out.print("Result : "+result);
}


public static void vowel(String word){//Finding vowels
  int vowel=0;
  int notvowel=0;
  word=word.toUpperCase();
  for(int i=0;i<word.length();i++){
    char c=word.charAt(i);
    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
      vowel++;
    }
    else{
notvowel++;
    }
  }
  System.out.println("Vowel : "+vowel);
  System.out.print("Not Vowel :"+notvowel);
}

public static void sorting(String words){//Sorting in alphabetical order
   char ch []=words.toCharArray();
  for(int i=0;i<ch.length;i++){
    for(int j=i+1;j<ch.length;j++){
      if(ch[i]<ch[j]){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
      }
    }
  }
  System.out.print(new String(ch));
}

public static void freqchar(String s,char target){//Find the frequency of a character in a string
  int count=0;
  for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(c==target){
     count++;
    }
  }
  System.out.println("targetCount : "+count);
}

public static void remove(String word){//Remove characters in string except alphabets
word=word.toUpperCase();
String result="";
for(int i=0;i<word.length();i++){
  char c=word.charAt(i);
  if(c>='A'&&c<='Z'){
    result=result+c;
  }
}
System.out.print(result);
}


        public static void main(String[] args) {
remove("bh@nuPr@k*ash");
        }
}