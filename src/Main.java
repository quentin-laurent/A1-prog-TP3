public class Main
{
    public static void main(String[] args)
    {
        SafeScanner sc = new SafeScanner(System.in);
        System.out.println("Saisir un entier:");
        int a = sc.getInt();
        System.out.printf("Valeur valide saisie: %d\n", a);

        ASCIIArt.drawCat(1, 1);
        ASCIIArt.drawCat(3, 3);
        ASCIIArt.drawCat(10, 3);
        ASCIIArt.drawCat(3, 10);
    }
}
