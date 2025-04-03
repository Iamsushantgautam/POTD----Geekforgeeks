
class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        if(mat == null || mat.length == 0) return -1;
        
        int n = mat.length,m=mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fc = 0,time = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 2){
                    queue.add(new int[]{i,j});
                }else if(mat[i][j] == 1){
                    fc++;
                }
            }
        }
        
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        
        while(!queue.isEmpty() && fc>0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] rotten =queue.poll();
                int x = rotten[0],y=rotten[1];
                for(int[] dir : directions){
                    int nx=x+dir[0],ny=y+dir[1];
                    
                    if(nx>=0 && nx <n && ny>=0 && ny<m && mat[nx][ny] == 1){
                        mat[nx][ny] = 2;
                        
                        fc--;
                        queue.add(new int[] {nx,ny});
                    }
                }
            }
            time++;
        }
        
        return (fc ==0) ? time : -1;
        
    }
}
