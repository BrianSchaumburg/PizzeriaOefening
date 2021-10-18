import java.util.List;
import java.util.*;
public class Pizza {
    private String beschrijving;
    private ArrayList<String> ingrediënten = new ArrayList<>();
    private double prijs;
    private boolean vegetarisch;
public Pizza()
{

}
    public Pizza(String beschrijving ,double prijs, boolean vegetarisch)
    {   if(!beschrijving.trim().isBlank())
        this.beschrijving =beschrijving;
        else
            throw new NullPointerException("Check de beschrijving na");
        setPrijs(prijs);
        this.vegetarisch = vegetarisch;
    }
    private void setPrijs(double prijs)
    {
        if(prijs<2 || prijs >20)
        {
            throw new IllegalArgumentException("De prijs mag niet hoger zijn dan 20 euro of lager dan 2 euro");
        }
        this.prijs = prijs;
    }
    public void voegIngrediëntToe(String ingrediënt) {
        if (!ingrediënt.trim().isBlank()) {
            if (ingrediënten.size() < 3) {
                if (!ingrediënten.contains(ingrediënt))
                    ingrediënten.add(ingrediënt);
                else
                    throw new IllegalArgumentException("Het ingrediënt zit al in de lijst");
            } else
                throw new IllegalArgumentException("Het formaat van de lijst is al 3");
        }
        else
            throw new NullPointerException("Het ingrediënt is leeg");

    }

}
