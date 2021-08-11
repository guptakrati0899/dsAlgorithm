package dsAlgorithm;

public class OrderedLinkList {
	
	
	    Node start;
	    NodeUtility nu=new NodeUtility();
	    Algo u1=new Algo();

	    // get data From a file
	    void getDataFromFile()
	    {
	        int[] retArry =nu.integerFileReader();
	        int[] sortArray =nu.sort(retArry);
	        int size =retArry.length;
	        System.out.println("Array Size is "+size);
	        for(int i=0;i<size;i++)
	        {

	            addItem(retArry[i]);
	        }
	    }

	    // Function for List
	    public void List()
	    {
	        if(start ==null)
	        {
	            System.out.println("List is Empty ");
	        }
	    }

	    // add item Function
	    public void addItem(int data)
	    {
	        Node head =start;
	        Node temp =new Node();
	        temp.data =data;
	        temp.nextNode =null;
	        if(start == null)
	        {
	            start = temp;
	        }
	        else
	        {
	            while(head.nextNode != null)
	            {
	                head=head.nextNode;
	            }
	            head.nextNode=temp;
	        }
	    }

	   // Display Function
	   public  void display()
	   {
	        Node temp =start;
	        while( temp != null)
	        {
	            System.out.print(temp.data+"---->");
	            temp=temp.nextNode;
	        }
	        System.out.println(" ");
	    }

	   // Size of Function
	   public  int size()
	   {
	        int count=0;
	        Node temp =start;
	        while( temp.nextNode != null)
	        {
	            temp=temp.nextNode;
	            count++;
	        }
	        System.out.println("size of Linked List"+count);
	        return count;
	   }

	   // Serching of a Word Function
	   public void searchData()
	   {
	        Node temp = start;
	        int count=0;
	        System.out.println("Enter a number to Search");
	        int s =u1.inputInteger();
	        int flag=0;
	        while(temp.nextNode != null)
	        {
	            count++;
	            if( temp.data==s)
	            {
	                System.out.println(" number is found at "+count);
	                flag++;
	                break;
	            }
	            temp=temp.nextNode;
	        }

	        if(flag == 1)
	        {
	            removeData(count);
	        }
	        else
	        {
	            addItem(s);
	            System.out.println("After Adding a LIst ");
	            display();
	        }
	    }

	    // removeWord From a Linked lIst
	    void removeData(int count)
	    {
	        Node temp = start;
	        if(count==1)
	        {
	            start =start.nextNode;
	            System.out.println("After Deleting LIst is ");
	            display();
	        }
	        else
	        {
				for(int i=0;i<count-1;i++)
				{
				 	temp=temp.nextNode;
				}
	        temp.nextNode =temp.nextNode.nextNode;
	        System.out.println("After Deleting LIst is ");
	        display();
	        }
	    }

	    public static void main(String[] args)
	    {
	        OrderedLinkList obj = new OrderedLinkList();
	        obj.getDataFromFile();
	        obj.display();
	        obj.size();
	       	obj.searchData();
	    }
	}


