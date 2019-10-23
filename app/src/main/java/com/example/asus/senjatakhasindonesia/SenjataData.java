package com.example.asus.senjatakhasindonesia;

import java.util.ArrayList;

public class SenjataData {
    private static String[] senjataNama = {
            "Rencong",
            "Piso Halasan",
            "Pedang Jenawi",
            "Karih",
            "Badik Tumbuk Lado",
            "Tombak Trisula",
            "Kujang",
            "Golok",
            "Clurit",
            "Dohong",
            "Mandau",
            "Keris Bali",
            "Panah dan Busur",
            "Pisau Belati"
    };

    private static String[] senjataDetail = {
            "Menurut catatan sejarah, Rencong merupakan senjata tradisional yang digunakan di Kesultanan Aceh sejak masa pemerintahan Sultan Ali Mughayat Syah yang merupakan Sultan Aceh yang pertama. Kedudukan Rencong di Kesultanan Aceh sangatlah penting, Rencong selalu diselipkan di pinggang Sultan Aceh, selain itu para Ulee Balang dan masyarakat biasa juga menggunakan Rencong. Rencong emas milik Sultan Aceh dapat kita jumpai di Museum Sejarah Aceh, dari bukti sejarah tersebut dapat disimpulkan bahwa Rencong memang sudah terlahir sejak masa Kesultanan Aceh namun pembuat pertamanya sampai saat ini belum diketahui.",
            "Piso Halasan adalah pedang yang berasal dari Tapanuli Utara Batak Sumatra Utara. Piso Halasan biasanya dimiliki seorang pemimpin batak yang sudah memiliki otoritas hingga di tingkat Bius. Piso Halasan adalah lambang kebesaran Orang Batak hasangapon bagi dirinya yang membawa manfaat bagi orang banyak. Menegakkan hukum yang adil dan memberi jalan kehidupan bagi warga. Mereka cerdas, namum mampu membatasi diri untuk tidak terjerumus kepada kepentingan pribadi. Pola pikirnya tajam (piso) mencari solusi dalam setiap permasalahan dan memperluas wawasan mencari peluang untuk kesejahteraan. Pisau adalah lambang kecerdasan, dan sarungnya adalah hukum yang melakukan solam pembatasan dari hal yang menjerumuskannya kepada perbuatan yang dapat merugikan masyarakat. Semua hasil pemikiran, tindakan pemimpin akan bermanfaat untuk orang banyak, kerukunan, kedamaian, kesejahteraan yang menjadi (halasan) kesenangan yang lebih berarti, kebahagiaan.",
            "Provinsi Riau memiliki senjata tradisional yang bernama Pedang Jenawi. Pemakai Pedang Jenawi pastilah orang yang memiliki kekuasaan, orang yang dihormati, memiliki kecerdasan, sehingga menjadi panutan, dan sebagainya. Pedang Jenawi memiliki ketajaman di tiga sisi, yakni bagian kanan, kiri, dan depan. Pedang ini adalah sebuah pedang panjang yang bilahnya terbuat dari baja. Bentuk bilahnya sendiri lurus dan meruncing di bagian ujungnya. Pedang Jenawi dulunya digunakan para panglima perang Kerajaan Sriwijaya sebagai sarana perlindungan diri dan alat menyerang lawan. Keberadaannya kini mulai langka, padahal semakin banyak kolektor senjata tradisional yang selama ini terus memburunya.",
            "Suku Minang di Sumatra Baratt memiliki senjata tradisional yang bernama Karih. Karih adalah sebuah senjata berbentuk seperti keris tapi tidak memiliki lekuk-lekukan seperti keris di Jawa. Dahulunya, Karih digunakan untuk perlindungan diri dari musuh atau binatang buas saat para pria tengah bekerja. Karih / Keris ini merupakan perlengkapan / aksesoris yang dipakai oleh kaum laki-laki dan diletakkan di sebelah depan, dan umumnya dipakai oleh para penghulu terutama dalam setiap acara resmi ada terutama dalam acara malewa gala atau pengukuhan gelar, selain itu juga biasa dipakai oleh para mempelai pria dalam acara majlis perkawinan yang masyarakat setempat menyebutnya baralek dan juga dipergunakan dalam pertunjukan silat.",
            "Badik Tumbuk Lado merupakan senjata tradisional yang berasal dari Kepulauan Riau. Badik sendiri merupakan sebutan untuk senjata tradisional yang dikenal di kalangan masyarakat bugis dan beberapa daerah di Sumatera. Sedangkan, Tumbuk Lada atau Tumbuk Lado (Riau) adalah senjata tradisional masyarakat Melayu dan masyarakat Semenanjung Melayu. Badik Tumbuk Lado adalah sejenis senjata tikam berukuran 27 sampai 29 cm dan lebarnya sekitar 3.5 sampai 4 cm. Senjata ini memiliki kesamaan dengan badik Bugis, hanya berbeda dalam bentuk dan motif sarung badiknya saja.",
            "Tombak Trisula merupakan senjata tradisional khas Sumatra Selatan, Palembang tepatnya. Senjata tradisional ini konon merupakan senjata pertama yang didaulat pusaka Sumatera Selatan dan kerap menjadi ikon budaya provinsi. Selain itu, merupakan peninggalan dari kejayaan Kerajaan Sriwijaya yang pernah berkuasa pada abad ke-7 hingga awal abad ke-13 M. Bentuknya ialah sebuah tombak dengan tiga mata tajam di bagian ujungnya. Panjang tombak ini setinggi orang dewasa, yaitu sekitar 180 cm dan dahulu senjata ini digunakan oleh prajurit kerajaan Sriwijaya sebagai senjata utama. Pada kedua sisinya  yaitu sisi ujung atas dan bawah tombak terdapat mata tombak.",
            "Kujang merupakan senjata tradisional dari Jawa Barat yang mana oleh masyarakat Sunda disakralkan dan dianggap magis. Kujang menurut masyarakat Jawa Barat berasal dari bahasa sunda kuno yaitu kata Kudi dan Hyang. Kudi yang berarti Senjata dengan kekuatan gaib sedangkan Hyang berarti dewa atau masyarakat sunda mengartikannya kedudukan yang di atas Dewa. Berarti Kujang adalah pusaka yang mememiliki kekuatan magis yang kekuatannya berasal dari para dewa. Ukurannya senjata kujang biasanya berkisar antara 20 sampai 25 cm dan digunakan sebagai perlengkapan peralatan pakaian laki-laki. Peneliti menyimpulkan bahwasanya dari bentuk kujang, kira-kira senjata ini diperkenalkan oleh nenek moyang Sunda yaitu sebelum abad 8 dan 9, namun ada juga pendapat bahwasanya kujang dibuat pada abad 8 dan 9.",
            "Golok merupakan senjata tradisional Betawi (DKI Jakarta) yang paling terkenal. Senjata tersebut sering dijadikan aksesoris keseharian busana adat Betawi oleh kaum pria. Golok terselip pada ikat pinggang hijau dan dipakai saat bekerja atau sedang bepergian sebagai alat menjaga diri. Golok khas Betawi memiliki satu bagian mata yang tajam. Sementara satu bagian lainnya tidak tajam. Ia juga dilengkapi dengan serangka yang dipakai pada saat golok tidak sedang digunakan.",
            "Clurit atau celurit merupakan senjata tradisional yang berasal dari daerah Madura, Jawa Timur. Clurit diyakini berasal dari legenda pak Sakera / Sakerah, seorang mandor tebu dari Pasuruan yang menjadi salah satu tokoh perlawanan terhadap penjajahan Belanda. Beliau dikenal tak pernah meninggalkan Celurit dan selalu membawa / mengenakannya dalam aktifitas sehari-hari, dimana saat itu digunakan sebagai alat pertanian / perkebunan. Beliau berasal dari kalangan santri dan seorang muslim yang taat menjalankan agama Islam. Pak Sakera melakukan perlawanan atas penindasan penjajah. Setelah pak Sakerah tertangkap dan dihukum gantung di Pasuruan, Jawa Timur, beliau dimakamkan di Kota Bangil. Atau tepatnya di wilayah Bekacak, Kelurahan Kolursari, daerah paling selatan Kota Bangil. Tindakan penjajah tersebut ternyata menimbulkan kemarahan orang-orang Madura, dan mulai berani melakukan perlawanan pada penjajah dengan senjata andalan meraka adalah Celurit. Sehingga Celurit mulai beralih fungsi menjadi simbol perlawanan, simbol harga diri serta strata sosial.",
            "Masyarakat Dayak Ngaju di Kalimantan Barat memiliki senjata tradisional yang bernama Dohong. Dohong adalah sebuah mata tombak yang dapat pula digunakan sebagai pisau. Panjangnya sekitar 8 inch dan dipercaya sebagai senjata tradisional Dayak yang paling tua. Jika digunakan sebagai pisau, dohong akan dilengkapi dengan gagang bulat dan sebuah serangka yang terbuat dari kayu. Dahulunya, Dohong digunakan sebagai senjata perang. Namun kini ia lebih sering dipakai sebagai alat pemotong tali pusar bayi yang baru lahir dan sebagai alat untuk menyembelih hewan korban. Dengan kegunaan tersebut, Dohong saat ini umumnya hanya dimiliki oleh Pisur atau Ketua adat Dayak.",
            "Mandau merupakan senjata tradisional suku dayak yang dipergunakan oleh Raja-Raja atau kepala suku saja di Provinsi Kalimantan Timur. Karena mandau diyakini merupakan senjata sakral yang sangat dijaga dan dirawat dengan baik oleh pemiliknya. Mandau adalah sejenis dengan parang, dengan panjang 50 cm. Pada dasarnya, jenis-jenis Mandau pada semua Masyarakat Dayak mempunyai bentuk yang sama. Tetapi ada sedikit perbedaan bila dilihat dari sisi kelengkungan bilahnya, yaitu ada bilah yang agak condong ke belakang. Ciri khas yang melekat pada senjata tradisional ini yaitu pada ukiran-ukiran pada bilahnya yang tidak terlalu tajam. Banyak juga ditemui mandau dengan ukiran tambahan lubang pada bilahnya dengan ditutupi dengan tembaga dengan tujuan memperindah bilah mandau.",
            "Masyarakat Provinsi Bali mengenal banyak sekali jenis senjata tradisional, di antaranya Keris, Tombak, Tiuk, Taji, Kandik, Caluk, Arit, Udud, Gelewang, Trisula, Panah, Penampad, Garot, Tulud, Kis-Kis, dan lain sebagainya. Namun di antara banyak senjata tersebut, yang paling unik dan indah adalah Keris Bali. Secara struktur, keris Bali memiliki kesamaan dengan keris pada umumnya. Hanya saja, pada senjata ini kita dapat menemukan beragam ukiran baik pada bilah, gagang, maupun pada sarung bilah atau carangkanya. Ukiran-ukiran tersebut bisa berupa bentuk dewa, raksasa, pedande (pendeta), penari, dan bentuk pertapa hutan. Bahkan, kita juga dapat menemukan keris Bali dengan tahta emas dan batu mulia.",
            "Dalam perang antar kampung yang hingga kini masih sering berlangsung antar penduduk Papua, kita bisa menemukan sebuah senjata khas yaitu Panah dan Busur. Anak panah terbuat dari bambu dengan mata tulang kangguru, sementara busurnya terbuat dari bilah bambu dengan tali rotan sebagai tali busurnya. Untuk meningkatkan efektifitas serangan, mata panah biasanya akan dioles dengan racun alami yang diambil dari getah pohon sembaru. Panah dan Busur adalah sepasang senjata utama yang selain digunakan untuk berperang, juga dapat dipakai sebagai senjata perburuan.",
            "Senjata tradisional Papua Barat adalah Pisau Belati. Tidak seperti pisau belati yang biasanya kita kenal, pisau Belati yang menjadi senjata tradisional Papua Barat ini terbilang sangat unik. Bila pada umumnya terbuat dari bilah logam, bilah Belati justru terbuat dari tulang kaki burung endemik Papua yaitu burung Kasuari. Tulang kaki burung ini dipilih karena mudah dibentuk dan ditajamkan tapi tetap memiliki struktur yang kuat. Pada gagang atau pegangan senjata tradisional Papua Barat ini biasanya juga dilengkapi dengan hiasan bulu burung Kasuari atau serat alam."
    };

    private static int[] senjataImages = {
            R.drawable.rencong,
            R.drawable.piso_halasan,
            R.drawable.pedang_jenawi,
            R.drawable.karih,
            R.drawable.badik_tumbuk_lado,
            R.drawable.tombak_trisula,
            R.drawable.kujang,
            R.drawable.golok,
            R.drawable.clurit,
            R.drawable.dohong,
            R.drawable.mandau,
            R.drawable.keris_bali,
            R.drawable.panah_busur,
            R.drawable.pisau_belati
    };

    static ArrayList<Senjata> getListData() {
        ArrayList<Senjata> list = new ArrayList<>();
        for (int position = 0; position < senjataNama.length; position++) {
            Senjata senjata = new Senjata();
            senjata.setNama(senjataNama[position]);
            senjata.setDetail(senjataDetail[position]);
            senjata.setPhoto(senjataImages[position]);
            list.add(senjata);
        }
        return list;
    }

}
