package Meetings6_VScope;

public class VaribleScope { //Terdapat 1 public class
    public static void main (String[] args) {
        Person P1 = new Person("Aher");
        Person P2 = new Person("herA");
            P1.display();
        
    }
}

class Person {
    String firstname;
    String lastname;
    char second;
    float koma;
    int age;
    boolean tes;
    
        Person (String firstname) { //Constructor (Harus sama dengan CLASS)
            this.firstname = firstname;
            lastname  = "";
            age       = 7;
            tes       = true; //Encapsulation;
        }
    
    void display () {
        int x = 0; //VarLoc
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(tes);
        System.out.println(second);
        System.out.println(koma);
        System.out.println(x);
     
    }   
}