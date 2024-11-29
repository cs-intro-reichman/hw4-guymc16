public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
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

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
       
        boolean Ans = true;
        if (str1.length()==str2.length())
        {
            if (str1.equals(str2))
            {
                return true;
            }
            else return false;
        } else if (str1.length()<str2.length())
        {
            return false;
        } else
        for (int i=0; i<=str1.length()-str2.length(); i++)
        {
            Ans = true;
            for (int j=0; j<str2.length(); j++)
            {
                if (str1.charAt(i+j)!=str2.charAt(j))
                {
                    Ans = false; 
                    break;
                } 
            }
            if (Ans==true) return true;
        }
    
        return false;
    }

    
}
