/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }

        Deque<TreeNode> deque=new LinkedList<>();
        deque.offer(root);
        boolean righToleft=true;

        while (!deque.isEmpty()){
            int levelSize=deque.size();
            List<Integer> current=new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode temp=deque.removeFirst();
                current.add(temp.val);

                if(temp.left!=null) deque.addLast(temp.left);
                if(temp.right!=null) deque.addLast(temp.right);
            }

            if(!righToleft){
               Collections.reverse(current);
                result.add(new ArrayList<>(current));
            }else {
                result.add(new ArrayList<>(current));
            }

            righToleft=!righToleft;
        }

        return result;
    }
}