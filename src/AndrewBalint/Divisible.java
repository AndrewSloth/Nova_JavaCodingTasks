package AndrewBalint;

public class Divisible {
    public static void main(String[] args) {

        String DB15 = "Divisible by 15: ";
        String DB5 = "Divisible by 5: ";
        String DB3 = "Divisible by 3: ";

        for(int i =1; i<=100;i++){

            if(i%3==0){
                if(i%5==0){
                    DB15+=i+" ";
                }
                else{
                    DB3+=i+" ";
                }

            }
            else if(i%5==0){
                DB5+=i+" ";
            }

        }

        System.out.println(DB15.trim());
        System.out.println(DB5.trim());
        System.out.println(DB3.trim());
    }
}
