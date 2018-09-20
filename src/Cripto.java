import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class Cripto 
{    
			//Created by Javier David Hernandez Garcia on September 2018.
			//Date 20/09/18

   public static void main(String [] args) throws IOException
   {
        String j1[]={"4","b","c","d","3","f","g","h","1","j","k","l","m","n","0","p","q","r","s","t","9","v","w","x","y","z"}; //Here can start the variable of type string called j1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c=0;
        bw.write("Enter an word"+"\n"); //Here can place the message 
        bw.flush();
        String s=br.readLine(); 	//Here can read the message written placed previously
        String s1=s.toLowerCase(); 	//Here the message is changed to lowercase
        String s2=s1.replace("a","4"); 	//All the vowels of the message are replaced
        String s3=s2.replace("e","3");
        String s4=s3.replace("i","1"); 
        String s5=s4.replace("o","0");
        String s6=s5.replace("u","9");
        String[ ] s7 = s6.split(" ");	//Here they are organized according to find a space between the messages
        char[] s8= s6.toCharArray(); 	//An arrays is created so that you can go through the message and change the words as we order
        String[] s11=new String[s8.length]; 	//A string type arrangement called s11 is created that contains s8 which is the message
	for (int i= 0; i<s8.length;i++)  // Here is to execute word by word the string s8
	{
	       String s9 = String.valueOf(s8[i]); 	//A new string is created that will evaluate the position of the words of s8
	       for( int a = 0; a <j1.length;a++)	//Here is to execute word by word the string j1
		{
                        String s10 = String.valueOf(j1[a]);	//A new string is created that will evaluate the position of the words of j1
			try
                        {
                            if(s9.equalsIgnoreCase("4"))	//If you find in the message a 4 will do the following operation
                            {                                   
                                c=4+5;
                                String s1a=Integer.toString(c); //The result is saved in c and is converted to character
                                s11[i]=s1a;                 	//The result is saved in position i                                              
                            }
                            if(s9.equalsIgnoreCase(" "))	//Here take into account the spaces
                            {          
                                String s1a=" ";			//The value is saved and placed in position i
                                s11[i]=s1a;                                                               
                            }
                            if(s9.equalsIgnoreCase(","))	//Here he takes into account the commas
                            {          
                                String s1a=",";			//The value is saved and placed in position i
                                s11[i]=s1a;                                                               
                            }
                            if(s9.equalsIgnoreCase("3"))	//If you find in the message a 3 will do the following operation
                            {                                   
                                c=3+5;
                                String s1a=Integer.toString(c);	//The result is saved in c and is converted to character
                                s11[i]=s1a;                  	//The result is saved in position i                                                
                            }
                            if(s9.equalsIgnoreCase("1"))	//If you find in the message a 1 will do the following operation
                            {                                   
                                c=1+5;
                                String s1a=Integer.toString(c);	//The result is saved in c and is converted to character
                                s11[i]=s1a;          		//The result is saved in position i                                                       
                            }
                            if(s9.equalsIgnoreCase("0"))	//If you find in the message a 0 will do the following operation
                            {                                   
                                c=0+5;				 
                                String s1a=Integer.toString(c);//The result is saved in c and is converted to character
                                s11[i]=s1a;                   //The result is saved in position i                                               
                            }
                            if(s9.equalsIgnoreCase("9"))	//If you find in the message a 0 will do the following operation
                            {                                   
                                c=9+5;
                                String s1a=Integer.toString(c);	//The result is saved in c and is converted to character
                                s11[i]=s1a;                     //The result is saved in position i  	                                         
                            }
                            if(s10.equalsIgnoreCase(s9))	//Compare the variable s10 with s9 which is the message
                            {	
                                c=a+5; 				//Here the function for the encryptor is placed                       
                                if(c>j1.length)			//Here the condition to be evaluated is placed
                                {	
                                    while(c>j1.length)		//Here the condition to be evaluated is placed
                                        {
                                            c=c-j1.length;	//Here is the operation for to determine the position when you pass the limits of j1
                                            s11[i]=j1[c];	//Here the position in i of the message and the position in the j1 array is printed
                                        }                                   
                                }else
                                {
                                    while(c<0)			//If the condition above is not met, it means that if the result of the vowels is less than 0, return to the end
                                    {
                                        c=c+j1.length;
                                        s11[i]=j1[c];
                                    }                                 
                                }
                                if(c<j1.length && c>0){		//If neither of the two conditions is met, evaluate both equally
                                        s11[i]=j1[c];
                                        }
                               
                            }   
                        } catch(ArithmeticException ae)
                            {
				bw.write("Not can carry out the encryption");	//Here is an option in case it does not allow to encrypt
				bw.flush(); 
                            }
                }                 
        }           
                bw.write("The word  encrypted is: ");		//Here you already print the encrypted message	
                bw.flush();
            
            for(int i1=0;i1<s8.length;i1++)			//Here the position of each word is evaluated
            {
                bw.write(s11[i1]);
                bw.flush();
            }
            
               
        String[] s12=new String[s11.length];			//Here is the same as above, only that this is to decrypt with the subtraction of the function
	for (int i= 0; i<s8.length;i++)
	{
	       String s91 = String.valueOf(s11[i]);
	       for( int a = 0; a <26;a++)
		{
			try
                        {
                            String s10 = String.valueOf(j1[a]);
                            if(s91.equalsIgnoreCase("9"))
                            {                                   
                                c=9-5;
                                String s1a=Integer.toString(c);
                                s12[i]=s1a;                                                               
                            }
                            if(s91.equalsIgnoreCase(" "))
                            {          
                                String s1a=" ";
                                s12[i]=s1a;                                                               
                            }
                            if(s91.equalsIgnoreCase(","))
                            {          
                                String s1a=",";
                                s12[i]=s1a;                                                               
                            }
                            if(s91.equalsIgnoreCase("8"))
                            {                                   
                                c=8-5;
                                String s1a=Integer.toString(c);
                                s12[i]=s1a;                                                               
                            }
                            if(s91.equalsIgnoreCase("6"))
                            {                                   
                                c=6-5;
                                String s1a=Integer.toString(c);
                                s12[i]=s1a;                                                               
                            }
                            if(s91.equalsIgnoreCase("5"))
                            {                                   
                                c=5-5;
                                String s1a=Integer.toString(c);
                                s12[i]=s1a;                                                               
                            }
                            if(s91.equalsIgnoreCase("14"))
                            {                                   
                                c=14-5;
                                String s1a=Integer.toString(c);
                                s12[i]=s1a;                                                               
                            }
                            if(s10.equalsIgnoreCase(s91))
                            {	
                                c=a-5;                                                                
                                if(c>j1.length)
                                {	
                                    while(c>j1.length)
                                        {
                                            c=c-j1.length;
                                            s12[i]=j1[c];
                                            
                                        }                                   
                                }
                                if(c<0)
                                {
                                    while(c<0)
                                    {
                                        c=c+j1.length;
                                        s12[i]=j1[c];
                                    }                                 
                                }
                                if(c>0 && c<j1.length){
                                    s12[i]=j1[c];
                                }
                                
                            }   
                        } catch(ArithmeticException ae)
                            {
				bw.write("Not can carry out the encryption");
				bw.flush(); 
                            }
                }   
    
        } 
         bw.write("\n"+"The word original is: ");		//Here the initial message is printed
         bw.flush();
            
            for(int i2=0;i2<s11.length;i2++)
            {
                bw.write(s12[i2]);
                bw.flush();
            }                              
         

    }
      
   
}

    