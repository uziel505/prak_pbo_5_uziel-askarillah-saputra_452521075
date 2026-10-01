public class AntiPatternRefaktor {
    //
    interface Bangun {
        double luas();
    }
}

record LingkaranData(double r) implements Bangun {
    @Override
    public double luas () {
        return math.PI * r * r;
    }
}
 record PersediData(double sisi) implements Bangun{
    @Override
    public double luas() {
        return sisi * sisi;
    }
 }

 record segeitigaData(double alas, double tinggi) implements Bangun {
    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }
 } 

 public static void main(String[] args)
 Bangun[] daftar = {
    new LingkaranData(7),
    new PersediData(5),
    new segeitigaData(4,3)
 };

 double total = 0;
 for (Bangun b : daftar) {
    total += b.luas();
 }

 system.out.printf("total luas (cara polimorfik): %.2f%n", total);
