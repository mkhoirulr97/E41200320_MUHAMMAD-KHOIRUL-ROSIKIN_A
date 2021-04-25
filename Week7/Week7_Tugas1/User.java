package Week7_Tugas1;

/**
 *
 * @author khoirul
 */
public class User {

    public static void main(String[] args) {
        Televisi tv = new Televisi("TV Tempoe Doeloe, 14 inches", 10);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS TV", "TPI", "TV 7",
            "TVRI", "TV G", "ANTV"};
        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS TV", "TPI", "TV 7"};

        System.out.println("Khoirul, membeli Televisi : " + tv.getDeskripsi());

        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
}
