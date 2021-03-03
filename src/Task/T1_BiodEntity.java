package Task;

import java.util.Scanner;

public class T1_BiodEntity {
    public static void main (String[] args) {
        
        String Name, Room, Month, Place;
        int Year, Age;
        char Blood;
        short Date;
        double Weight;
        float Height;
        long Npm, Phone;
           
           System.out.println ("\t --- INPUT YOUR IDENTITY --- ");
           System.out.println ("\t ==============================");
           
        Scanner input = new Scanner (System.in);
           
           System.out.print ("Name \t\t : ");
           Name = input.nextLine();
           
           System.out.print ("Class \t\t : " );
           Room = input.nextLine();
           
           System.out.print ("NPM \t\t : ");
           Npm = input.nextLong();
           
           System.out.println ("Place/Date Born  : ");
           System.out.print ("Place \t\t : ");
           Place = input.next();
           
           System.out.print ("Date \t\t : ");
           Date = input.nextShort();
           
           System.out.print ("Month \t\t : ");
           Month = input.next();
           
           System.out.print ("Year \t\t : ");
           Year = input.nextInt(5);
           
           System.out.print ("Age \t\t : ");
           Age = input.nextInt();
           
           System.out.print ("Blood Type \t : ");
           Blood = input.next().charAt(0);
           
           System.out.print ("Height \t\t : ");
           Height = input.nextFloat();
           
           System.out.print ("Weight \t\t : ");
           Weight = input.nextDouble();
           
           System.out.print ("No.Phone (+62)\t : ");
           Phone = input.nextLong();
           
               System.out.println ("\t --- YOUR IDENTITY --- ");
               System.out.println ("  Name \t\t  : " + Name);
               System.out.println ("  Class \t  : " + Room );
               System.out.println ("  NPM \t\t  : 552011" + Npm);
               System.out.println ("  Place/Date Born : " + Place + ", "+ Date + " " + Month + Year);
               System.out.println ("  Age \t\t  : " + Age);
               System.out.println ("  Blood Type \t  : " + Blood);
               System.out.println ("  Height \t  : " + Height);
               System.out.println ("  Weight \t  : " + Weight );
               System.out.println ("  No.Phone \t  : +62" + Phone);    
      
    }
}
