import java.util.Scanner;
import java.lang.NumberFormatException;

public class mainflower{

    public void start(){
        IFlower[] flowers = new IFlower[3];
        flowers[0] = new Lavender();
        flowers[1] = new Tulip();
        flowers[2] = new Camellia();

        flowerDetails(flowers);

    }
    private void flowerDetails(IFlower[] list){
        System.out.println("--- Welcome to MARY'S BLOSSOM FLOWER SHOP ----\nFlower List:\n1. Lavender\n2. Tulip\n3. Camellia\n4. Exit\n---------------------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your choice : ");
        int choice = keyboard.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("You choose "+ list[0].Name()+".\nColor : "+list[0].Color()+"\nFragrance : "+list[0].Fragrance()+"\nLanguage of flower : "+list[0].Language()+"\nIndoor? : "+list[0].isIndoor()+"\nPrice : "+list[0].Price());
                Calculateprice(list, 0);
                break;
            case 2:
                System.out.println("You choose "+ list[1].Name()+".\nColor : "+list[1].Color()+"\nFragrance : "+list[1].Fragrance()+"\nLanguage of flower : "+list[1].Language()+"\nIndoor? : "+list[1].isIndoor()+"\nPrice : "+list[1].Price());
                Calculateprice(list, 1);
                break;
            case 3:
                System.out.println("You choose "+ list[2].Name()+".\nColor : "+list[2].Color()+"\nFragrance : "+list[2].Fragrance()+"\nLanguage of flower : "+list[2].Language()+"\nIndoor? : "+list[2].isIndoor()+"\nPrice : "+list[2].Price());
                Calculateprice(list, 2);
                break;
            case 4:
                System.out.println("Bye Bye! ");
                return;

            default:
                System.out.println("Please select the available options");
        }
      

    }
    public void Calculateprice(IFlower[] list, int index_){
        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("How many : ");
            int amount = keyboard.nextInt();
            double total = amount * list[index_].Price();
            System.out.println("The total is "+total+"$");
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Do you want to add on more : ")
    }
    public static void main(String[] args) {
        new mainflower().start();
}
}
