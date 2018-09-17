package com.example.darkheart.tictactoe;

import java.util.Arrays;

public class GameStatus {

    private boolean[] IsBtnChecked = new boolean[9];
    private String[]  BtnContent = new String[9];
    private Boolean win = Boolean.FALSE;

    /**********************************************************************************************
     *  Constructor
     *********************************************************************************************/
    public GameStatus(){

        Arrays.fill(IsBtnChecked, Boolean.FALSE);
        Arrays.fill(BtnContent, "");
    }

    /**********************************************************************************************
     *  get_IfButtonIsChecked
     *********************************************************************************************/
    public Boolean get_IfButtonIsChecked(int index){ return IsBtnChecked[index]; }


    /**********************************************************************************************
     *  set_btnCheckedValue
     *********************************************************************************************/
    public void set_btnCheckedValue(int index, Boolean checked){
        IsBtnChecked[index] = checked;
    }


    /**********************************************************************************************
     *  set_btnContentValue
     *********************************************************************************************/
    public void set_btnContentValue(int index, String player){
        BtnContent[index] = player;
    }


    /**********************************************************************************************
     *  get_btnContentValue
     *********************************************************************************************/
    public String get_btnContentValue(int index){ return BtnContent[index]; }



    /**********************************************************************************************
     *  check_IfWinnerIsX
     *********************************************************************************************/
    public Boolean check_IfWinnerIs(String player){
        Boolean winner = Boolean.FALSE;

        // Horizontal Win
        if( (get_btnContentValue(0) == player)
            &&(get_btnContentValue(1) ==  player)
            &&(get_btnContentValue(2) == player)){
            winner = Boolean.TRUE;

        }
        if( (get_btnContentValue(3) == player)
                &&(get_btnContentValue(4) == player)
                &&(get_btnContentValue(5) == player)){
            winner = Boolean.TRUE;

        }
        if( (get_btnContentValue(6) == player)
                &&(get_btnContentValue(7) == player)
                &&(get_btnContentValue(8) == player)){
            winner = Boolean.TRUE;

        }

        // Vertical Win
        if( (get_btnContentValue(0) == player)
                &&(get_btnContentValue(3) == player)
                &&(get_btnContentValue(6) == player)){
            winner = Boolean.TRUE;
        }
        if( (get_btnContentValue(1) == player)
                &&(get_btnContentValue(4) == player)
                &&(get_btnContentValue(7) == player)){
            winner = Boolean.TRUE;
        }
        if( (get_btnContentValue(2) == player)
                &&(get_btnContentValue(5) == player)
                &&(get_btnContentValue(8) == player)){
            winner = Boolean.TRUE;
        }

        // Diagonal Winner
        if( (get_btnContentValue(0) == player)
                &&(get_btnContentValue(4) == player)
                &&(get_btnContentValue(8) == player)){
            winner = Boolean.TRUE;
        }
        if( (get_btnContentValue(2) == player)
                &&(get_btnContentValue(4) == player)
                &&(get_btnContentValue(6) == player)){
            winner = Boolean.TRUE;
        }

        return winner;
    }

    /**********************************************************************************************
     *  set_winStatus
     *********************************************************************************************/
    public void set_winStatus(Boolean status){
        this.win = status;
    }


    /**********************************************************************************************
     *  get_winStatus
     *********************************************************************************************/
    public Boolean get_winStatus(){ return this.win;}
}
