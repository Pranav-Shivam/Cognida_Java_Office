package tester;

import java.util.*;
public class Combinations {
    public static void main(String[] args)
    {

    }
    public List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> result=new ArrayList<>();
        helpOut(n,k,1,result,new ArrayList<>());
        return result;
    }
    public void helpOut(int n,int k,int index,List<List<Integer>> result,List<Integer> temp)
    {
        if(temp.size()==k)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i <=n; i++)
        {
            temp.add(i);
            helpOut(n,k,i+1,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}
