package arraysearch;

public class Tree {
	Node root;
	public Tree() {
		this.root=null;
	}

	public Node find(Node x,int key)
	{
		if(x==null)return null;
		if(key<x.key)
		{
			x.left=find(x.left,key);
		}
		else if(key>x.key)
		{
			x.right=find(x.right,key);
			
		}
		else {
			System.out.println("the value is "+x.value);
			}	
		return x;
		
		
		
	}
	public void addroot(Node n)
	{
		root=n;
		
	}
	public Node add(Node x,int key,int value)
	{	
		if(x==null)return new Node(key,value);
	
			
				if(key<x.key)
				{
					x.left=add(x.left,key,value);
				}
				else if(key>x.key)
				{
					x.right=add(x.right,key,value);
				}
				else {
					x.value=value;
					}	return x;
				
	}
	public Node min(Node x)
	{
		if(x.left==null)
		{
			return x;
		}
		else
		{
			min(x.left);
		}
		return x;
	}
	public Node deletemin(Node x)
	{
		if(x.left==null)
		{
			return x.right;
		}
		x.left=deletemin(x.left);
		return x;
	}
	public Node delete(Node x,int key)
	{
		if(x==null) return null;

		if(key<x.key)
		{
			x.left=delete(x.left,key);
			
		}
		else if(key>x.key)
		{
			x.right=delete(x.right,key);
//			
		}
		else {
			if(x.right==null)return x.left;
			if(x.left==null)return x.right;

			Node t=x;
			x=min(t.right);
			x.right=deletemin(t.right);
			x.left=t.left;
			}	
		
		return x;
	
	}
	public static void main(String[] args) {  
		Tree atree=new Tree();
		Node aa=new Node(2,11);	
		atree.addroot(aa);
		atree.add(atree.root,3,12);
		atree.add(atree.root,1,10);
		atree.add(atree.root,5,18);
		atree.add(atree.root,9,11);
		atree.add(atree.root,4,1);
		atree.delete(atree.root,5);
		atree.add(atree.root,7,6);
		atree.find(atree.root, 9);
		atree.add(atree.root,7,110);//update
		atree.find(atree.root, 7);
		//System.exit(0);
	}

}	
	
	

