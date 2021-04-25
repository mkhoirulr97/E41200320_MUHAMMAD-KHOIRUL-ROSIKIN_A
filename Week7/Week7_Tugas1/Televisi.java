package Week7_Tugas1;

/**
 *
 * @author khoirul
 */
public class Televisi extends User {

    String Deskripsi;
    int JumlahChannel;
    String[] Channels;
    int ChannelAktif;
    int Volume;

    protected Televisi(String deskripsi, int jumlahChannel) {
        this.Deskripsi = deskripsi;
        this.JumlahChannel = jumlahChannel;
    }

    protected String getDeskripsi() {
        return Deskripsi;
    }

    protected int getJumlahChannel() {
        return JumlahChannel;
    }

    protected String[] getChannels() {
        if (Channels == null) {
            System.out.println("Belum ada channel yang diset!");
        }
        return Channels;
    }

    protected void setChannels(String[] semuaChannel) {
        if (semuaChannel.length > JumlahChannel) {
            System.out.println("Maaf TV ini hanya dapat menyimpan " + 
                    JumlahChannel + " channel");
        } else if (semuaChannel.length < JumlahChannel) {
            Channels = semuaChannel;
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }

    protected void setChannelAktif(int channelAktif) {
        if (channelAktif < Channels.length) {
            System.out.println("Pindah channel ke : " + Channels[channelAktif]);
            return;
        } else {
            this.ChannelAktif = channelAktif;
            System.out.println("Channel yang Anda inginkan belum diset");
        }
    }

    protected int getChannelAktif() {
        return ChannelAktif;
    }

    protected void setVolume(int volume) {
        this.Volume = volume;
        System.out.println("Intensitas volume sekarang : " + Volume);
    }

    protected int getVolume() {
        return Volume;
    }
}
