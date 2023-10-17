package tutor;

public class Lampu implements InterfaceLampu {
    int statusLampu;

    public void hidupkan() {
        if (statusLampu = KEADAAN_MATI) {
            System.out.println("Matikan lampu!-> Lampu mati");
        } else {
            System.out.println("Matikan lampu!-> Lampu sudah mati kok");
        }
    }
}
