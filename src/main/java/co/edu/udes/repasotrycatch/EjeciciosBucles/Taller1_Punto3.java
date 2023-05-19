/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.repasotrycatch.EjeciciosBucles;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Taller1_Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x=0;
        
        System.out.println("Ingrese el numero que represente el bucle con el cual quiere trabajar");
        System.out.println("1->Bucle For");
        System.out.println("2->Bucle While");
        System.out.println("3->Bucle Do-While");
        System.out.println("4->Bucle ForEach");
        try{
            x=keyboard.nextInt();
        }catch(Exception e){
            System.err.println("Hubo un error al momento de ingresar los datos");
            System.exit(0);
        }
        
        
        if(x==1){
            For();
        }else if(x==2){
            While();
        }else if(x==3){
            DoWhile();
        }else if(x==4){
            ForEach();
        }
        
        
    }
    
    public static void For(){
    Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int almacen = (int)(Math.random()*23+1);
        String[] nombre = new String[almacen];
        int[] cantidad = new int [almacen];
        double[] precio = new double [almacen];
        boolean valido = false;
        String aux="";
        int comprobar;
        System.out.println("Ingrese los "+almacen+" productos" );
        
        
        /* Ingresar los productos */
        
        for(int i=0; i<almacen;i++){
            
               do{
                    System.out.print("Ingresa el nombre del producto:");
                    aux=teclado.next();   
                    if(aux.matches("[a-zA-Z]*")){
                        
                       nombre[i]=aux;
                       valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                    }
               }while(valido==false);
                
               valido=false;
               
                do{
                    System.out.print("Ingrese la cantidad de productos: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[0-9]*")){
                        
                        comprobar = Integer.parseInt(aux);
                        cantidad[i]=comprobar;
                       
                        valido=true;
                        
                    }else{
                        System.out.println("\n Ingrese de manera correcta la cantidad \n"); 
                    } 
                }while(valido==false);
                
                valido=false; 
                do{
                    System.out.print("Ingrese el precio del producto: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[a-zA-Z]*")){
                        System.out.println("\n Ingrese de manera correcta el precio del producto \n"); 
                        
                    }else{
                        comprobar = (int) Double.parseDouble(aux);
                        precio[i]=comprobar;
                        valido=true;
                    } 
                }while(valido==false);
                 
                 System.out.println("");
        }
        System.out.println("\n");
       
        /* Salida de datos */
        
        
        
        for(int i=0; i<almacen;i++){
            
   
                System.out.print("Producto: "+nombre[i]+"\n");
         
                
            
            
       
               System.out.print("Cantidad: "+cantidad[i]+"\n");
       
           
            

                System.out.print("el precio es: "+precio[i]+"\n");
                 
            
            
            System.out.println("");
            
        }
    
    }
    public static void While(){
        Scanner teclado = new Scanner(System.in);
            teclado.useDelimiter("\n");
            int almacen = (int)(Math.random()*23+1);
            String[] nombre = new String[almacen];
            int[] cantidad = new int [almacen];
            double[] precio = new double [almacen];
            boolean valido = false;
            String aux="";
            int comprobar, i=0;
            System.out.println("Ingrese los "+almacen+" productos" );


            /* Ingresar los productos */

            while(i<almacen){

                   do{
                        System.out.print("Ingresa el nombre del producto:");
                        aux=teclado.next();   
                        if(aux.matches("[a-zA-Z]*")){
                           nombre[i]=aux;
                           valido=true;
                        }else{
                            System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                        }
                   }while(valido==false);

                   valido=false;

                    do{
                        System.out.print("Ingrese la cantidad de productos: ");
                        aux=teclado.next();

                        if(aux.matches("[0-9]*")){
                            comprobar = Integer.parseInt(aux);
                            cantidad[i]=comprobar;
                            valido=true;
                        }else{
                            System.out.println("\n Ingrese de manera correcta la cantidad \n"); 
                        } 
                    }while(valido==false);

                    valido=false; 
                    do{
                        System.out.print("Ingrese el precio del producto: ");
                        aux=teclado.next();

                        if(aux.matches("[a-zA-Z]*")){
                            System.out.println("\n Ingrese de manera correcta el precio del producto \n"); 

                        }else{
                            comprobar = (int) Double.parseDouble(aux);
                            precio[i]=comprobar;
                            valido=true;
                        } 
                    }while(valido==false);

                     System.out.println("");
                  i++;   
            }
            System.out.println("\n");


            /* Salida de datos */
            i=0; 

            while(i<almacen){


                    System.out.print("Producto: "+nombre[i]+"\n");





                   System.out.print("Cantidad: "+cantidad[i]+"\n");




                    System.out.print("el precio es: "+precio[i]+"\n");



                System.out.println("");
             i++;
            }
    
    
    }
    public static void DoWhile(){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int almacen = (int)(Math.random()*23+1);
        String[] nombre = new String[almacen];
        int[] cantidad = new int [almacen];
        double[] precio = new double [almacen];
        boolean valido = false;
        String aux="";
        int comprobar, i=0;
        System.out.println("Ingrese los "+almacen+" productos" );
        
        
        /* Ingresar los productos */
        
        do{
            
               do{
                    System.out.print("Ingresa el nombre del producto:");
                    aux=teclado.next();   
                    if(aux.matches("[a-zA-Z]*")){
                       nombre[i]=aux;
                       valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                    }
               }while(valido==false);
                
               valido=false;
               
                do{
                    System.out.print("Ingrese la cantidad de productos: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[0-9]*")){
                        comprobar = Integer.parseInt(aux);
                        cantidad[i]=comprobar;
                        valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta la cantidad \n"); 
                    } 
                }while(valido==false);
                
                valido=false; 
                do{
                    System.out.print("Ingrese el precio del producto: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[a-zA-Z]*")){
                        System.out.println("\n Ingrese de manera correcta el precio del producto \n"); 
                        
                    }else{
                        comprobar = (int) Double.parseDouble(aux);
                        precio[i]=comprobar;
                        valido=true;
                    } 
                }while(valido==false);
                 
                 System.out.println("");
              i++;   
        }while(i<almacen);
        System.out.println("\n");
       
        
        /* Salida de datos */
        i=0; 
        
        do{
            
   
                System.out.print("Producto: "+nombre[i]+"\n");
         
                
            
            
       
               System.out.print("Cantidad: "+cantidad[i]+"\n");
       
           
            

                System.out.print("el precio es: "+precio[i]+"\n");
                 
            
            
            System.out.println("");
         i++;
        }while(i<almacen);
    
    }
    public static void ForEach(){
    Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int almacen = (int)(Math.random()*23+1);
        String[] nombre = new String[almacen];
        int[] cantidad = new int [almacen];
        double[] precio = new double [almacen];
        boolean valido = false;
        String aux="";
        int comprobar, h = 0, z=0;
        System.out.println("Ingrese los "+almacen+" productos" );
        
        
        /* Ingresar los productos */

            for(String i: nombre){
               do{
                    System.out.print("Ingresa el nombre del producto:");
                    aux=teclado.next();   
                    if(aux.matches("[a-zA-Z]*")){
                       nombre[h]=aux;
                       valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                    }
               }while(valido==false);
               h++;
            }   
                System.out.println("");
                h=0;
               valido=false;
            for(int i: cantidad){   
                do{
                    System.out.print("Ingrese la cantidad de productos: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[0-9]*")){
                        comprobar = Integer.parseInt(aux);
                        cantidad[h]=comprobar;
                        valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta la cantidad \n"); 
                    } 
                }while(valido==false);
                h++;
            }
                System.out.println("");
                h=0;
                valido=false; 
            for(double i: precio){   
                do{
                    System.out.print("Ingrese el precio del producto: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[a-zA-Z]*")){
                        System.out.println("\n Ingrese de manera correcta el precio del producto \n"); 
                        
                    }else{
                        comprobar = (int) Double.parseDouble(aux);
                        precio[h]=comprobar;
                        valido=true;
                    } 
                }while(valido==false);
                h++;
            }     
                 System.out.println("");
        
                 
                 
        System.out.println("\n");
        
     
        /* Salida de datos */
           
        
        
      
            

              System.out.println("Los productos seleccionados fueron");
               for(String i : nombre){
                System.out.print("Producto: "+i+"\n");
               }
                System.out.println("");
            
            System.out.println("La cantidad de los productos seleccionados fue");
               for(int i: cantidad){
               System.out.print("Cantidad: "+i+"\n");
               }
               System.out.println("");
               
            System.out.println("El precio de los productos seleccionados es");
               for (double i: precio){
                System.out.print("el precio es: "+i+"\n");
               }  
               System.out.println("");
            
            
    
    
    }
    
}
