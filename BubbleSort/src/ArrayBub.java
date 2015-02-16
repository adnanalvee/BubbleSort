
public class ArrayBub {

	private long[] a;
	private int nElems;
	
	public ArrayBub(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(int value){
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for (int i=0;i<nElems;i++) {
			System.out.print(a[i] + " ");
		System.out.println();	
		}
	}
	
	public void bubbleSort(){
		
		for (int j = 0; j <nElems; j++) {
			System.out.println("\nFOR LOOP: " + j);
		 for(int i = 0; i <nElems; i++)	
			if(a[i]> a[i+1]) {
				if(a[i+1] == 0) {
					System.out.println("Broken before: " + a[i]);
					break;
				}
				System.out.println("\nBefore Execution -- a[j]: " + a[i] + " a[j+1]: " + a[i+1] + " on j: " + a[j]);
				long tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
				System.out.println("After Execution -- a[j]: " + a[i] + " a[j+1]: " + a[i+1] );
				} 
			
		}
	}
	
	public static void main(String[] args) {
		
		int maxSize = 100;
		ArrayBub arr = new ArrayBub(maxSize);
		
		arr.insert(93);
		arr.insert(24);
		arr.insert(56);
		arr.insert(32);		
		arr.insert(110);
		arr.insert(12);
		System.out.println("Unsorted Numbers");
		arr.display();
		
		
		arr.bubbleSort();
		
		System.out.println("\nThis is Bubble Sort");
		arr.display();
		
		ArrayBub arr2 = new ArrayBub(maxSize);
		arr2.insert(10);
		arr2.insert(9);
		arr2.insert(8);
		arr2.insert(7);
		arr2.insert(6);
		arr2.insert(5);
		arr2.insert(4);
		arr2.insert(3);
		arr2.insert(2);
		arr2.insert(1);
		
		arr2.bubbleSort();
		arr2.display();
		

	}

}
