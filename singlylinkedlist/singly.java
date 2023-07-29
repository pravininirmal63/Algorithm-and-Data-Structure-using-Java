class LL{
    Node head;
    class Node{
       
       String data;
       Node next;
       
        Node (String data){
            this.data=data;
            this.next=null;

        }

        //add-first
        public void addfirst(String data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
             }
             public void addlast(String data){
                Node newnode=new Node(data);
                if(head==null){
                    head=newnode;
                    return;

                }
                Node currnode=head;
             while(currnode.next!=null){
                currnode=currnode.next;

             }
             currnode.next=newnode;
 }
        

    }

public static void main(String args[]){
    LL list=new LL();
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}