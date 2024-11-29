public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        boolean ans = false;
        for (int i=0; i<sentences.length; i++)
        {
            ans = false;
            for (int j=0;j<keywords.length; j++)
            {
             if (contains(sentences[i], keywords[j]))
             {
                ans = true;
                break;
             }

            }
            if (ans==true)
            {
                System.out.println(sentences[i]);
            }
        }
    }
    public static boolean contains(String str1, String str2) {
       
        boolean Ans = true;
        String low1 = lowerCase(str1);
        String low2 = lowerCase(str2);

        
        if (low1.length()==low2.length())
        {
            if (low1.equals(low2))
            {
                return true;
            }
            else return false;
        } else if (low1.length()<low2.length())
        {
            return false;
        } else
        for (int i=0; i<=low1.length()-low2.length(); i++)
        {
            Ans = true;
            for (int j=0; j<low2.length(); j++)
            {
                if (low1.charAt(i+j)!=low2.charAt(j))
                {
                    Ans = false; 
                    break;
                } 
            }
            if (Ans==true) return true;
        }
    
        return false;
    }

    public static String lowerCase(String str) {
       
        String str1 = str;
        for (int i=0; i<str1.length(); i++)
        {
            if (str1.charAt(i)>= 'A' && str1.charAt(i)<='Z')
            {
                str1 = str1.replace(str1.charAt(i), (char)(str1.charAt(i)+32));
            }
        }
        return str1;
    }
}
