package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,8,9,11,12,12,15};
        BonusTask bt = new BonusTask();
        bt.quickSort(arr);
        System.out.println(bt.FirstIndexOf(arr,8)); // if answer is "-1" : there is no such element or occurrence
        System.out.println(bt.SecondIndexOf(arr,8)); // if answer is "-1" : there is no such element or occurrence
        System.out.println(bt.LastIndexOf(arr,8)); // if answer is "-1" : there is no such element or occurrence
        System.out.println(bt.has(arr,25));
    }

}
