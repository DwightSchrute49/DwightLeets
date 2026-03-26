class Solution {
    public void gameOfLife(int[][] board) {
        int rows=board.length,cols=board[0].length;
        int[] dir={-1,0,1};
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int live=0;
                for(int dx:dir){
                    for(int dy:dir){
                        if(dx==0&&dy==0) continue;
                        int ni=i+dx,nj=j+dy;
                        if(ni>=0&&nj>=0&&ni<rows&&nj<cols){
                            if(board[ni][nj]==1||board[ni][nj]==2) live++;
                        }
                    }
                }
                if(board[i][j]==1){
                    if(live<2||live>3) board[i][j]=2;
                }else{
                    if(live==3) board[i][j]=-1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]==2) board[i][j]=0;
                if(board[i][j]==-1) board[i][j]=1;
            }
        }
    }
}