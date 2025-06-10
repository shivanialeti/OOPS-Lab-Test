public class Hello
{
    public static void main(String args[])
    {
        int n = 12;
        int result;
        /*if(n%2==0)
            result = 10;
        else
            result = 20;*/
        result = (n%2==0 ? 10 : 20);

        System.out.println(result);
    }
}



public class SwitchCaseDemo 
{

 public static void main(String[] args) {
 int weekday = 3;
 switch (weekday) {
 case 1:
 System.out.println("Sunday");
 break;
 case 2:
 System.out.println("Monday");
 break;
 case 3:
 System.out.println("Tuesday");
 break;
 case 4:
 System.out.println("Wednesday");
 break;
 case 5:
 System.out.println("Thursday");
 break;
 case 6:
 System.out.println("Friday");
 break;
 case 7:
 System.out.println("Saturday");
 break;

 default:
 System.out.println("Not in week!! ");
 break;
 }
 }
 }
 
 public class Hello
{
    public static void main(String args[])
    {
        int i = 1;
        while(i<=4){
            System.out.println("Hi " + i);
            int j = 1;
            while(j<4){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        

        System.out.println("Bye " + i );
    }
}



public class Hello
{
    public static void main(String args[])
    {
    
        for(int i=1;i<=4;i++){
            System.out.println("Day " + i);
            
            for(int j=1;j<7;j++){
                System.out.println(" " + (j+8)+" - "+(j+9));
            
            }
        
        }
        

    }
}
