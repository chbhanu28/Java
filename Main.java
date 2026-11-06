public class Main
{
	
	public static void Palindrome(String s){//Palindrome checking
	    for(int i=0;i<s.length()/2;i++){
	        if(s.charAt(i)==s.charAt(s.length()-1)){
	            System.out.print(" Is Palindrome : "+true);
	        }
	    }
	}
	public static void word(String s){//convert a name into its ascii values.

	    for(int i=0;i<s.length();i++){
	        char c=s.charAt(i);
	        System.out.print((int)c+" ");
	    }
	}
	
	public static void str(String s){//find the string of string
	    int len=0;
	    for(int i=0;i<s.length();i++){
	    len++;
	}
	System.out.print(len);
}

public static void strcmp(String s,String s1){
    //comparing 2 strings without strcmp function
    boolean equal=true;
if(s.length()!=s1.length()){
    equal=false;
}else{
   for(int i=0;i<s.length();i++) {
       if(s.charAt(i)==s1.charAt(i)){
           equal=true;
           break;
       }
   }
}
if(equal){
    System.out.print(" Is Equal");
}
else{
    System.out.print("Not Equal");
}
}

public static void copy(String s){//copy one string to otherstring
    String copy="";
    for(int i=0;i<s.length();i++){
        copy+=s.charAt(i);
    }
    System.out.print(" Before String: "+s);
    System.out.print(" After String : "+copy);
}

public static void strcat(String s){//string concatenation without using strcat function
    String result="";
    for(int i=0;i<s.length();i++){
        
        
    }
}


 public static void Strcat(String s,String s1){//string concatenation without using strcat function

  String result="";
  for(int i=0;i<s.length();i++){
    result+=s.charAt(i);
  }
  for(int j=0;j<s1.length();j++){
    result+=s1.charAt(j);
  }
  System.out.print("string concatenation : "+result);
 }
 
 public static void replace(String s){//Pattern replacement
     String result="";
     for(int i=0;i<s.length();i++){
       char  c=s.charAt(i);
         if(c=='a'){
             c='*';
             result+=c;
         }
         else{
             result+=c;
         }
     }
     System.out.print(result);
 }
 
 public static void vowel(String s){//find vowel
     for(int i=0;i<s.length();i++){
         String s1=s.toLowerCase();
         char c=s1.charAt(i);
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
           System.out.print(" voewl : "+c);
         }
 }
 }
 
 public static void rev(String s){//Reverse the given string

     for(int i=s.length()-1;i>=0;i--){
         char c=s.charAt(i);
         System.out.print(c);
     }
 }

	public static void main(String[] args) {
rev("bhanu");
}
}