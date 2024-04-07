package in.com;

public class LinkedList {
             Node head ; 
             
              static class Node{    //creation of linked list
            	 int data ;
            	 Node next ;
            	 
            	public Node(int d){
            		this.data = d;
            		this.next = null;
            	 }
            	 	 
             }
             void display() {      //displaying of linked list
            	 Node n = head ;
            	 while(n!=null) {
            		 System.out.print(n.data+ "---->");
            		 n=n.next ;
            	 }
             }
            	 
            	 void insert(int new_data) {   // Insertion at beginning 
            		  Node new_node = new Node(new_data);
            		  new_node.next = head ;
            		  head = new_node ;
            	 }
             
            
            	 void append(int new_data) {     // Insertion at the end
            		 Node new_node = new Node(new_data);
            		 if(head == null) {
            				 head = new_node ;
            				 return ;
            		 }
            		 new_node.next = null ;
            		 Node last = head ;
            		 while(last.next != null) {
            			 last = last.next ;
      
            		 }
            		 last.next = new_node ;
            		 return ;
            	 }
           void insertAfter(Node prev_node , int new_data) {
        	   if(prev_node ==  null) {
        		   System.out.println("Empty is list ");
        		   return;
        	   }
        	   Node new_node = new Node(new_data);
        	   new_node.next =  prev_node.next;
        	   prev_node.next = new_node ;
           }
           
//           
//           void delete (Node head ,  int pos) {
//        	   if(pos == 0 ) {
//        		   head  = head.next ;
//        		   return ;
//        		   
//        	   }
//        	   Node prev  = head ;
//        	   for(int i = 0 ;  i<pos-1 ; i++) {
//        		   prev = prev.next ;
//        	   }
//        	   prev.next = prev.next.next ;
//           }
//           
           // delete node by key value 
////         

           
            void deleteNode(int key)//key = 43
           {
           	Node temp = head, prev = null;
           	//Deletion at the begining
           	if( temp != null && temp.data == key)
           	{
           		head = temp.next;
           		return;
           		
           	}
              //In between node deletion
               	while(temp != null && temp.data != key)
               	{
               		prev =temp;
               		temp = temp.next;		
               	}
               	//deletion at the end
               	if (temp == null) {
               	 System.out.println("Key " + key + " not found in the list");
                 return;
                    
               		}
            
              
            	prev.next = temp.next;
               
  
               	
               }
           
//            	 
             
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList l1 = new LinkedList();
        l1.head = new Node(5);
        Node second = new Node(7);
        Node third = new Node(9);
        
        l1.head.next =second ;
        second.next = third ;
        l1.display();
        
        l1.insert(10);
        System.out.println();
        l1.display();
      
        l1.append(23);
        System.out.println();
        l1.display();
        
       l1.insertAfter(l1.head.next,26);
        System.out.println();
        l1.display();
        
      System.out.println();
        
       int key = 0;
       l1.deleteNode(key);
       System.out.println();
       l1.display();
       
	}

}
