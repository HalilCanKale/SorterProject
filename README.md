# **Sorter Project**

___


## Table Of Content

- ##### Project Purpose
- ##### User Guide
- ##### MergeSort
- ##### BubbleSort
- ##### InsertionSort
- ##### QuickSort
- ##### Binary Sort Tree
- ##### Maintenance/Aims
___

## Project Purpose
> This is a sorting application. The application aims to provide the user with the tools to be able to generate a random array of the size the user wants and then select the sorting methods the user would like to implement. The application then provides the user with the unsorted and sorted array followed by the time taken (in Nano Seconds) for the sorting to complete successfully.
___

## User Guide
- When the application begins the user is asked to input the size of the array they would like the app to generate.
- Then the application will give the options of the sorting methods and the user will select from options 1-8. The user is able to also select more than one sorting method.
- Once selected the user must click any letter on there keyboard and enter
- Then the user is given a display of the sorted and unsorted array along with the times taken by each sort method to sort the array.
___

## Maintenance/Aims
> This project is still going to be edited and modified. The BST sort is the priority at this moment and then onwards a user-friendly GUI is going to be implemented to finalise the project.
___
## Merge Sort
> Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
>
> ![MergeSort Example](Pictures/MergeSort.gif)
```java
public void sort(int[] testArr) {
        merge(testArr,testArr.length);
    }
```
```java
    public static void merge(int[] testArr, int n){
        if (n<2){
            return;
        }
        int mid = n/2;
        int [] l=new int [mid];
        int [] r=new int [n-mid];
        for (int i=0; i<mid; i++){
            l[i]=testArr[i];
        }
        for (int i=mid;i<n;i++){
            r[i-mid]=testArr[i];
        }
        merge(l, mid);
        merge(r, n - mid);
        compare(testArr, l, r, mid, n - mid);
    }
```
```java
public static void compare(int[] testArr, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            testArr[k++] = l[i++];
        }
        else {
            testArr[k++] = r[j++];
        }
    }
    while (i < left) {
        testArr[k++] = l[i++];
    }
    while (j < right) {
        testArr[k++] = r[j++];
    }
}
```
___
## Bubble Sort
> A bubble sort algorithm goes through a list of data a number of times, comparing two items that are side by side to see which is out of order. It will keep going through the list of data until all the data is sorted into order.
>
>![Bubble Example](Pictures/BubbleSort.gif)
```java
public void sort(int[] testArr) {
        int a=0;
        int l=testArr.length;
        for(int j=0; j<l;j++) {
            for (int i = 1; i <= (l-1); i++)
                if (testArr[i-1] > testArr[i]) {
                    a = testArr[i -1];
                    testArr[i -1] = testArr[i];
                    testArr[i] = a;
                }
        }
    }
```
___
## Insertion Sort
> An insertion sort compares values in turn, starting with the second value in the list. If this value is greater than the value to the left of it, no changes are made. Otherwise this value is repeatedly moved left until it meets a value that is less than it. The sort process then starts again with the next value. This continues until the end of the list is reached.
>
>![Insertion Example](Pictures/InsertionSort.gif)
```java
public void sort(int[] testArray){
    int len=testArray.length;
    int j;
    int pointer=0;
    int i;
    for(i=1; i<len;i++){
        pointer=testArray[i];
        j=i-1;
        while (j >= 0 && testArray[j] > pointer)
        {
            testArray[j + 1] = testArray[j];
            j = j - 1;
        }
        testArray[j + 1] = pointer;
    }
}
```
___
## Quick Sort
> Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
>
> - Always pick first element as pivot.
- Always pick last element as pivot (implemented below)
- Pick a random element as pivot.
- Pick median as pivot.
>
>![Quick Example](Pictures/QuickSort.gif)

```java
public void quick(int[] testArr, int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(testArr, begin, end); //Getting
        quick(testArr, begin, partitionIndex-1);
        quick(testArr, partitionIndex+1, end);
    }
}
```
```java
public void quick(int[] testArr, int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(testArr, begin, end); //Getting
        quick(testArr, begin, partitionIndex-1);
        quick(testArr, partitionIndex+1, end);
    }
}
```
```java
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
```
___
## Binary Sort Tree
> Binary Sort Tree is still in works and is due to be complete. What is a binary sort tree? Binary sort tree is a sort algorithm that builds a binary search tree from the elements to be sorted, and then traverses the tree (in-order) so that the elements come out in sorted order. Its typical use is sorting elements online: after each insertion, the set of elements seen so far is available in sorted order.
___
