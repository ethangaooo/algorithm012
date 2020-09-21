class Solution {

    private void helper(int n,int k,List<List<Integer>>ans,String str,int count,List<Integer>list){
        if(n<=0 || count==k){
            if(count==k){
                ans.add(new ArrayList<>(list));
            }

            return;
        }

        //not choosing the number
        helper(n-1,k,ans,str,count,list);

        //choosing the number
        list.add(n);
        helper(n-1,k,ans,str+" "+n,count+1,list);
        if(list.size()>0)
            list.remove(list.size()-1);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        helper(n,k,ans,"",0,list);
        return ans;
    }
}