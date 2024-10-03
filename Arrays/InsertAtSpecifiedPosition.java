package com.tcsnqt.Arrays;

import java.util.*;
class InsertAtSpecifiedPosition{
static void insertatposition(int[] arr, int n, int value, int pos)
{
    for (int i = n; i >= pos; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[pos - 1] = value;
}


public static void main(String args[])
{
    int n=8;
    int pos=5;
    int arr[]={10,9,14,8,20,48,16,9,0};
    int value=40;
    System.out.println("Before inserting the value at beginning:");
     for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    insertatposition(arr,n,value,pos);
    System.out.println("After inserting the value at beginning:");
    for(int i=0;i<=n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
}
}
