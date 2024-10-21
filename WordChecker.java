import java.util.ArrayList;
public class WordChecker {

    private ArrayList<String> wordList;

    public boolean isWordChain() 
    {
        for(int i = 1; i < wordList.size(); i++)
        {
            String after = wordList.get(i);
            String before = wordList.get(i-1);
            if(after.indexOf(before) < 0) return false;
        }
    }
    public ArrayList<String> createList(String target) 
    {

    }
    public WordChecker(ArrayList<String> list)
    {
        list = wordList;
    }
    public WordChecker()
    {
        wordList = new ArrayList<String>(); //overloading with another constructor
    }

    
   
}
