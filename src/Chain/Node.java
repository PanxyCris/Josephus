package Chain;

public class Node {
	
	public Node(int pos){
		this.pos = pos;
	}
	
	public int getPos(){
		return pos;
	}
     private int pos;
     public Node link;
}
