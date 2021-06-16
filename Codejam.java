import java.util.Scanner;

public class Codejam{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MaxHeap mh = new MaxHeap(n);
		for(int i = 1 ; i<=n;i++) {
			mh.insert(sc.nextInt());
		}
		System.out.println("Before Heapification");
		mh.print_heap();

		mh.build_heap();

		System.out.println("After Heapification");
		mh.print_heap();

	}
}

class MaxHeap{
	private int[] Heap;
	private int Size;
	private int MaxSize;
	MaxHeap(int MaxSize){
		this.MaxSize = MaxSize;
		Size = 0;
		Heap = new int[this.MaxSize+1];
		Heap[0] = Integer.MAX_VALUE;
	}
	void insert(int element) {
		Heap[++Size] = element;
	}
	void build_heap() {
		int j = (int)Math.floor(Size/2.0);
		for(int i = j;i>=1;i--) {
			max_heapify(Heap,i);
		}
	}
	private boolean isLeaf(int i) {
		if(i>(Size/2) && i<=Size){
			return true;
		}
		else{
			return false;
		}
	}
	private void max_heapify(int[] Heap,int i) {
		if(isLeaf(i)) {
			return;
		}
		int leftchild = 2 * i;
		int rightchild = (2*i) + 1;
		if(rightchild<=Size){
			if(Heap[i] >= Heap[leftchild] && Heap[i] >= Heap[rightchild])
				return;
			else
				if (Heap[i] >= Heap[leftchild])
					return;
		}
		int largest;
		if(leftchild<=Size && Heap[leftchild]>Heap[i])
			largest = leftchild;
		else
			largest = i;
		if(rightchild<=Size && Heap[rightchild]>Heap[largest])
			largest = rightchild;
		if(largest!=i)
			swap(largest,i);

		max_heapify(Heap , largest);
	}
	private void swap(int largest,int i){
		int temp = Heap[largest];
		Heap[largest] = Heap[i];
		Heap[i] = temp;
	}

	void print_heap(){
		for (int i = 1; i <= Size ; i++ ) {
			System.out.print(Heap[i]+" ");
		}
		System.out.println();
	}
}
