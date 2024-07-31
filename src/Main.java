import java.util.Scanner;
/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik  |  Geçme Notu : 55 */
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int g_mat, g_phy, g_turkish, g_che, g_music;


        System.out.print("Math grade: ");
        g_mat = inp.nextInt();
        System.out.print("Physic grade: ");
        g_phy = inp.nextInt();
        System.out.print("Turkish Language grade: ");
        g_turkish = inp.nextInt();
        System.out.print("Chemistry grade: ");
        g_che = inp.nextInt();
        System.out.print("Music grade: ");
        g_music = inp.nextInt();

        double avarage = (g_mat + g_phy + g_turkish + g_che + g_music) / 5;

        if (avarage < 55)
            System.out.println("You couldn't pass the class.");
        else
            System.out.println("You pass the class, congrat!");
        System.out.println("Your avarage grade is "+avarage);

    }
}