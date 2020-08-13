package InterfacesBanco;


public class cls_cuentaInicio {
    
    
    
    float saldoCuenta=0;
    float cantidadMovientos=0;
    float  DineroMov;

    public float getDineroMov() {
        return DineroMov;
    }

    public void setDineroMov(float DineroMov) {
        this.DineroMov = DineroMov;
    }
    
    
    
    
    public void retiroDinero(){
        
        if(DineroMov > 0  && DineroMov <= 4000) { 
            
            saldoCuenta = saldoCuenta - DineroMov;
            
            if (saldoCuenta >0) {          
                
                cantidadMovientos=cantidadMovientos+1;
                
                if (cantidadMovientos >4) {
                    
                    double IVA = (DineroMov * 2) + 25;
                    
                    System.out.println("La cantidad a pagar con inva incluido es de $" + IVA);
                }                
                System.out.println("Retiro correto, le quedan $" + saldoCuenta);                
            } else {           
                saldoCuenta = saldoCuenta + DineroMov;
                System.out.println("Saldo restante en la cuenta $ "+saldoCuenta);
            }                 
        } else {
            System.out.println("no puedes retirar mas de $4000, intenta otra vez");
        } 
    }
        
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    

    
    

