package Binary_Tree;

public class BinaryTree {
    TreeNode root;
    
    public boolean isEmpty(){
        return (root==null);
    }
    
    //method insert data
    public void insert(TreeNode input){
        if(isEmpty()){
            root = input;
        } else { 
            // cari parent yang sesuai dan (kiri/kanan)
            TreeNode current = root;
            TreeNode parent = null;
            boolean diKiri = true;
            while (current !=null){
                parent = current;
                // kalau data yang akan diinputkan lebih besar,
                // bergerak ke kanan
                if (current.data < input.data){
                    current = current.rigth;
                    diKiri = false;
                // else gerak ke kiri
                } else if(current.data < input.data){
                    current = current.left;
                    diKiri= true; 
                } else{
                    System.out.println("data "+input.data+" sudah ada");
                    break;
                }
            }
            // hubungkan ke parent
            if (diKiri){
                parent.left = input;
            } else {
                parent.rigth = input;
            }
        }
    }
    public void preOrder(){
        preOrder(root);
    }
    public void inOrder(){
        inOrder(root);
    }
    public void postOrder(){
        postOrder(root);
    }
    
    public void preOrder(TreeNode akar){
        if(akar != null){
            System.out.print(akar.data+" ");
            preOrder(akar.left);
            preOrder(akar.rigth);
        }
    }
    public void inOrder(TreeNode akar){
         if(akar != null){
            inOrder(akar.left);
            System.out.print(akar.data+" ");
            inOrder(akar.rigth);
         }
    }
    public void postOrder(TreeNode akar){
        if(akar != null){
            postOrder(akar.left);
            postOrder(akar.rigth);
            System.out.print(akar.data+" ");
        }
    }
    //method mencari data
    public TreeNode search(int key){
        TreeNode node = null;
        TreeNode current = root;
        // lakukan pencarian selama current bukan null
        while (current != null){
            if (current.data == key){
                return node;
            } else {
                if (current.data < key){
                    current = current.rigth;
                } else {
                    current = current.left;
                }
            }
            }
        return node;
        }
    }