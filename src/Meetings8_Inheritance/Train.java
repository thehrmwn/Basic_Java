package Meetings8_Inheritance;

public class Train {
    public static void main(String[] args) {
        Employee e = new Employee(111, "Andi", 200000);
        Staff m = new Staff(112, "Asep", 100000);
        Manager n = new Manager(113, "Tingky", 500000);
        m.bagian = "Keuangan";
        n.bagian = "Kepegawaian";
        
        System.out.println("Pegawai ke-1");
        e.info();
        e.terimaGaji();
        System.out.println("Pegawai ke-2");
        m.info();
        m.terimaGaji();
        m.infoBagian();
        System.out.println("Pegawai ke-3");
        n.info();
        n.terimaGaji();
        n.infoBagian();
        
        
        
    }
    
}
