import java.util.Scanner;
class Question14{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = in.nextLine();
        if(s.length() < 4 || s.length() > 99){
            System.out.println("INVALID LENGTH");
            return;
        }
        String c = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'M') || (ch >= 'a' && ch <= 'm'))
                c += (char)(ch + 13);
            else if((ch >= 'N' && ch <= 'Z') || (ch >= 'n' && ch <= 'z'))
                c += (char)(ch - 13);
            else
                c += ch;
        }
        System.out.println("The cipher text is:");
        System.out.println(c);
    }
}