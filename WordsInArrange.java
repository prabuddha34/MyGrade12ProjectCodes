import java.util.*;
public class WordsInArrange
{
   void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The String !");
    String str=sc.nextLine().toUpperCase();
    StringTokenizer st=new StringTokenizer(str);
    int count_words=st.countTokens();
    String arr[]=new String[count_words];
    /**
     * Fill The Array !
     */
    String temp=" ";
    for(int i=0;i<arr.length;i++){
    arr[i]=st.nextToken();
    }
    for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-1-i;j++){
    if(arr[j].compareTo(arr[j+1])>0){
    temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
    }
    }
    }
    /*
     * Counting !
     */
     System.out.println("Words \t\t Count");
        int count = 1;
        for (int i = 0; i < count_words; i++) {
            if (arr[i].equals(arr[i+1])) {
                count++;
            } else {
                System.out.println(arr[i] + " \t\t " + count);
                count = 1;
            }
        }
    }
}