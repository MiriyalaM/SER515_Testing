package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	//  Task 2 - BubbleSort - Condition Coverage
	//checking for null condition
	@Test(expected=java.lang.NullPointerException.class)
	public void EmptyBubbleElement_ManishaMiriyala() {
		Item[] emptyArray = null;
		SortAlgos.bubbleSort(emptyArray); 
	} 
	
	// Node, Edge and Condition Coverages in Non-Empty BubbleSort_Coverage Method
	@Test
	public void ManishaMiriyala_BubbleSort_Coverage(){
		int[] elements = {10,20,56,12,32,4,15};
		Item[] ele = new Item[7];
		if(elements.length > 1)
		for (int i = 0; i < elements.length; i++)
			ele[i] = new Item(elements[i]);
		else 
			ele[1]= new Item(elements[1]);
       
		int[] SortedBubbleSort = {4,10,12,15,20,32,56};
		Item[] BubbleSortElements = new Item[7];
		for (int i = 0; i < SortedBubbleSort.length; i++)
			BubbleSortElements[i] = new Item(SortedBubbleSort[i]);
		
		SortAlgos.bubbleSort(ele);
		for (int k = 0; k < ele.length; k++)
			assertTrue(ele[k].key == BubbleSortElements[k].key);
		System.out.println("BubbleSort Successful ");
	}
	
	// Task 2 Question 3
	// Selection Sort - Condition Coverage - Checking for Null Condition
	@Test(expected=java.lang.NullPointerException.class)
	public void EmptySelectElement() {
		Item[] emptyArray = null;
		SortAlgos.selectionSort(emptyArray);
	}
	// Insertion Sort - Condition Coverage - Checking for Null Condition
	@Test(expected=java.lang.NullPointerException.class)
	public void EmptyInsertElement() {
		Item[] emptyArray = null;
		SortAlgos.insertionSort(emptyArray);
	}
	// Merge Sort - Condition Coverage - Checking for Null Condition
	@Test(expected=java.lang.NullPointerException.class)
	public void EmptyMergeElement() {
		Item[] emptyArray = null;
		SortAlgos.mergeSort(emptyArray);
	}
	// Quick Sort - Condition Coverage - Checking for Null Condition
	@Test(expected=java.lang.NullPointerException.class)
	public void EmptyQuickElement() {
		Item[] emptyArray = null;
		SortAlgos.quickSort(emptyArray);
	}
	// Heap Sort - Condition Coverage - Checking for Null Condition
	@Test(expected=java.lang.NullPointerException.class)
	public void EmptyHeapElement() {
		Item[] emptyArray = null;
		SortAlgos.heapSort(emptyArray);
		}
	
	// Node, Edge and Condition Coverages in Non-Empty SelectionSort_Coverage Method
	@Test
	public void SelectionSort_Coverage(){
		int[] elements = {10,20,56,12,32,4,15};
		Item[] ele = new Item[7];
		if(elements.length > 1)
			for (int i = 0; i < elements.length; i++)
			ele[i] = new Item(elements[i]);
		else 
			ele[1]= new Item(elements[1]);
		

		int[] SortedSelectionSort = {4,10,12,15,20,32,56};
		Item[] SelectionSortElements = new Item[7];
		for (int i = 0; i < SortedSelectionSort.length; i++)
			SelectionSortElements[i] = new Item(SortedSelectionSort[i]);
		
		SortAlgos.selectionSort(ele);
		for (int k = 0; k < ele.length; k++)
			assertTrue(ele[k].key == SelectionSortElements[k].key);
		System.out.println("Selection Sort Successful ");
	}
	
	// Node, Edge and Condition Coverages in Non-Empty InsertionSort_Coverage Method
	@Test
	public void InsertionSort_Coverage(){
		int[] elements = {10,20,56,12,32,4,15};
		Item[] ele = new Item[7];
		if(elements.length > 1)
		for (int i = 0; i < elements.length; i++)
			ele[i] = new Item(elements[i]);
		else 
			ele[1]= new Item(elements[1]);

		int[] SortedInsertionSort = {4,10,12,15,20,32,56};
		Item[] InsertionSortElements = new Item[7];
		for (int i = 0; i < SortedInsertionSort.length; i++)
			InsertionSortElements[i] = new Item(SortedInsertionSort[i]);
		
		SortAlgos.insertionSort(ele);
		for (int k = 0; k < ele.length; k++)
			assertTrue(ele[k].key == InsertionSortElements[k].key);
	System.out.println("Insertion Sort Successful ");
	}
	
	// Node, Edge and Condition Coverages in Non-Empty MergeSort_Coverage Method
	@Test
	public void MergeSort_Coverage(){
		int[] elements = {10,20,56,12,32,4,15};
		Item[] ele = new Item[7];
		if(elements.length > 1)
		for (int i = 0; i < elements.length; i++)
			ele[i] = new Item(elements[i]);
		else 
			ele[1]= new Item(elements[1]);

		int[] SortedMergeSort = {4,10,12,15,20,32,56};
		Item[] MergeSortElements = new Item[7];
		for (int i = 0; i < SortedMergeSort.length; i++)
			MergeSortElements[i] = new Item(SortedMergeSort[i]);
		
		SortAlgos.mergeSort(ele);
		for (int k = 0; k < ele.length; k++)
			assertTrue(ele[k].key == MergeSortElements[k].key);

		System.out.println("Merge Sort Successful ");	
	}
	
	// Node, Edge and Condition Coverages in Non-Empty QuickSort_Coverage Method
	@Test
	public void QuickSort_Coverage(){
		int[] elements = {10,20,56,12,32,4,15};
		Item[] ele = new Item[7];
		if(elements.length > 1)
		for (int i = 0; i < elements.length; i++) 
			ele[i] = new Item(elements[i]);
		else 
			ele[1]= new Item(elements[1]);

		int[] SortedQuickSort = {4,10,12,15,20,32,56};
		Item[] QuickSortElements = new Item[7];
		for (int i = 0; i < SortedQuickSort.length; i++)
			QuickSortElements[i] = new Item(SortedQuickSort[i]);
		
		SortAlgos.quickSort(ele);
		for (int k = 0; k < ele.length; k++)
			assertTrue(ele[k].key == QuickSortElements[k].key); 
		System.out.println("Quick Sort Successful ");
		}
	
	// Node, Edge and Condition Coverages in Non-Empty HeapSort_Coverage Method
	@Test
	public void HeapSort_Coverage(){
		int[] elements = {10,20,56,12,32,4,15};
		Item[] ele = new Item[7];
		if(elements.length > 1)
		for (int i = 0; i < elements.length; i++) 
			ele[i] = new Item(elements[i]);
		else 
			ele[1]= new Item(elements[1]);

		int[] SortedHeapSort = {4,10,12,15,20,32,56};
		Item[] HeapSortElements = new Item[7];
		for (int i = 0; i < SortedHeapSort.length; i++)
			HeapSortElements[i] = new Item(SortedHeapSort[i]);
		
		SortAlgos.heapSort(ele);
		for (int k = 0; k < ele.length; k++)
			assertTrue(ele[k].key == HeapSortElements[k].key);
		System.out.println("Heap Sort Successful ");
	}
}
