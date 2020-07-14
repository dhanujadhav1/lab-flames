package service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2){
		
		char[] evaluated=new char[20];
		StringBuffer str1=new StringBuffer(name1);//s1
		StringBuffer str2=new StringBuffer(name1);//s2
		int str1len=str1.length();//a
        int str2len=str2.length();//b
       for(int i=0;i<str1len;i++)
        {
                char c=str1.charAt(i);
      
                for(int j=0;j<str2len;j++)
                {
                        char d=str2.charAt(j);
                        if(c==d)
                        {
                                 str1.deleteCharAt(i);
                                 str2.deleteCharAt(j);    
                                 str1len=str1.length();
                                 str2len=str2.length();
                                 i=0;
                                 j=0;
                            
                        }
                                        }


        }
       int d=(str1len+str2len);
   
      
       StringBuffer s3=new StringBuffer("flames");
       String s4=new String();
   
          for(int i=0;i<5;i++)
       {
       int n=-1,l=0,p=0;
       for(int j=1;j<=d;j++)
       {
               n++;
               l++;
            
               if(n>s3.length()-1)
               {
                       char e=s3.charAt(p);
                       if(l==d)
                       {
                               s3.deleteCharAt(p);
                              
                               s4=s3.substring(p,s3.length());

                               s3.delete(p,s3.length());
                              
                               s3.insert(0,s4);
                              
                               break;
                       }
                       else{ 
                               p++;
                               if(p==s3.length())
                               {
                                       p=0;
                               }
}
       }
else
       {
       char e=s3.charAt(n);
       if(l==d)
               {
               s3.deleteCharAt(n);

               s4=s3.substring(n,s3.length());
              
               s3.delete(n,s3.length());
       
               s3.insert(0,s4);
               
       break;
               }
              
}

}
}
          char result=s3.charAt(0);           
		return result;
              }


	}
	
