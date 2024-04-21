package com.example;

public class printFibanocci {

    public static void main(String[] args) {
        
int[] a = new int[10];

int b=0;
int c=1;
System.out.println("Fibonocci Series");   
for (int j=0;j<10;j++)
{

a[j]=b+c;
b=c;
c=a[j];

System.out.println(c);    
}

    }

}
