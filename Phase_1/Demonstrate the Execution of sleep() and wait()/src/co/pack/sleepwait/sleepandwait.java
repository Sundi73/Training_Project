package co.pack.sleepwait;

public class sleepandwait {


      
    private static Object obj = new Object();   
  
   
    public static void main(String[] args)throws InterruptedException   
    {   
          
        //pause process for two second  
        Thread.sleep(2000);   
          
        //print custom statement  
        System.out.println( Thread.currentThread().getName() +   
        " Thread is woken after two second");   
          
        //create synchroniz
        synchronized (obj)    
        {   
            //use wailt() method to set obj in waiting state for two seconds  
            obj.wait(2000);   
  
            System.out.println(obj + " Object is in waiting state and woken after 2 seconds");   
        }   
    } 

}
