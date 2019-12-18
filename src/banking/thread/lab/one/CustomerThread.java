package banking.thread.lab.one;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerThread extends Thread{
    Banking bank;
    int withdraw_money;

    public CustomerThread(Banking bank, int withdraw_money) {
        this.bank = bank;
        this.withdraw_money = withdraw_money;
    }

    public void run(){
        try {
            bank.withdraw(withdraw_money);
        }
        catch (InterruptedException ex){
            Logger.getLogger(CustomerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
