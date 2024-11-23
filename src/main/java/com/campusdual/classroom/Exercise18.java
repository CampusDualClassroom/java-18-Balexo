package com.campusdual.classroom;

public class Exercise18 {

	public static int[] createAndInitializeArray(int size){
		int [] intArray = new int [size];

		for( int i=0 ; i<size; i++){
			intArray[i]=i+1;
		}
		return intArray;
	}

	public static void showInlineArray(int array[]){
		for(int i=0; i<array.length; i++) {
			if (i - array.length < -1) {
				System.out.print(array[i] + " ");
			} else {
				System.out.print(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = createAndInitializeArray(5);
		showInlineArray(array);

		for(int value:array){
			System.out.println(value);
		}
	}
}
