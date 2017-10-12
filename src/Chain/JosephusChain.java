package Chain;

public class JosephusChain {

	public JosephusChain(int n,int m){
		this.n = n;
		this.m = m;
		head = new Node(1);
		Node temp = head;
		for(int i=2;i<=n;i++){
			Node newNode = new Node(i);
			temp.link = newNode;
			temp = newNode;
			if(i==n){
				end = newNode;
				end.link = head;
			}
		}
	}

	public int print(){
 
		Node rear = end;
		Node previous = end;
		Boolean isContinue = true;
		while(isContinue){
			for(int i=0;i<m;i++){
				previous = rear;
				rear = rear.link;
			}
		
			if(rear.link == rear)
				return rear.getPos();
			previous.link = rear.link;
		}
         return 0;
	}

	private int n;
	private int m;
	public Node head;
	public Node end;

}
