import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner
{
    // Attributes
    private Scanner sc;

    // Constructor
    public SafeScanner(InputStream s)
    {
        this.sc = new Scanner(s);
    }

    public int getInt()
    {
        int val = 0;
        boolean loop = true;

        do {
            try {
                val = this.sc.nextInt();
                loop = false;
            }
            catch (InputMismatchException e) {
                System.out.println("/!\\ Input invalide (pas un entier)");
                sc.nextLine();
            }
        } while(loop);

        return val;
    }

    public void close()
    {
        this.sc.close();
    }
}
