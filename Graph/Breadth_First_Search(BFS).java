import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BFS{
    static void bfs(List<List<Integer>>adj,int s,boolean[]visited){

        Queue<Integer>q = new LinkedList<>();

        visited[s]=true;
        q.offer(s);

        while (!q.isEmpty()){
            int curr = q.poll();
            System.out.print(curr+" ");

            for (int x : adj.get(curr)){
                if (!visited[x]){
                    visited[x]=true;
                    q.offer(x);
                }
            }
        }
    }
    static void AddEdgs(List<List<Integer>>adj,int u,int v){

        adj.get(u).add(v);
        adj.get(v).add(u);

    }

    public static void main(String[] args) {

        int v = 5;
        List<List<Integer>>adj = new ArrayList<>();

        for (int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        AddEdgs(adj,0,1);
        AddEdgs(adj,0,2);
        AddEdgs(adj,1,3);
        AddEdgs(adj,1,4);
        AddEdgs(adj,2,4);

        boolean[]visited = new boolean[v];
        bfs(adj,0,visited);

    }
}