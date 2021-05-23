package com.company;

public class BonusTask {
    public int FirstIndexOf(int[] arr, int find){
        return FirstIndexOf(arr,0,arr.length-1,find);
    }
    public int FirstIndexOf(int[] arr,int start, int end,int find) {
        if (end>=start){
            int mid = start + (end - start)/2;
            if (arr[mid] == find){
                return mid;
            }
            if (arr[mid] > find){
                return FirstIndexOf(arr, start, mid-1, find);
            }else{
                return FirstIndexOf(arr, mid+1, end, find);
            }
        }
        return -1;
    }
    public int SecondIndexOf(int[] arr, int find){
        return SecondIndexOf(arr,0,arr.length-1,find);
    }
    public int SecondIndexOf(int[] arr, int start,int end,int find){
        if (end>=start){
            int mid = start + (end - start)/2;
            if (arr[mid] == find) {
                if (arr[mid + 1] == find) {
                    return mid + 1;
                } else{
                    return -1;
                }
            }
            if (arr[mid] > find){
                return SecondIndexOf(arr, start, mid-1, find);
            }else{
                return SecondIndexOf(arr, mid+1, end, find);
            }
        }
        return -1;
    }

    public int LastIndexOf(int[] arr, int find){
        return LastIndexOf(arr,0,arr.length-1,find);
    }
    public int LastIndexOf(int[] arr, int start,int end,int find){
        if (end>=start){
            int mid = start + (end - start)/2;
            if (arr[mid] == find) {
                    if (mid == end - 1 || find < arr[mid + 1]) {
                        return mid+1;
                    }
            }
            if (arr[mid] > find){
                return LastIndexOf(arr, start, mid-1, find);
            }else{
                return LastIndexOf(arr, mid+1, end, find);
            }
        }
        return -1;
    }

    public boolean has(int[] arr,int sum){
        for (int i = 0; i < arr.length; i++) {
            int end = sum - arr[i];
            for(int j = 0; j < arr.length; j++){
                if(end != arr[j]){
                    return false;
                }
            }
    }
        return true;
    }


    public void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    public void quickSort(int[] arr,int start, int end){
        if(start < end){
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi, end);
        }
    }
    private static int partition(int[] x, int start, int end) {

        int pivot = x[start];

        int right = end;
        int left = start;

        while (left <= right) {

            while (x[left] < pivot) {
                left++;
            }

            while (x[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(x, right, left);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
