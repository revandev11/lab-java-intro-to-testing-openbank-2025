package org.example;

import org.testng.annotations.Test;


public class Main {
    public static void main(String[] args) {
    }

public static int[]odds(int n){
        int size=n;
        int[] arr=new int[size];
    int index=0;
    for (int i=0;i<n;i++){
            if (i%2==1){
                arr[index]=i;
                index++;
            }
        }
return arr;
}







}