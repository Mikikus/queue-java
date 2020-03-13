package myQueue;

public class Queue {
	private int head;
	private int tail;
	private int size;
	private int elemCount;
	private int[] queue;

	public Queue(int size){
		this.size = size;
		queue = new int[this.size];
		this.head = 0;
		this.tail = -1;
		this.elemCount = 0;
	}

	boolean isEmpty(){
		return (this.elemCount == 0);
	}

	boolean isFull(){
		return (this.elemCount == (this.size));
	}

	public void insert(int elem){
		if(!isFull()){
		if(this.tail == (this.size - 1)){
			this.tail = -1;
		}
		queue[++tail] = elem;
		elemCount++;
		} else {
			System.out.println("Queue is full.");
		}

	}

	public int remove(){
		if(isEmpty()){
			System.out.println("Queue is empty.");
			return queue[head];
		}
		int tempElem = queue[head++]; //Получаем первый элемент из очереди


		if(this.head == this.size){
			this.head = 0;
		}

		elemCount--;
		if(elemCount < 0){
			elemCount = 0;
		}
		return tempElem;
	}

	public void show(){
		int tempHead = head;
		int tempElem = this.getElemCount();
		while (!this.isEmpty()) {
			if(tempHead == this.size){
				tempHead = 0;
			}			
				
			elemCount--;
		    int a = queue[tempHead];
		    tempHead++;
		    
	        System.out.println("Elem: " + a);
	            
            
	    }
		elemCount = tempElem;
		if(elemCount == 0){
			System.out.println("Queue is empty");
		}
				//System.out.println("Head " + head);
		if(!isEmpty()){System.out.printf("\nHead is %d (Elem %d).\nTail is %d (Elem %d).\nElements in Queue: %d\n", this.getHead(), this.queue[head], this.getTail(), this.queue[tail], this.getElemCount());
		System.out.println("------------------------------------");}
	}

	public int getTail(){
		return this.tail;
	}

	public int getHead(){
		return this.head;
	}

	public void setHead(int head){
		this.head = head;
	}

	public void setTail(int tail){
		this.tail = tail;
	}

	public int getSize(){
		return this.size;
	}

	public int getElemCount(){
		return this.elemCount;
	}

	public int[] getQueue(){
		return queue;
	}
}
   // for(int i = size-1; i >= size-elemCount; i--){
	    //	System.out.println(queue[i]);}
		//int sumHead = 0;
	//	int sumElem = 0;
	   // while (!this.isEmpty()) {
	    //	int n = tempQueue.remove();
          //  System.out.println("Elem: " + n);
        //}
	   // head -= sumHead;
		//elemCount = sumElem;
		/*if(head < tail){
			for(int i = this.head; i <= tail; i++){
				System.out.println(this.queue[i]);
			}
		} else if(head > tail){
			for(int i = this.head; i >= tail; i--){
				System.out.println(this.queue[i]);
			}}*/