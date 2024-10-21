import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        WordChecker x = new WordChecker(words);
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        boolean wordChain = true;
        System.out.println(wordChain);

        WordChecker w = new WordChecker();
        ArrayList<String> secwords = new ArrayList<String>();
        secwords.add("to");
        secwords.add("too");
        secwords.add("stool");
        secwords.add("tools");
    }
    
}
