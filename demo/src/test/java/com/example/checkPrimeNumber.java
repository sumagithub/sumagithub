package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkPrimeNumber {


    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
          
            
            System.out.print("Enter Integer:");
            try {
                int n = Integer.parseInt(reader.readLine());
           
boolean prime=true;

            for (int i=2;i<n/2;i++
            )
{
    if(n%i==0){
       prime=false;
break;
    }
   
}

if(prime)
{

    System.out.print("PRime number "+n);
}
else
{
    System.out.print("Not prime " +n);
}
} catch(NumberFormatException nfe) {
    System.err.println("Invalid Format!");
}
    }
}
