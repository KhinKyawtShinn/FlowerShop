import java.util.ArrayList;
import java.util.*;
import java.lang.NumberFormatException;

public class mainflower{

    public void start(){
        ArrayList<IFlower> flowers = new ArrayList<>();
        
        IFlower flower1 = new Lavender();
        IFlower flower2 = new Tulip();
        IFlower flower3 = new Camellia();

        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3); 
        
        flowerDetails(flowers);

    }
    private void flowerDetails(ArrayList<IFlower> list){
        System.out.println("--- Welcome to MARY'S BLOSSOM FLOWER SHOP ----\nFlower List:\n1. Lavender\n2. Tulip\n3. Camellia\n4. Exit\n---------------------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your choice : ");
        int choice = keyboard.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("You chose "+ list.get(0).Name()+".\nColor : "+list.get(0).Color()+"\nFragrance : "+list.get(0).Fragrance()+"\nLanguage of flower : "+list.get(0).Language()+"\nIndoor? : "+list.get(0).isIndoor()+"\nPrice : "+list.get(0).Price());
                Calculateprice(list, 0);
                break;
            case 2:
                System.out.println("You chose "+ list.get(1).Name()+".\nColor : "+list.get(1).Color()+"\nFragrance : "+list.get(1).Fragrance()+"\nLanguage of flower : "+list.get(1).Language()+"\nIndoor? : "+list.get(1).isIndoor()+"\nPrice : "+list.get(1).Price());
                Calculateprice(list, 1);
                break;
            case 3:
                System.out.println("You chose "+ list.get(2).Name()+".\nColor : "+list.get(2).Color()+"\nFragrance : "+list.get(2).Fragrance()+"\nLanguage of flower : "+list.get(2).Language()+"\nIndoor? : "+list.get(2).isIndoor()+"\nPrice : "+list.get(2).Price());
                Calculateprice(list, 2);
                break;
            case 4:
                System.out.println("Bye Bye! ");
                return;

            default:
                System.out.println("Please select the available options");
        }
      

    }
    public void Calculateprice(ArrayList<IFlower> list, int index_){
        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("How many : ");
            int amount = keyboard.nextInt();
            double total = amount * list.get(index_).Price();
            System.out.println("The total is "+total+"$");
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Do you want to add on more : ");
    }
    public static void main(String[] args) {
        new mainflower().start();
}
}
