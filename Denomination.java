package com.greatlearning.iitr.dsa.labsession2;
import java.util.Scanner;
public class Denomination {
public static void main(String args[]) throws Exception {
Scanner s = new Scanner(System.in);
System.out.println("enter the size of currency denominations");
int size = s.nextInt();
int arr[] = new int[size];
System.out.println("enter the currency denominations value");
for (int i = 0; i < size; i++)
arr[i] = s.nextInt();
System.out.println("enter the amount you want to pay");
int targetNo = s.nextInt();
while (targetNo-- != 0) {
int flag = 0;
long target;
System.out.println("enter the amount you want to pay");
target = s.nextInt();
long sum = 0;
int count[][]=new int[size][2];
for (int i = 0; i < size; i++) {
count[i][1]=arr[i];
count[i][2]=0;
}
for (int i = 0; i < size; i++) {
sum += arr[i];

if (sum >= target) {
System.out.println("Your payment approach in order to give min no of notes will be"+"\n");
for(i=0;i<size;i++)
{
System.out.println(count[i][1]+":"+count[i][2]);
}
flag = 1;
break;
}
count[i][2]+=1;
}

if (flag == 0) {
System.out.println(" Given target is not achieved ");
}
}
}
}
