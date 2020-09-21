class Solution {
    private TreeNode output;
    public Solution(){
        this.output = null;
    }
    private boolean recurse(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)
            return false;
        int left = this.recurse(root.left,p,q)?1:0;
        int right = this.recurse(root.right,p,q)?1:0;
        int mid = (root==p || root==q) ? 1:0;
        if(left+mid+right>=2){
            this.output = root;
        }
        return (left+mid+right>0);

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.recurse(root,p,q);
        return this.output;
    }
}