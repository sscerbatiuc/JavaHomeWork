package com.step.operations;
import java.util.Scanner;

public class ArrayMax {
    Scanner sc = new Scanner(System.in);

    int [] numArray= new int[getArrayLenght()];

    public void arrayMax(){
        int max=-100;
        int min=1000;
        for (int i=0;i<numArray.length;i++){
            if(numArray[i]>max){
                max=numArray[i];
            }
            if(numArray[i]<min){
                min=numArray[i];
            }

        }
        System.out.println("Maximum of array is " +max+ " and Minimum is "+min);
    }
    public void arrayFill(){
        for (int i=0;i<numArray.length;i++){
            System.out.println("Enter values in array");
            int num = sc.nextInt();
            numArray[i]=num;
        }
        arrayMax();
    }
    public int getArrayLenght(){
        System.out.println("Enter number of values in array");
        int arrayLenght = sc.nextInt();
        return arrayLenght;
    }
}
