
package Tree;

public class BinaryTreeApp {
    public static void main(String[] args){
        
    BinaryTree tree= new BinaryTree();
    
    TreeNode node;
    
    node = new TreeNode(50);
    tree.insert(node);
    
    node = new TreeNode(30);
    tree.insert(node);
    
    node = new TreeNode(20);
    tree.insert(node);
    
    node = new TreeNode(40);
    tree.insert(node);
    
    node = new TreeNode(70);
    tree.insert(node);
    
    System.out.print("Traversal dengan inorder :");//Kunjungi cabang kiri,Cetak isi simpul yag dikunjungi (simpul akar),Kunjungi cabang kanan.
    tree.inOrder();
    System.out.print("\nTraversal dengan preorder :");//Cetak isi simpul yang dikunjungi (simpul akar),Kunjungi cabang kiri.Kunjungi cabang kanan,
    tree.preOrder();
    System.out.print("\nTraversal dengan postorder :");//Kunjungi cabang kiri,Kunjungi cabang kanan,Cetak isi simpul yang dikunjungi (simpul akar).
    tree.postOrder();
    System.out.println();
    }   
}

