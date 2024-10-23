import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        WordChecker w = new WordChecker(); //makes an empty list where wordlist is the variable
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);

        WordChecker x = new WordChecker(words); //stores the words into a wordlist/array that can be used
        System.out.println(x.isWordChain()); //prints out the boolean
        
        WordChecker y = new WordChecker();
        ArrayList<String> secwords = new ArrayList<String>();
        secwords.add("to");
        secwords.add("too");
        secwords.add("stool");
        secwords.add("tools");
        System.out.println(secwords);

        WordChecker z = new WordChecker(secwords);
        System.out.println(z.isWordChain());


    }
    
}
