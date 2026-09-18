import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// creates a new scanner object to take in user input
        int i = 0;
        CollegeConnector user = new CollegeConnector();
// creates a new CollegeConnector object to store user input
        System.out.println();
        System.out.println("Are you going to college?: ");
        user.setCollege(input.nextLine());
        System.out.println();
// checks if the user is going to college, if not, asks if they are sure and if they want their kids to look at the menu prices
        if (user.getCollege().equals("no") || user.getCollege().equals("No")) {
            System.out.println("are you sure?");
            user.setCertainty(input.nextLine());
            System.out.println();
// checks if the user is sure they are not going to college, if not, asks if they want their kids to look at the menu prices
            if (user.getCertainty().equals("yes") || user.getCertainty().equals("Yes")) {
                System.out.println("Do you want your kids to look at the menu prices??");
                user.setMenu(input.nextLine());
                System.out.println();
                if (user.getMenu().equals("yes") || user.getMenu().equals("Yes")) {
                    System.out.println("ok, bye");
                    System.exit(0);
// if the user is sure they are not going to college and they don't want their kids to look at the menu prices, the program will exit
                } else {
                    i += 1;
                    System.out.println("ok, let's continue");
                    while (i < 3) {
                        System.out.println("Are you going to college?: ");
                        user.setCollege(input.nextLine());
                        System.out.println();
                        i += 1;
                    }
                    if (i == 3) {
                        System.out.println("ok, bye");
                        System.exit(0);
                    }
                }
            }
// if the user is not sure they are not going to college, the program will continue
        } else {
            System.out.println("ok, let's continue");
        }
// asks the user how long they are planning to go to college and stores the input in the CollegeConnector object
        System.out.println("How long are you planning to go to College in years?:");
        user.setLength(input.nextInt());
        System.out.println();
// checks if the user is planning to go to college for more than 3 years, if so, asks if they are interested in Med or Law school and stores the input in the CollegeConnector object
        if (user.getLength() > 3) {
            System.out.println("Specify if you are interested in Med or Law school?: ");
            user.setGraduate(input.next());
            System.out.println();
            if (user.getGraduate().equals("Med") || user.getGraduate().equals("med")) {
                user.setGraduate("BSMD ");;
            } 
            if (user.getGraduate().equals("Law") || user.getGraduate().equals("law")) {
                user.setGraduate("BAJD ");}

            if (user.getGraduate().equals("no") || user.getGraduate().equals("No")) {
                user.setGraduate("University ");
            }
            }
        else {
            user.setGraduate("College");
        }
// asks the user how much they are willing to spend on college and stores the input in the CollegeConnector object 
        System.out.println("How much would you be willing to spend on college?: ");
        user.setCost(input.nextInt());
        System.out.println();
        if (user.getCost() > 20000) {
            System.out.println("Do you want to go to a Public or Private college?: ");
            user.setPublic(input.next());
            System.out.println();}
        else {
                user.setPublic("Public");
                System.out.println();
            }
        
 // asks the user what model aligns best with their interests and stores the input in the CollegeConnector object 
        System.out.println("what model aligns best with your interests?: Research, Technical, Military");
        user.setModel(input.next());
        System.out.println();
        if (user.getModel().equals("Technical") || user.getModel().equals("technical") || user.getModel().equals("Vocational") || user.getModel().equals("vocational")) {
            user.setModel("Technical/Vocational");
        }
        if (user.getModel().equals("Research") || user.getModel().equals("research")) {
            user.setModel("Research");
        }
        if (user.getModel().equals("Liberal Arts") || user.getModel().equals("liberal arts")) {
            user.setModel("Liberal Arts");
        }
        
        if (user.getModel().equals("Military") || user.getModel().equals("military")) {
            user.setModel("Military");
        }
// asks the user how many students they would like to be around and stores the input in the CollegeConnector object
        System.out.println("How many students would you like to be around?:");
        user.setEnvironment(input.nextInt());
        System.out.println();
        if (user.getEnvironment() < 5000) {
            user.setEnvironmentSize("Rural");
        }
        else if (user.getEnvironment() < 10000) {
            user.setEnvironmentSize("Suburban ");
        }
        else if (user.getEnvironment() < 15000) {
            user.setEnvironmentSize("Urban");
        }
// asks the user if they would like to study abroad and stores the input in the CollegeConnector object
        System.out.println("Would you like to study Abroad?:");
        user.setLocation(input.next());
        System.out.println();
        if (user.getLocation().equals("yes") || user.getLocation().equals("Yes")) {
            user.setLocation("Foreign ");
        }
        else {
            user.setLocation("Domestic ");
        }

// asks the user if they would like to have a meal plan and stores the input in the CollegeConnector object              
        input.close();
        System.out.println(user.toString());
    }
     
}