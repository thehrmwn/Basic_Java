package Meetings8_Inheritance;

class Employee {
    int nip;
    String nama;
    double gaji;
    
    public Employee (int nip,String nama, double gaji){ //Constructor
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }
    
    public void info() { //Method untuk dipanggil
        System.out.println("Nama : " + nama);
        System.out.println("NIP  : " + nip);
    }
    public void terimaGaji() { //Method untuk dipanggil
        System.out.println("Gaji  : " + gaji);
    }
}

class Staff extends Employee { //Pewarisan dari Employee
    String bagian;
    
    public Staff(int nip, String nama, double gaji) {
        super(nip, nama, gaji); //Digunakan untuk mengisi nilai
    }
    
    public void infoBagian() {
        System.out.println("Anda berada dibagian " + bagian);
    }
}

class Manager extends Staff{ //Pewarisan dari Staff - Employee
    public Manager(int nip, String nama, double gaji){
        super (nip, nama, gaji); 
    }
    
    @Override
    public void infoBagian() {
        System.out.println("Manager pada Bagian " + super.bagian);
        //super.method (method yang sama dengan method pada superClass)
    }
        
}