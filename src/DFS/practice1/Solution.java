package DFS.practice1;

import java.util.Iterator;
import java.util.LinkedList;

public class Solution {
    LinkedList<Integer> list[];
    boolean[] visited;

    public void set(int n){
        list=new LinkedList[n];
        visited = new boolean[n];
        for (int i=0; i<n; i++)
            list[i] = new LinkedList();
    }
    public void DFS(int i){
        visited[i]=true;
        Iterator<Integer> j = list[i].iterator();
        while(j.hasNext()){
            int k= j.next();
            if(!visited[k])
                DFS(k);
        }
    }

    public int solution(int n, int[][] computers) {

        int count = 0;
        set(n);

        for(int i=0;i<n;i++){
            visited[i] = false;
            for(int j=0;j<n;j++){
                if(computers[i][j]== 1)
                    list[i].add(j);
            }
        }

        for(int i =0; i < n; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        return count;
    }
}