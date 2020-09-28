/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.ovningar;

/**
 *
 * @author Tim
 */
public class TicTacToe {
    private String[] board = new String[]{"1","2","3",
                                          "4","5","6",
                                          "7","8","9"};
    //X = true, O = false
   private boolean playerTurn = true;  
   private int turns = 0;
   
    /**
     *
     * @return
     */
    public String[] getBoard(){
       return board;
   }
   
    /**
     * Marks the position with X or O depending on the player
     * 
     * @param position
     * @return
     */
    public boolean mark(int position){
        // Checks whos turn it is
       if(playerTurn){
           board[position - 1] = "X";
       }else{
           board[position - 1] = "O";
       }
       turns++;
       playerTurn = !playerTurn;
       return true;
   }
   
    /**
     *
     * @return
     */
    public boolean isDraw(){
       return turns == 9;
   }
   
    /**
     *
     * @return
     */
    public boolean hasWon(){
       String player = playerTurn ? "X" : "O";
       if(playerTurn){
           if(board[0].equals(player) && board[1].equals(player) && board[2].equals(player)  )
               return true;
           if(board[3].equals(player) && board[4].equals(player) && board[5].equals(player)  )
               return true;
       }
       return true;
   }
}
