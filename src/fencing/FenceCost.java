package fencing;

import java.util.Scanner;

public class FenceCost
{
    public static void main( String[] args)
   {    int gates=1;
        String material="";
        double materialrate=0.0;
        double totalprice=0.0;
        System.out.println("Enter the length of the yard: ");
        Scanner scannerInput=new Scanner(System.in);
        double len = scannerInput.nextDouble();
        System.out.println("Enter the width of the yard: ");
        double wid=scannerInput.nextDouble();
        System.out.println("The length is "+len +" feet");
        System.out.println("The width is "+wid +" feet");
        
        
        do {
        System.out.println("Enter type (Wood or Chain): ");
        material=scannerInput.next();
        } while(material.equalsIgnoreCase("wood")==false && material.equalsIgnoreCase("chain")==false);
        if (material.equalsIgnoreCase("wood")){
               materialrate=25;}
        else if (material.equalsIgnoreCase("chain")){
                materialrate=15;}
        else{
             materialrate=0;}
             
             
        double peri = ((2*len) +(2*wid ));     
        double installprice=peri* materialrate;
        //System.out.println(installprice);
        
        do {
        System.out.println( "Enter number of gates: ");
        gates= scannerInput.nextInt();
        } while(gates>3 || gates<1);
        installprice = installprice+(gates*150);
        
        //totalprice = installprice+50 ;
        
        totalprice=(installprice*(1.06)) +50;
        
        
        
        
        System.out.println("The perimeter is "+  peri  + " feet.");
        System.out.println( " The total price is "+ totalprice);
        
       
        scannerInput.close();
    }
}