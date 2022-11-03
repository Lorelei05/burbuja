package burbuja;

/**
 *
 * @author Berke
 */
public class ordenador {
       public void main(int [] array) 
    {
     int aux;
     boolean cambios = false;
     
     while (true)
             {
                 cambios = false;
                 for(int i=1;i<array.length;i++)
                 {
                     if(array[1]<array[i-1])
                     {
                 aux = array[1];
                 array [1] = array [i-1];
                 array [i-1] = aux;
                 cambios = true;
             }
             }
       if(cambios==false)
       break;
    
             }
     return;
    }
}
  
