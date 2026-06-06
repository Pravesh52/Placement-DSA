// package college Placement;

public class Binarytreebalanced {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // create a tree
    
    public static Node buildtree(Integer[] arr,int i){
        if(i>=arr.length || arr[i]==null) return null;

        Node root=new Node(arr[i]);

        root.left=buildtree(arr,2*i+1);
        root.right=buildtree(arr,2*i+2);

        return root;
        
    }
    public static boolean Balanced(Node root){
        return checkheight(root)!=-1;

        }

        public static int checkheight(Node root){
            if(root==null) return 0;

            // check left

            int left=checkheight(root.left);
             if(left==-1) return -1;
            // check right
            int right=checkheight(root.right);
            if(right==-1) return -1;

            if(Math.abs(left-right)>1) return -1;

            return Math.max(left, right)+1;


            
        }
    public static void main(String[] args) {

        Integer arr[]={3,9,20,null,null,15,7};

        Node root=buildtree(arr, 0);

        if(Balanced(root)){
            System.out.println("Tree is Balanced");
        }else{
            System.out.println("Not a Balanced");
        }

        
    }
    
}
