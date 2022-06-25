//https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1#
public boolean graphColoring(boolean graph[][], int m, int n) {
        int[] color = new int[n];
        return helper(graph,color,0,m);
    }
    public boolean helper(boolean graph[][],int[] color,int node,int m){
        if(node==graph.length)
            return true;
        for(int i=1; i<=m; i++){
            int flag = 0;
            for(int j=0; j<graph[node].length; j++){
                if(graph[node][j] && color[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                color[node] = i;
                if(helper(graph,color,node+1,m))
                return true;
                color[node] = 0;
            }
        }
        return false;
    }
