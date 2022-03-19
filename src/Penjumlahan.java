public class Penjumlahan {
    public static <T extends Number> T JumlahTigaAngka(T a, T b, T c) {
        if (a == null || b == null || c == null) {
            return null;
        }
        if (a instanceof Double) {
            return (T) new Double(a.doubleValue() + b.doubleValue() + c.doubleValue());
        } else if (a instanceof Integer) {
            return (T)new Integer(a.intValue() + b.intValue() + c.intValue());
        } else if (a instanceof Float) {
            return (T)new Float(a.floatValue() + b.floatValue() + c.floatValue());
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        double Angka1 = 12;
        double Angka2 = 34;
        double Angka3 = 56;
        System.out.println(Penjumlahan.JumlahTigaAngka(Angka1, Angka2, Angka3));
    }
}
