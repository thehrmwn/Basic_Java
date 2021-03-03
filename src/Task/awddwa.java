package Task;

class awddwa {
    float hitungLuas(){
       System.out.print("Menghitung Luas");
        return 0;
    }
    float hitungVolume(){
       System.out.print("Menghitung Volume");
        return 0;
    }
}

class Persegi extends awddwa{
    float sisi = 7;
    
    @Override
    float hitungLuas(){
        return (sisi*sisi);
    }
    @Override
    float hitungVolume(){
        return (4*sisi);
    }
}