package testTree;

public class Tree {
    public int rootValue;
    public Tree leftChild;
    public Tree rightChild;

    // 向二叉树输入数据
    public void storeValue(int value) {
           if (value < this.rootValue) {
               if (leftChild == null) {
                   leftChild = new Tree();
                   leftChild.rootValue = value;
               } else {
                   leftChild.storeValue(value);
               }
           } else if (value > this.rootValue) {
                   if (rightChild == null) {
                       rightChild = new Tree();
                       rightChild.rootValue = value;
                   } else {
                       rightChild.storeValue(value);
                   }
           }
    }
    
    public void preList() {
        System.out.print(this.rootValue +" ");
        if (leftChild !=null) {leftChild.preList(); }
        if (rightChild !=null) {rightChild.preList(); }
    }
    
    public void middleList() {
        if (leftChild !=null) {leftChild.middleList(); }
        System.out.print(this.rootValue +" ");
        if (rightChild !=null) {rightChild.middleList(); }
    }
    
   public static void main(String args[]) {
       int nums[] = new int[10];
       for (int i =0; i< nums.length; i++) {
           nums[i] = (int)(Math.random()*100);
           for (int j = 0;j < i; j++) {
               if (nums[j] == nums[i]) {
                   i-- ;
                   break;
               }
           }
           System.out.println(nums[i]);
       }
       
       Tree root = new Tree();
       root.rootValue = nums[5];
       
       for (int i =0; i< nums.length; i++) {
           root.storeValue(nums[i]);
       }
       root.preList();
       System.out.println();
       root.middleList();
   }
    
}
