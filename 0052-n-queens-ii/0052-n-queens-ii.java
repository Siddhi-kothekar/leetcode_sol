import java.util.*;
class Solution {
    public static boolean isSafe(char board[][],int row,int col)
    {
        int n=board.length;
        //check vertically-->row chnages but col fixed
        for(int i=0;i<n;i++)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        //check horizontally-->col changes but row same 
        for(int j=0;j<n;j++)
        {
            if(board[row][j]=='Q')
            {
                return false;
            }
        }

        //Now its time to check for all 4 Diagonals

        //2 Right Diagonals as R1 and R2
        //R1 = top right
        int i=row;
        int j=col;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }
        //R2 - bottom right
        i=row;
        j=col;
        while(i<n && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j++;
        }

        //2 Left Diagonals as L1 and L2
        //L1 = top left
        i=row;
        j=col;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }

        //L2 = bottom left
        i=row;
        j=col;
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void board(char arr[][],int row,List<List<String>> mainlist)
    {
        if(row==arr.length)
        {
            //make a list and add in the mainlist
            List<String> sublist=new ArrayList<>();
            String str="";
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    str+=arr[i][j];
                }
                sublist.add(str);
                str="";
            }
            mainlist.add(sublist);
            return;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(isSafe(arr,row,j))
            {
                arr[row][j]='Q';
                board(arr,row+1,mainlist);
                arr[row][j]='.';//backtracking
            }
        }
    }
    public int totalNQueens(int n) {
        //all possible solutions will be there in a single mainList
        //each sublist will be a string type

        List<List<String>> mainlist=new ArrayList<>();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]='.';
            }
        }
        board(arr,0,mainlist);
        return mainlist.size();
    }
}