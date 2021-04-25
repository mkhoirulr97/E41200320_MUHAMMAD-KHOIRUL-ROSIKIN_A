package Week7_Tugas2;

/**
 *
 * @author khoirul
 */
public class TelevisiModern extends Televisi {

    public static final String TV = "tv";
    public static final String TELETEXT = "teletext";
    String ModusTampilan = TV;
    int HalamanTeletext;
    String DiscTray = null;

    protected TelevisiModern(String deskripsi, int jumlahChannel) {
        super(deskripsi, jumlahChannel);
    }

    protected void setHalamanTeletext(int halamanTeletext) {
        this.HalamanTeletext = halamanTeletext;
        System.out.println("Berpindah ke halaman teletext " + HalamanTeletext);
    }

    protected int getHalamanTeletext() {
        return HalamanTeletext;
    }

    protected void setModusTampilan(String modusTampilan) {
        if (modusTampilan == TV) {
            System.out.println("Modus tampilan : Televisi");
        } else if (modusTampilan == TELETEXT) {
            System.out.println("Modus tampilan : Teletext");
        } else {
            System.out.println("Tidak ada modus tampilan");
        }
    }

    protected void setDiscTray(String discTray) {
        this.DiscTray = discTray;
    }

    protected String getDiscTray() {
        return DiscTray;
    }

    protected void playCD() {
        if (DiscTray == null) {
            System.out.println("Tidak ada CD di dalam disc tray!");
            return;
        } else {
            System.out.println("Memutar Film " + DiscTray);
            return;
        }
    }

    protected void playCD(String discTray) {
        if (discTray == null) {
            System.out.println("Tidak ada CD di dalam disc tray!");
            return;
        } else {
            System.out.println("Memutar Film " + discTray);
            return;
        }
    }
}
