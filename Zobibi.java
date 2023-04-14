
import java.util.*;

public class Zobibi {

  public static void main(String[] args) {

    // TODO Auto-generated method stub

    String Zobibi;

    String Region1;
    String Region2;
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the game type :");

    Zobibi = Sc.nextLine();
    System.out.print("Region 1:");
    Region1 = Sc.nextLine();
    System.out.print("Region 2:");
    Region2 = Sc.nextLine();

    String[] Savanes = new String[] { "Dapaong", "Bagaré (Togo)", "Barkoisi", "Bergou", "Biankouri", "Bombouaka",
        "Cinkasse", "Galengachi", "Gando (TOGO)", "Goundoga", "Jami (Togo)", "Kandjouare", "Katindi", "Kombongu",
        "Korbongou", "Koutiatialbo",
        "Loko (Togo)", "Lokpano", "Mandouri", "Mango (Togo)", "Nadjoundi", "Nagou (Togo)", "Nakitindi", "Nammjoni",
        "Namoudjogo", "Nano (Togo)", "Ouarkambou", "Pana (Togo)", "Pelelé", "Pogno (Togo)", "Sassané-Mango", "Takpamba",
        "Tamatougou", "Tami (Togo)", "Tampialeme", "Tandjouaré", "Tchanaga", "Timbou", "Vavou", "Wokambo" };

    String[] Kara = new String[] {
        "Adumdé", "Afoou", "Anandé", "Apoeydoumpo", "Atalote", "Atontebou", "Bafilo", "Bako (Togo)", "Bandjéli",
        "Banjena", "Bassar", "Baya (Togo)", "Belemele",
        "Binaparba", "Bissibi", "Bohou", "Bokourobe", "Borbogou", "Borokpindo", "Bouele",
        "Boufale", "Bougab", "Boukoukpanbe", "Boukpassiba", "Boulou (Togo)", "Boundiale", "Boussie",
        "Dolardo", "Chodouko", "Daboute", "Dako", "Demon (Togo)", "Demon (Togo)", "Diangouyadou", "Dibeti", "Kemerida",
        "Dissani", "Dondonne", "Farende", "Fono (Togo)", "Fougo", "Gangan (Togo)", "Garimbomb",
        "Garka", "Gassema", "Gbangbale", "Guérin-Kouka", "Inare", "Jimbiri", "Kada (Togo)", "Kadogou", "Kakpale",
        "Kali (Togo)", "Kalia (Togo)", "Kandé", "Kétao", "Kiniakara", "Kiteou", "Konadiou", "Kotateou", "Kouboabo",
        "Koudaboubou", "Koulifiagou", "Koumerida", "Kouni (Togo)", "Koussatieou", "Koussatine", "Koutaou",
        "Koutougou (Togo)", "Kpagouda", "Kpassidè", "Kpezinde", "Kuta (Togo)", "Labo (Togo)", "Lajoudoun",
        "Lama-Kara", "Landa (Togo)", "Langonde", "Lanke", "Nadoba", "Nabib ", "Meda (Togo) ", "Massipou (Togo) ",
        "Makalea ", "Maboualabi ", "Mabo (Togo) ", "Lolu ", "Loande ", "Lie (Togo) ", "Lidyobilbou ", "Lele (Togo) ",
        "Lekpande ", "Lassa (Togo)", "Laou", "Nahile", "Namon", "Nandouta", "Nanioumboul", "Nassibiki", "Natako",
        "Natchamba", " Naware", "Niamtougou ", "Niankale", "Niempenou", " Nimbeolo", "Nouhoulme", "Onbatedempo",
        "Oukredo", "Oussalne", "Ouyombo", "Pabouale", "Padioule", "Pagouda", "Patalabo", "Patieli", "Pesside Koundoum",
        "Pirinio", "Pokpon", "Samba (Togo)", "Sanpa", "Sanpale", "Sansale", "Saponé (Togo)", "Sara-Kawa",
        "Ségou (Togo)", "Sirka (Togo)", "Sola (Togo)", "Soumdina", "Tabara (Togo)", "Taouleba", "Tcharé",
        "Tchirkpambo", "Tchitchao", "Tema (Togo)", "Wagam", "Wango (Togo)", "Wapambouni", "Yabido", "Yadé (Togo)",
        "Gassema", "Yapoutando" };

    String[] Centrale = new String[] { "Sokodé", "Tchamba", "Agbadi (Togo)", "Blitta", "Djarkpanga", "Kambolé",
        "Kparatao", "Sotouboua" };

    String[] Plateaux = new String[] { "Agou-Gadjepe", "Amlamé", "Amou Oblo", "Amoussoukope", "Ana (Togo)", "Anié",
        "Atakpamé", "Badou (Togo)",
        "Danyi-Apéyémé", "Elavagnon", "Issati", "Kamina (localité du Togo)", "Morita (Togo)", "Notsé",
        "Tode", "Tohoun", "Kpalimé " };

    String[] Maritime = new String[] { "Afagnan", "Agbalépédogan", "Agbodrafo", "Akodésséwa", "Aného", "Anfané",
        "Badougbe", "Baguida",
        "Gapé-Kpodji", "Kagnikopé", "Kélékougan", "Kévé", "Kovié", "Lomé", "Mission-Tové", "Tabligbo",
        "Tchékpo-Dédékpoè",
        "Totsigan", "Totsivi", "Tsévié", "Vogan", "Wonougba" };

    Random rand = new Random();

    switch (Region1) {
      case "Savanes":

        System.out.println(" Generating playoff city 1 : " + Savanes[rand.nextInt(Savanes.length)]);
        break;

      case "Kara":
        System.out.println(" Generating playoff city 1 : " + Kara[rand.nextInt(Kara.length)]);
        break;

      case "Centrale":
        System.out.println(" Generating playoff city 1 : " + Centrale[rand.nextInt(Centrale.length)]);
        break;

      case "Plateaux":
        System.out.println(" Generating playoff city 1 : " + Plateaux[rand.nextInt(Plateaux.length)]);
        break;

      case "Maritime":
        System.out.println(" Generating playoff city 1 : " + Maritime[rand.nextInt(Maritime.length)]);
        break;

    }
    switch (Region2) {
      case "Savanes":

        System.out.println(" Generating playoff city 2 : " + Savanes[rand.nextInt(Savanes.length)]);
        break;

      case "Kara":
        System.out.println(" Generating playoff city 2 : " + Kara[rand.nextInt(Kara.length)]);
        break;

      case "Centrale":
        System.out.println(" Generating playoff city 2 : " + Centrale[rand.nextInt(Centrale.length)]);
        break;

      case "Plateaux":
        System.out.println(" Generating playoff city 2 : " + Plateaux[rand.nextInt(Plateaux.length)]);
        break;

      case "Maritime":
        System.out.println(" Generating playoff city 2 : " + Maritime[rand.nextInt(Maritime.length)]);
        break;
    }

  }
}