
package Herencia_FiestaAnimacion;

public class cls_paqBasico {
    
    
    
    private int cantniños=0;
    private int niñosextra=0;
    private int total=0;
    
    
    
    public cls_paqBasico(int niños){
        
        this.cantniños=niños;
        
    }

    public int getCantniños() {
        return cantniños;
    }

    public void setCantniños(int cantniños) {
        this.cantniños = cantniños;
    }
    
    
    public void resultado(){
        
        if(this.cantniños<=30){
            
            System.out.print("el total a pagar es de 600 pesos por"+this.cantniños+"niños");
            
        }else{
            
           this.niñosextra=this.cantniños-30;
            this.total=(this.niñosextra*30)+600;
            System.out.print("el total a pagar es de "+ this.total+"pesos por"+this.cantniños+"niños");
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
}
