//Find the rent for working hour
//Input : working hour=1 then rent =$30
//if working hour >1 then  charge of $50 for an extra hour
import java.util.Scanner;
class rent{
	int hour;
    int rent;
	rent(int hour){
        this.hour=hour;
    }
    int calc(){
        if(hour==1)
             rent=30;
        if (hour>1)
            rent = 30-hour* 50;
        return rent;
    }
    void display(){
        System.out.println("The rent for work is:"+calc());
    }
}
class rentMain{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an hour:");
        int hour= sc.nextInt();
        rent r1= new rent(hour);
        r1.display();
   }
}