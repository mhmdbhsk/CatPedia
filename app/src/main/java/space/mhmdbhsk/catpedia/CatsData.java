package space.mhmdbhsk.catpedia;

import java.util.ArrayList;

public class CatsData {
    private static String[] catNames = {
            "Abyssinian",
            "Asian- Malayan",
            "Bengal",
            "British Shorthair",
            "Dragon Li",
            "Mojave",
            "Persian",
            "Raas-Busok-Madura",
            "Ragdoll",
            "Russian Blue",
            "Snowshoe",
            "Turkish Angora"
    };

    private static String[] catDetails = {
            "Kucing Abyssinian merupakan kucing domestik berbulu pendek, yang dinamai dari kota Abyssinia, Ethiopia. Awalnya mereka berasal dari Ethiopia, namun studi menunjukkan mereka berasal dari Mesir, dan mereka merupakan salah satu kucing dari Pharaoh. Kucing ini diketahui dipopulerkan pada tahun 1871, memenangkan juara ketiga pada Crystal Palace Cat Show. Ciri khas yang dikenal selain bulunya yang cenderung tipis dan telinganya yang terlihat besar adalah kucing ini merupakan salah satu kucing yang cerdas. Abyssinian cenderung sangat aktif, suka bermain, dan bahkan bisa dilatih untuk melakukan cat tricks sehingga bukan hal aneh apabila kamu berminat untuk mengajaknya jalan-jalan menggunakan tali di badannya layaknya seekor anjing. Mungkin pada awalnya mereka cenderung waspada dan pemalu terhadap orang yang tidak dia kenal. Akan tetapi, apabila kucing ini sudah percaya dengan orang sekitar dan pemiliknya, kucing ini merupakan kucing keluarga yang sangat menyenangkan karena sifat alamiahnya yang suka bermain dan penyayang terhadap sekitarnya.",
            "Sering juga disebut sebagai Malaya, meskipun namanya Asian-Malayan tetapi sebenarnya dia berasal dari United Kingdom. Kucing ini merupakan persilangan antara kucing Burmese dan Cinchilla sehingga karakteristik antara Malayan dan Burmese sangatlah mirip. Malayan memiliki karakteristik fisik tubuhnya yang relatif berotot, kaki yang langsing, serta bulu yang bisa lebat maupun berbulu pendek. Malayan tergolong kucing yang aktif, dia senang bermain, bereksplorasi di dalam rumah, dan dapat berinteraksi sosial dengan manusia dengan sangat baik. Meski sangat baik dalam itneraksinya, kucing Malayan tidak perlu keluar rumah, mereka bisa berlama-lama di dalam rumah bahkan tidak perlu keluar rumah sama sekali. Mereka juga tergolong sangat vokal, jadi perlu diperhatikan, ya! Jika orang rumah tidak suka kucing berisik.",
            "Kucing favorit bagi pecinta hewan eksotis, Bengal memiliki corak khusus seperti kucing hutan liar. Meski begitu, Bengal merupakan persilangan kucing Asian Leopard (kucing liar) dan kucing domestik. Ciri khas yang tentu membuat orang-orang tertarik adalah coraknya yang menjadikannya terlihat seperti leopard dan macan, bentuk tubuhnya yang langsing dan cenderung berotot, serta ukuran tubuhnya yang menjadikannya masuk kedalam klasifikasih kucing besar dengar berat sekitar 4-8kg. Kucing Bengal mungkin agak menantang diawal apabila kamu berniat mengadopsinya, mereka sangatlah aktif, dan ketika bosan mereka cenderung dekstruktif yaitu memainkan barang-barang hingga rusak ataupun terjatuh. Mereka juga perlu tempat vertikal seperti pohon ataupun tempat tempat memanjat lainnya. Oleh karena itu, sebaiknya beri mereka kebutuhan sosial yang cukup seperti bermain dengannya, berikan teman kucing/anjing yang lainnya.",
            "Kucing ini dengan mudah ditemukan di jalan-jalan di Inggris. Akan tetapi, kucing ini memiliki sejarah yang cukup menyedihkan. Ketika perang dunia kedua, banyak sekali jumlah kucing ini yang mati. Untungnya, dengan bantuan jenis kucing lain, British shorhair akhirnya kembali berkembang biak lagi. Dengan penampilan fisik hanya berbeda bulu dengan British longhair, kcuing ini juga memiliki sifat yang sama dengan saudaranya.",
            "Kucing yang satu ini merupakan kucing alamiah dari China, bukan hasil persilangan dengan ras kucing lainnya. Berdasarkan buku-buku kuno, kucing ini sudah ada sejak lama, berabad-abad yang lalu, namun baru belakangan ini dia diakui sebagai salah satu jenis kucing ras. Kucing ini memiliki ciri khas corak tabby yaitu corak yang seperti loreng, umumnya warna hitam dan abu-abu. Li memiliki telinga yang menonjol dan tajam, serta tubuhnya relatif berotot. Meskipun banyak kucing yang sekilas mirip dengan Li ini, mereka tidak mudah ditemukan diluar China. Kucing ini memiliki sifat cerdas, aktif, dan bersahabat dengan manusia. Namun jangan salah, mereka merupakan pemburu yang sangat hebat, tidak hanya berburu tikus besar. Konon, mereka juga pernah dilatih bisa untuk mengambil koran dan mengantarkannya ke majikannya.",
            "Kucing Mojave merupakan kucing yang relatif baru dan jenis kucing eksperimental. Menurut Rare & Exotic Feline Registry (Registri kucing langka dan eksotis), mereka merupakan jenis kucing yang terkemuka. Sesuai namanya, mereka berasal dari Gurun Mojave di California. Namun, mereka bukan jenis kucing alamiah, melainkan hasil persilangan antara kucing Bengal dan kucing liar dari gurun tersebut. Pada awalnya, kucing liar gurun bertahan di gurun tersebut dengan cara berburu burung, tikus gurun, kadal, dan serangga. Tetapi seiring berjalannya waktu, populasi disekitar gurun bertambah dan habitat alamiah kucing tersebut menjadi terinvasi dan menyebabkan berkurangnya populasi kucing liar gurun tersebut. Oleh karena itu, program persilangan dimulai untuk melestarikan jenis kucing ini. Mereka memiliki penampilan corak yang khas seperti kucing liar atau Cheetah dan kemiripan postur tubuh seperti Bengal. Meski hasil persilangan dengan kucing liar, Mojave merupakan kucing yang bersahabat dengan manusia meski memiliki sifat alamiah kucing liar. Mereka sangat lincah, waspada, gesit, sangat suka berburu, dan tergolong cerdas.",
            "Kucing ini merupakan jenis kucing yang paling sering dijumpai dirumah-rumah, diluar kucing domestic shorthair. Tidak jelas kapan dan dimana kucing Persian ditemukan, tapi beberapa data menunjukkan bahwa kucing ini berasal dari Persia (sekarang Iran) dan diimpor ke Itali pada tahun 1620 oleh Pietro della Valle. Kucing Persian memiliki ciri khas bulu yang panjang dan tebal, kaki pendek, kepala lebar dengan telinga yang berjauhan. Persian memiliki tubuh yang relatif besar. Kucing Persia merupakan kucing yang aktif ketika kecil, namun menjadi agak keliahtan malas dan tenang ketika dewasa. Karena alasan itu, kucing Persia menjadi kucing yang dipilih banyak orang sebagai kucing keluarga. Mereka penyayang, bersahabat, dan tidak suka membuat ulah. Meskipun begitu, biasanya kucing Persian agak berperilaku malu ata takut terhadap orang baru yang tidak ia kenal.",
            "Kucing Raas, merupakan kucing yang berasal dari Pulau Raas, Madura. Ya, kucing ini berasal dari Indonesia. Kucing Raas merupakan kucing alamiah dan lahir secara natural, bukan hasil persilangan antara jenis kucing lainnya. Beberapa ahli berteori bahwa Raas merupakan keturunan dari Korat. Raas memiliki ukuran yang sedang dengan penampilan yang menyerupai Leopard atau kucing hutan. Raas memiliki temperamen yang energetik dan senang bermain. Bagaimanapun, mereka agak sulit untuk membaur kepada manusia dan memiliki mood yang berubah-ubah serta keras kepala. Kalau kamu berniat mengadopsi mereka, kamu harus ekstra sabar dalam melatih mereka, ya.",
            "Kucing ini dinamai Ragdoll, karena mereka memiliki kebiasaan dari keturunan awal mereka dikembangbiakkan mereka suka menjadi lemas dan sangat santai ketika digendong, menunjukkan kesan ‘pasrah’. Ragdoll cat merupakan hasil persilangan antara Persian dan Birman, dikembangkan di California pada tahun 1960an. Ragdoll merupakan salah satu jenis kucing domestik yang sangat populer, memiliki postur dan build tubuh yang besar serta kakinya yang proporsional. Mereka memiliki bulu yang fluffy seperti kapas, menimbulkan kesan mereka kucing yang paling nyaman untuk dipeluk. Ragdoll merupakan salah satu kucingmemiliki temperamental yang paling santai, tidak banyak ‘menuntut’, dan toleran pada kebanyakan situasi, menjadikan mereka kucing yang dapat membaur dengan baik dengan anak kecil, terlebih sebagai kucing keluarga.",
            "Russian Blue adalah kucing domestik yang dikenal dengan penampilannya yang elegan, setia, dan sangat bersahabat. Nama lain dari Russian Blue adalah Archangel Cat atau Archangle Blue. Diketahui bahwa Russian Blue dibawa oleh pelaut dari Archangle Island pada tahun 1860an. Russian Blue sudah dikenal di berbagai registri sebagai kucing yang alamiah. Russian Blue memiliki ciri khas yaitu warnanya yang perak kebiruan, mirip dengan Nebelung, hanya saja dia memiliki bulu yang sangat pendek. Russian Blue merupakan hewan yang penasaran, tenang, namun sangat energetik dan atletis ketika mereka bermain. Mereka sangat senang melompat dan memanjat, dapat menyaingin keatletisan kucing Abyssian. Mereka kucing keluarga yang sangat menyenangkan karena mereka mampu terikat terhadap pemiliknya, dan juga cerdas sehingga bisa dilatih untuk melakukan banyak hal. Seperti Nebelung, mereka sangat suka berbicara apa yang ada dipikiran mereka. Karena cerdas dan ‘banyak bicara’, mereka malah kadang-kadang seakan meminta tuannya untuk diajak bermain dengan kode seperti membawa mainan ke tempat tuannya. Meski begitu, Russian Blue juga mampu berburu hewan-hewan kecil dan hama dengan baik karena kelincahannya.",
            "Sesuai namanya, Snowshoe memiliki warna tangan dan kaki yang berwarna putih setelah gradasi warna tubuhnya, seakan mereka sedang mengenakan sepatu atau kaus kaki. Snowshoe dikembangbiakkan pada tahun 160an, dengan persilangan antara kucing Siamese dengan kucing shorthair, salah satunya Oriental Shorthair, di Philadelphia. Saat ini, mereka tergolong jenis kucing yang langka meskipun sudah diakui oleh sebagian besar registri kucing. Snowshoe sangatlah mirip dengan nenek moyangnya, Siamese. Perbedaan mencolok adalah pada pola warnanya. Jika Siamese memiliki ujung-ujung kaki dan ekor yang berwarna hitam, pada Snowshoe ujung tangan dan kakinya berwarna putih. Perbedaan kecil yang dimiliki adalah tubuh Snowshoe cenderung lebih bulat daripada Siamese. Seperti Siamese juga, mereka memiliki temperamen yang sangat baik sebagai kucing peliharaan, dan sangatlah sosial. Mereka cenderung vokal dan tidak suka ditinggal sendiri dalam waktu lama. Selain itu, dikatakan juga bahwa Siamese tidak takut terhadap air.",
            "Kucing Angora dinamai dari salah satu kota di Turki bernama Ankara, yang sebelumnya bernama Angora juga. Mereka merupakan jenis kucing longhair pertama yang tiba di Eropa dan untuk berbabad lamanya sudah menjadi hiburan terhadap pengunjung di Turki. Ada teori yang mengatakan jika Viking yang membawa mereka dari Turki ribuan tahun lalu. Kucing ini sudah diakui sebagian besar asosiasi kucing di seluruh dunia. Angora memiliki bulu yang lumayan panjang, namun tidak setebal kucing loghair lainynas seperti kucing Persian. Angora memiliki tingkat atletisme yang sangat lincah. Mereka juga sangat cerdas, aktif, dan juga interaktif terhadap sekitarnya. Hingga umurnya tua, mereka masih aktif dan kadang suka bermain. Yah, kucing saya juga seperti itu di umurnya yang 2 digit. Sifatnya yang loyal dan tidak macam-macam, kucing ini direkomendasikan untuk diadopsi sebagai kucing keluarga."
    };

    private static int[] catsImages = {
            R.drawable.abyssinian,
            R.drawable.asian_malayan,
            R.drawable.bengal,
            R.drawable.british_shorthair,
            R.drawable.dragon_li,
            R.drawable.mojave,
            R.drawable.persian,
            R.drawable.raas,
            R.drawable.ragdoll,
            R.drawable.russian_blue,
            R.drawable.snowshoe,
            R.drawable.turkish_angora
    };

    static ArrayList<Cat> getListData() {
        ArrayList<Cat> list = new ArrayList<>();
        for (int position = 0; position < catNames.length; position++) {
            Cat cat = new Cat();
            cat.setName(catNames[position]);
            cat.setDetail(catDetails[position]);
            cat.setPhoto(catsImages[position]);
            list.add(cat);
        }
        return list;
    }
}
