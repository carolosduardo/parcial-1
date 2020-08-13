
package Herencia_FiestaAnimacion;


public class cls_paqPlus extends cls_paqBasico{
 
    int payaso=0;
    int botaga=0;
    int regalo=0;
    
    public  cls_paqPlus(int niños,int payaso,int botarga,int regalo){
    
    super(niños);
    this.payaso=payaso;
    this.botaga=botarga;
    this.regalo=regalo;

}

    public int getPayaso() {
        return payaso;
    }

    public void setPayaso(int payaso) {
        this.payaso = payaso;
    }

    public int getBotaga() {
        return botaga;
    }

    public void setBotaga(int botaga) {
        this.botaga = botaga;
    }

    public int getRegalo() {
        return regalo;
    }

    public void setRegalo(int regalo) {
        this.regalo = regalo;
    }
    
    
    
    public void resultado(){
        
        int paysobotarga=((this.botaga+this.payaso)*200);
        int totalreg=(this.regalo * 30);
        int totalpbr=paysobotarga+totalreg+1000;
        System.out.print("el total a pagar es de"+totalpbr+"pesos por"+ getCantniños()+"niños..");
        
        
    }
    
    
    
    
    
}
