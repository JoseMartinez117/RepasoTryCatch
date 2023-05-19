/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.repasotrycatch.EjeciciosBucles;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Taller1_Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Solucion con bucle FOR");
        System.out.println("");
        For();
        System.out.println("");
        System.out.println("Solucion con bucle WHILE");
        System.out.println("");
        While();
        System.out.println("");
        System.out.println("Solucion con bucle DO-WHILE");
        System.out.println("");
        DoWhile();
        System.out.println("");
        System.out.println("Solucion con bucle FOR EACH");
        System.out.println("");
        ForEach();
        System.out.println("");
    }
    
    public static void For(){
    Scanner teclado = new Scanner(System.in);
        double moda=0, moda2=0, mediana=0, media=0, a=0, b=0, z=0,aux2=0, aux3=0, cont=0, aux4=0, aux5=0; //Declaramos las variables a usar en el codigo
        
        int aux;
        
   
        aux = (int)(Math.random()*16+1); //Utilizamos la funcion math.random para generar un numero aleatorio de 0 a 16 que sera la cantidad de espacios que tendra el vector
        
        if(aux>1){
            double[] vec1 = new double [aux];   // Creamos el vector y le agregamos el tamaño previamente generado

            DecimalFormat df= new DecimalFormat("#.00");

            /* Ingreso de datos al vector */

           System.out.println("Ingrese los "+aux+" valores:\n");
            for(int f=0; f<vec1.length;f++){                   
                try{
                    System.out.print("Ingresar nuevo dato: ");

                    vec1[f]=teclado.nextInt();
                }catch(Exception e){
                    System.err.println("Se ha producido un error al digitar los datos");
                    System.out.println(e.getMessage());
                    System.exit(0);
                }

            }



            // Calcular la mediana
            Arrays.sort(vec1);
            b=aux/2;   //Dividimos por 2 para encontrar la mitad del vector
            a=aux%2;   // Sacamos el residuo de la division y la almacenamos
            Math.round(b);  // redondeamos la division del vector al numero entero mas cercano,
            z=b+1;       


                    if (a!=0){

                        for (int i=0; i<vec1.length; i++){              //Proceso para hayar la mediana cuando la cantidad es impar
                            if(i==b){

                                System.out.println("\n La mediana es: "+vec1[i]);
                            }
                        }

                    }else{
                        for (int i=0; i<vec1.length; i++){             //Proceso para hayar la mediana cuando la cantidad es par
                            if(i==b){
                                aux2=vec1[i];  
                            }

                            if(i==z){
                                aux3=vec1[i];
                            }

                        }
                        mediana=(aux2+aux3)/2;
                        System.out.println("\n La mediana es: "+mediana);

                    } 






           //Calcular media

               for (int i = 0; i < vec1.length; i++) {             // Proceso para hayar la media
                media+=vec1[i];
            }
              media=media/aux;

            System.out.println("\n La media es: "+df.format(media));





           // Calcular la moda


              for (int i=0; i<vec1.length; i++){       //Proceso para hayar la moda 
                  cont=vec1[i];
                  if (aux4 == cont){            
                  moda=aux4;

                  }else{
                  aux4=cont;
                  }
              }   

              cont=0;                           

              for (int i=0; i<vec1.length; i++){    //Proceso para hayar la moda multiple
                  cont=vec1[i];
                  if(moda!=cont && aux5==cont){
                   moda2=aux5;
                  }else{
                  aux5=cont;
                  }

              }

            if (moda<=0){                        //Comparador para definir si existe la moda, moda normal y la moda multiple

                System.out.println("\n No hay una moda, todos comparten la misma cantidad");

            }else if (moda>=1 && moda2>=1){

              System.out.println("\n La moda es: "+moda+" y "+moda2);

            }else if(moda>=1){
              System.out.println("\n La moda es: "+moda);

            }
        }else if(aux==1) {
            media=1;
            moda=1;
            mediana=1;
            
            System.out.println("La mediana es:  "+mediana);
            System.out.println("La media es: "+media);
            System.out.println("\n No hay una moda, todos comparten la misma cantidad: "+moda);
            
            
        }
    }
    
    public static void While(){
    Scanner teclado = new Scanner(System.in);
        double moda=0, moda2=0, mediana=0, media=0, a=0, b=0, z=0,aux2=0, aux3=0, cont=0, aux4=0, aux5=0; //Declaramos las variables a usar en el codigo
        
        int i, aux, k = 0;
        
      
            aux = (int)(Math.random()*16+1); //Utilizamos la funcion math.random para generar un numero aleatorio de 0 a 16 que sera la cantidad de espacios que tendra el vector
            
       
   
       
        double[] vec1 = new double [aux];   // Creamos el vector y le agregamos el tamaño previamente generado
        
        DecimalFormat df= new DecimalFormat("#.00");
        
        i=0;
        
        /* Ingreso de datos al vector */ 
         
       System.out.println("Ingrese los "+aux+" valores:\n");
            
            while(i<vec1.length){
            System.out.print("Ingresar nuevo dato: ");
            try{
            vec1[i]=teclado.nextInt();
            }catch(Exception e){
                System.err.println("Se ha producido un error al digitar los datos");
                System.out.println(e.getMessage());
                System.exit(0);
            } 
            i++;
            }
        i=0;
            
     
        
        // Calcular la mediana
        Arrays.sort(vec1);
        System.out.println("");

        
        b=aux/2;   //Dividimos por 2 para encontrar la mitad del vector
        a=aux%2;   // Sacamos el residuo de la division y la almacenamos
        Math.round(b);  // redondeamos la division del vector al numero entero mas cercano,
        z=b+1;       
        
        
           
                if (a!=0){

                    while(i<vec1.length){              //Proceso para hayar la mediana cuando la cantidad es impar
                        
                        if(i==b){
                           
                            System.out.println("\n La mediana es: "+vec1[i]);
                        }
                        i++;
                    }
                    i=0;

                }else{
                    while(i<vec1.length){             //Proceso para hayar la mediana cuando la cantidad es par
                        
                        if(i==b){
                            aux2=vec1[i];  
                        }

                        if(i==z){
                            aux3=vec1[i];
                        }
                        i++;
                    }
                    mediana=(aux2+aux3)/2;
                    System.out.println("\n La mediana es: "+mediana);
                    i=0;
                } 

     
           
            
   
            
       //Calcular media
       
           while(i<vec1.length) {             // Proceso para hayar la media
              k+=vec1[i];
              i++;
        }
          media=k/aux;
          System.out.println("\n La media es: "+df.format(media));
          i=0;
        
        
        
            
       // Calcular la moda
      
              
          while(i<vec1.length){       //Proceso para hayar la moda 
              
              cont=vec1[i];
              if (aux4 == cont){            
              moda=aux4;
              
              }else{
              aux4=cont;
              }
              i++;
          }   
          i=0;
          cont=0;                           
          
          while(i<vec1.length){    //Proceso para hayar la moda multiple
              
              cont=vec1[i];
              if(moda!=cont && aux5==cont){
               moda2=aux5;
              }else{
              aux5=cont;
              }
              i++;
          }
          i=0;
          
        if (moda<=0){                        //Comparador para definir si existe la moda, moda normal y la moda multiple
        
            System.out.println("\n No hay una moda, todos comparten la misma cantidad");
            
        }else if (moda>=1 && moda2>=1){
            
          System.out.println("\n La moda es: "+moda+" y "+moda2);
          
        }else if(moda>=1){
          System.out.println("\n La moda es: "+moda);
        
        }
    }
    
    public static void DoWhile(){
    Scanner teclado = new Scanner(System.in);
        double moda=0, moda2=0, mediana=0, media=0, a=0, b=0, z=0,aux2=0, aux3=0, cont=0, aux4=0, aux5=0; //Declaramos las variables a usar en el codigo
        int i, aux, k = 0;
        
     
        aux = (int)(Math.random()*16+1); //Utilizamos la funcion math.random para generar un numero aleatorio de 0 a 16 que sera la cantidad de espacios que tendra el vector
            
       
        
        double[] vec1 = new double [aux];   // Creamos el vector y le agregamos el tamaño previamente generado
        
        DecimalFormat df= new DecimalFormat("#.00");
        
        i=0;
       
        
        /* Ingreso de datos al vector */
        
       System.out.println("Ingrese los "+aux+" valores:\n");
            
            while(i<vec1.length){
                try{
                System.out.print("Ingresar nuevo dato: ");
                vec1[i]=teclado.nextInt();
                i++;
                }catch(Exception e){
                    System.err.println("Se ha producido un error al digitar los datos");
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
            }
        i=0;
            
        
        
        // Calcular la mediana
        Arrays.sort(vec1);
        b=aux/2;   //Dividimos por 2 para encontrar la mitad del vector
        a=aux%2;   // Sacamos el residuo de la division y la almacenamos
        Math.round(b);  // redondeamos la division del vector al numero entero mas cercano,
        z=b+1;       
       
        
            
                if (a!=0){

                    do{              //Proceso para hayar la mediana cuando la cantidad es impar
                        
                        if(i==b){
                           
                            System.out.println("\n La mediana es: "+vec1[i]);
                        }
                        i++;
                    }while(i<vec1.length);
                    i=0;

                }else{
                    do{             //Proceso para hayar la mediana cuando la cantidad es par
                        
                        if(i==b){
                            aux2=vec1[i];  
                        }

                        if(i==z){
                            aux3=vec1[i];
                        }
                        i++;
                    }while(i<vec1.length);
                    
                    mediana=(aux2+aux3)/2;
                    System.out.println("\n La mediana es: "+mediana);
                    i=0;
                } 

     
           
            
   
            
       //Calcular media
       
           do {             // Proceso para hayar la media
             i++;
             
              k+=vec1[i];
              
            }while(i!=vec1.length-1);
           
          media=k/aux;
          System.out.println("\n La media es: "+df.format(media));
          i=0;
        
        
        
            
       // Calcular la moda
      
              
          do{       //Proceso para hayar la moda 
              
              cont=vec1[i];
              if (aux4 == cont){            
              moda=aux4;
              
              }else{
              aux4=cont;
              }
              i++;
          } while(i<vec1.length);  
          i=0;
          cont=0;                           
          
         do{    //Proceso para hayar la moda multiple
              
              cont=vec1[i];
              if(moda!=cont && aux5==cont){
               moda2=aux5;
              }else{
              aux5=cont;
              }
              i++;
          }while(i<vec1.length);
          i=0;
          
        if (moda<=0){                        //Comparador para definir si existe la moda, moda normal y la moda multiple
        
            System.out.println("\n No hay una moda, todos comparten la misma cantidad");
            
        }else if (moda>=1 && moda2>=1){
            
          System.out.println("\n La moda es: "+moda+" y "+moda2);
          
        }else if(moda>=1){
          System.out.println("\n La moda es: "+moda);
        
        }
    
    }
    
    public static void ForEach(){
    Scanner teclado = new Scanner(System.in);
       double mediana, a, aux2 = 0, aux3 = 0;
       int moda = 0, media = 0, aux, b, z, almacen = 0, k=0, cont=0, aux4=0, moda2=0, aux5=0;
       DecimalFormat df= new DecimalFormat("#.00");
           
             aux = (int)(Math.random()*16+1); //Utilizamos la funcion math.random para generar un numero aleatorio de 0 a 16 que sera la cantidad de espacios que tendra el vector
            
   
       
       int vec1[] = new int [aux];
       
        System.out.println("Ingresa por favor los "+ aux +" datos \n");
       
       for(int i: vec1){ 
           System.out.print("Ingresar nuevo dato: ");
           try{
           vec1[almacen]=teclado.nextInt();
           almacen++;
           }catch(Exception e){
               System.out.println("Se ha producido un error al digitar los datos");
               System.exit(0);
           }
           
           
           
       }
       

            // Calcular la mediana
            Arrays.sort(vec1);
            b=aux/2;   //Dividimos por 2 para encontrar la mitad del vector
            a=aux%2;   // Sacamos el residuo de la division y la almacenamos
            Math.round(b);  // redondeamos la division del vector al numero entero mas cercano,
            z=(b+1);       
                    if (a!=0){

                        for (int i=0; i<vec1.length; i++){              //Proceso para hayar la mediana cuando la cantidad es impar
                            if(i==b){

                                System.out.println("\n La mediana es: "+vec1[i]);
                            }
                        }

                    }else{
                        for (int i=0; i<vec1.length; i++){             //Proceso para hayar la mediana cuando la cantidad es par
                            if(i==b){
                                aux2=vec1[i];  
                            }

                            if(i==z){
                                aux3=vec1[i];
                            }

                        }
                        mediana=(aux2+aux3)/2;
                        System.out.println("\n La mediana es: "+mediana);

                    } 
                    
                    
           //Calcular media

               for (int i: vec1) {             // Proceso para hayar la media
                   k+=i;
               }  
              media=k/aux;

            System.out.println("\n La media es: "+df.format(media));




           // Calcular la moda


              for (int i: vec1){       //Proceso para hayar la moda 
                  cont=i;
                  if (aux4 == cont){            
                  moda=aux4;

                  }else{
                  aux4=cont;
                  }
              }   

              cont=0;                           

              for (int i: vec1){    //Proceso para hayar la moda multiple
                  cont=i;
                  if(moda!=cont && aux5==cont){
                   moda2=aux5;
                  }else{
                  aux5=cont;
                  }

              }

            if (moda<=0){                        //Comparador para definir si existe la moda, moda normal y la moda multiple

                System.out.println("\n No hay una moda, todos comparten la misma cantidad");

            }else if (moda>=1 && moda2>=1){

              System.out.println("\n La moda es: "+moda+" y "+moda2);

            }else if(moda>=1){
              System.out.println("\n La moda es: "+moda);

            }
    
    }
    
    
}
