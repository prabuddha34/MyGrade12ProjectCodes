import java.util.Scanner;
public class Question6
{
    public static void main(String args[])
    {
        String sen="",wd="",upper="";
        char ch=' ',last=' ';
        int i=0,len=0,vowelsFrequency=0,consonantsFrequency=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        sen = sc.nextLine();
        sen = sen.trim();
        len = sen.length();
        last = sen.charAt(len - 1);
        if(last != '.' && last != '?')
        {
            System.out.println("Invalid input.");

        }
        else
        {
            System.out.println("Word\tVowels\tConsonants");
            for(i = 0; i < len; i++)
            {
                ch = sen.charAt(i);
                if(ch == ' ' || ch == '.' || ch == '?')
                {
                    wd=Character.toUpperCase(wd.charAt(0))+wd.substring(1).toLowerCase();

                    System.out.println(wd+"\t"+vowelsFrequency+"\t"+consonantsFrequency);
                    wd = "";
                    vowelsFrequency=0;
                    consonantsFrequency=0;
                }

                else
                {
                    wd += ch;
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    {
                        vowelsFrequency++;
                    }
                    else
                    {
                        consonantsFrequency++;
                    }
                }
            }
        }
    }
}
