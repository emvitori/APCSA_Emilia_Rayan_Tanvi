import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        CollegeConnector user = new CollegeConnector();

        System.out.println();
        System.out.println("Are you going to college?: ");
        user.setCollege(input.nextLine());
        System.out.println();

        if (user.getCollege().equals("no") || user.getCollege().equals("No")) {
            System.out.println("are you sure?");
            user.setCertainty(input.nextLine());
            System.out.println();

            if (user.getCertainty().equals("yes") || user.getCertainty().equals("Yes")) {
                System.out.println("Do you want your kids to look at the menu prices??");
                user.setMenu(input.nextLine());
                System.out.println();
                if (user.getMenu().equals("yes") || user.getMenu().equals("Yes")) {
                    System.out.println("ok, bye");
                    System.exit(0);

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
        } else {
            System.out.println("ok, let's continue");
        }

    


        System.out.println("How long are you planning to go to College in years?:");
        user.setLength(input.nextInt());
        System.out.println();
        if (user.getLength() > 3) {
            System.out.println("Specify if you are interested in Med or Law school?: ");
            user.setGraduate(input.next());
            System.out.println();
            if (user.getGraduate().equals("Med") || user.getGraduate().equals("med")) {
                user.setGraduate("BSMD");;
            } 
            if (user.getGraduate().equals("Law") || user.getGraduate().equals("law")) {
                user.setGraduate("BAJD");}

            if (user.getGraduate().equals("no") || user.getGraduate().equals("No")) {
                user.setGraduate("University");
            }
            }
        else {
            user.setGraduate("College");
        }
        

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
        
        
        System.out.println("what model aligns best with your interests?: Research, Liberal Arts, Technical/Vocational, Military");
        user.setModel(input.next());
        System.out.println();
        if (user.getModel().equals("Technical") || user.getModel().equals("technical") || user.getModel().equals("Vocational") || user.getModel().equals("vocational")) {
            user.setModel("Technical/Vocational");
        }

        System.out.println("How many students would you like to be around?:");
        user.setEnvironment(input.nextInt());
        System.out.println();
        if (user.getEnvironment() < 5000) {
            user.setEnvironmentSize("Rural");
        }
        else if (user.getEnvironment() < 10000) {
            user.setEnvironmentSize("Suburban");
        }
        else if (user.getEnvironment() < 15000) {
            user.setEnvironmentSize("Urban");
        }

        System.out.println("Would you like to study Abroad?: ");
        user.setLocation(input.next());
        System.out.println();
        if (user.getLocation().equals("yes") || user.getLocation().equals("Yes")) {
            user.setLocation("Abroad");
        }
        else {
            user.setLocation("Domestic");
        }

        
        input.close();
    }
}