import java.util.ArrayList;
import java.util.*;
import java.io.*;
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
    private void flowerDetails(ArrayList<IFlower> list) {
        String fileName = "FlowerShop/ListOfFlowers.txt";
        File flowerFile = new File(fileName);
    
        try (BufferedReader bR = new BufferedReader(new FileReader(flowerFile))) {
            String line;
            while ((line = bR.readLine()) != null) {
                System.out.println(line);
            }
    
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter your choice : ");
            int choice = keyboard.nextInt();
            double total = 0.0;
    
            switch (choice) {
                case 1:
                    System.out.println("You chose " + list.get(0).Name() + ".\nColor: " + list.get(0).Color() + "\nFragrance: " + list.get(0).Fragrance() + "\nLanguage of flower: " + list.get(0).Language() + "\nIndoor? : " + list.get(0).isIndoor() + "\nPrice: " + list.get(0).Price());
                    total = Calculateprice(list, 0);
                    break;
                case 2:
                    System.out.println("You chose " + list.get(1).Name() + ".\nColor: " + list.get(1).Color() + "\nFragrance: " + list.get(1).Fragrance() + "\nLanguage of flower: " + list.get(1).Language() + "\nIndoor? : " + list.get(1).isIndoor() + "\nPrice: " + list.get(1).Price());
                    total += Calculateprice(list, 1);
                    break;
                case 3:
                    System.out.println("You chose " + list.get(2).Name() + ".\nColor: " + list.get(2).Color() + "\nFragrance: " + list.get(2).Fragrance() + "\nLanguage of flower: " + list.get(2).Language() + "\nIndoor? : " + list.get(2).isIndoor() + "\nPrice: " + list.get(2).Price());
                    total += Calculateprice(list, 2);
                    break;
                case 4:
                    System.out.println("Bye Bye! ");
                    return;
                default:
                    System.out.println("Please select the available options");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public double Calculateprice(ArrayList<IFlower> list, int index_){
        double total = 0.0;
        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("How many : ");
            double amount = keyboard.nextInt();
            total = amount * list.get(index_).Price();
            System.out.println("The total is "+total+"$");

        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.print("Do you want to add on more [y/n]: ");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.next();
        if(choice.equals("y")){
            flowerDetails(list);
        }
        else{
            System.out.println("Thank You for visiting !\nSee you again");
        }
        return total;
    }
    public static void main(String[] args) {
        new mainflower().start();
}
}
