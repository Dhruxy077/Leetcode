/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int rows, int cols, ListNode head) {
        int[][] result=new int[rows][cols];
        int row=0;
        int col=0;

        while(row<rows && col<cols){
            for(int i=col;i<cols;i++){
                result[row][i]=(head!=null)?head.val:-1;
                head=(head!=null)?head.next:null;
            }

            row++;

            for(int i=row;i<rows;i++){
                result[i][cols-1]=(head!=null)?head.val:-1;
                head=(head!=null)?head.next:null;
            }

            cols--;

            if(row<rows){
                for(int i=cols-1;i>=col;i--){
                    result[rows-1][i]=(head!=null)?head.val:-1;
                    head=(head!=null)?head.next:null;
                }
                rows--;
            }

            if(col<cols){
                for(int i=rows-1;i>=row;i--){
                    result[i][col]=(head!=null)?head.val:-1;
                    head=(head!=null)?head.next:null;
                }
                col++;
            }
        }

        return result;
    }
}