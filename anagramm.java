public class anagramm {
static boolean  isAnagram(String s1,String s2)
{
int freq[]=new int[26];
for(int i=0;i<s1.length();i++)
{
freq[s1.charAt(i)-'a']++;
freq[s2.charAt(i)-'a']--;
}
for(int i=0;i<26;i++)
{
if(freq[i]!=0)
return false;
}
return true;
}
public static void main(String[] args) {
        String s1 = "akshat";
        String s2 = "kshata";
        if (isAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}