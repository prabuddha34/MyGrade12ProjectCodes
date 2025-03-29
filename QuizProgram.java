import java.util.Scanner;
class QuizProgram{
void main(){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF THE PARTICIPANTS !");
int n=sc.nextInt();
if(n<3 || n> 11){
System.out.println("INVALID INPUT");
return;
}
char arr[][]=new char [n][5];
char key[]=new char[5];
System.out.println("Enter The Key Answers ");
for(int i=0;i<5;i++){
key[i]=sc.next().charAt(0);
}
System.out.println("Enter The Answers For the Participants !");
for(int i=0;i<n;i++){
    System.out.println("Participants"+" "+(i+1));
    for(int j=0;j<5;j++){
    arr[i][j]=sc.next().charAt(0);
    }
}
int score = 0;
int hscore = 0;
int ind=1;
System.out.println("SCORES OF THE PARTICIPANTS");
for (int i = 0; i < n; i++) {
            score = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == key[j]) {
                    score++;
                }
            }
            System.out.println("PARTICIPANT " + (i + 1) + ": " + score);
            if (score > hscore) {
                hscore = score;
                ind=i+1;
            }
        }
        System.out.println("Highest Scorer: Participant " +ind);
}
}