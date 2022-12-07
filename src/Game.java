import java.util.Scanner;

public class Game {
    public String userName;
    public boolean life = true;
    public int age;
    private String name;
    private String gender;

    private int intelligence;
    private int strength;
    private int stamina;

    private double money = 0.0;

    private boolean doublemoney = false;

    public Game() {

    }

    Scanner scan = new Scanner(System.in);

    public void Beginning() {
        int birth = (int) ((Math.random() * 10) + 1);
        if (birth == 1) {
            System.out.println("Your mother had a miscarriage and you were never born.");
            System.out.println("The end!");
            age = -1;
        } else {
            int borngender = (int) ((Math.random() * 2) + 1);
            if (borngender == 1) {
                System.out.println("You are a boy! What is your name?");
                name = scan.nextLine();
                gender = "boy";
            } else {
                System.out.println("You are a girl! What is your name?");
                name = scan.nextLine();
                gender = "girl";

            }
            System.out.println("Hello, " + name + ", to the world!");
            System.out.println("Get ready for a new life full of experiences!");

        }

    }

    public void BeginningRecap() {
        String recap = new String("");
        recap += "As a toddler, you did not do much.";
        recap += " It's because toddlers don't.. really do much.";
        recap += " You have explored ";
        recap += "";
        recap += 5;
        recap += " times.";
        System.out.println(recap);
    }

    public void Childhood() {

        life = true;
        String s = new String("What would you like to do now?");
        if (age != -1) {
            System.out.println("Welcome to the world, " + name + "! What would you like to do first?");
            System.out.println("1. Explore \n2. Profile");
            int age = 0;
            while (age < 5 && age >= 0) {

                String action = scan.nextLine();
                if (action.equals("profile") || action.equals("2")) {
                    System.out.println("-----------------\nUsername: " + userName + "\nCharacter Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nAlive?: " + life + "\n-----------------");
                    System.out.println(s);
                    System.out.println("1. Explore \n2. Profile");
                } else if (action.equals("explore") || action.equals("1")) {
                    int childhoodaction = (int) ((Math.random() * 4) + 1);
                    if (childhoodaction == 1) {
                        System.out.println("You crawl around your house and you are picked up by your parents. You do not find anything.");
                        age++;
                        System.out.println("You are now " + age + " years old.");
                        System.out.println(s);
                        System.out.println("1. Explore \n2. Profile");
                    } else if (childhoodaction == 2) {
                        System.out.println("You find a shiny, pointy object. What do you do with it?");
                        System.out.println("1. Put it down.\n2. Play with it.");
                        int childhoodchoice = scan.nextInt();
                        if (childhoodchoice == 1) {
                            System.out.println("You put the object down and nothing happens. You fall asleep in the middle of the floor.");
                            age++;
                            System.out.println("You are now " + age + " years old.");
                            System.out.println(s);
                            System.out.println("1. Explore \n2. Profile");
                        } else {
                            System.out.println("You stick the object into a hole in the wall. You get zapped and die.");
                            age = -1;
                            life = false;
                            System.out.println("You died! The end. Better luck next time.");
                        }


                    } else if (childhoodaction == 3) {
                        int toddlerfood = (int) ((Math.random() * 2) + 1);
                        if (toddlerfood == 1) {
                            System.out.println("After crawling around, you find a spongy, squishy object.");
                            System.out.println("1. Eat it.\n2. Do nothing with it.");
                            int childhoodchoice = scan.nextInt();
                            if (childhoodchoice == 1) {
                                System.out.println("You eat the object. It has been on the floor for 3 months, and you die of bacteria.");
                                age = -1;
                                life = false;
                                System.out.println("You died! The end. Better luck next time.");
                            } else {
                                System.out.println("You show the spongy object to your parents. They throw it away. It was bad food.");
                                age++;

                                System.out.println("You are now " + age + " years old.");
                                System.out.println(s);
                                System.out.println("1. Explore \n2. Profile");
                            }

                        }

                    } else if (childhoodaction == 4) {
                        System.out.println("You find your toy blocks and play with them. Nothing else.");
                        age++;
                        System.out.println("You are now " + age + " years old.");
                        System.out.println(s);
                        System.out.println("1. Explore \n2. Profile");
                    }

                }
            }
        }
    }


    public void School() {
        int inte = 0;
        int str = 0;
        int stam = 0;
        int privateschool = 0;
        int homeschool = 0;
        int publicschool = 0;
        if (age == 5) {
            life = true;
        }
        if (life = true) {
            System.out.println("---------------------------------------------------");
            System.out.println("Now that you are 5, you are eligible to go to school.");
            System.out.println("Let's see what your parents decide to do..");
            int schooldecision = (int) ((Math.random() * 10) + 1);
            if (schooldecision == 1) {
                System.out.println("Your parents decide that you will be homeschooled.");
                System.out.println("TO BE ADDED");
                homeschool = 1;
            } else if (schooldecision == 2) {
                System.out.println("Your parents decide that you will go to private school");
                privateschool = 1;
                publicschool = 0;
            } else {
                System.out.println("Your parents decide that you will go to public school.");
                publicschool = 1;
                privateschool = 0;
            }
            age = 5;
            while (age <= 18) {

                if (homeschool == 0) {
                    System.out.println("What would you like to do at school?");
                    String schoolchoices = new String("1.Study/Learn \n2.Go to gym\n3.Run outside\n4.Stare out the window\n5.Profile");
                    System.out.println(schoolchoices);
                    String schoolaction = scan.nextLine();
                    if (schoolaction.equalsIgnoreCase("5") || schoolaction.equalsIgnoreCase("Profile")) {
                        System.out.println("-----------------\nUsername: " + userName + "\nCharacter Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nStatus: " + life + "\nintelligence: " + inte +
                                "\nstr: " + str + "\nsta: " + stam + "\n-----------------");
                    }
                    if (schoolaction.equalsIgnoreCase("Study") || schoolaction.equalsIgnoreCase("1") || schoolaction.equalsIgnoreCase("Learn)")) {
                        System.out.println("You study.");
                        if (privateschool == 1) {
                            System.out.println("+2 int!");
                            inte += 2;
                            age++;
                            System.out.println("You are now " + age + "years old.");
                            intelligence = inte;

                        } else {
                            inte++;
                            age++;
                            System.out.println("You are now " + age + "years old.");
                            intelligence = inte;
                        }


                    }
                    if (schoolaction.equalsIgnoreCase("Go to gym") || schoolaction.equalsIgnoreCase("2")) {
                        System.out.println("You participate in today's sport in gym.");
                        if (privateschool == 1) {
                            System.out.println("+2 str!");
                            str += 2;
                            age++;
                            System.out.println("You are now " + age + "years old.");
                            strength = str;

                        } else {
                            System.out.println("+1 str!");
                            str++;
                            age++;
                            System.out.println("You are now " + age + "years old.");
                            strength = str;
                        }
                    }
                    if (schoolaction.equalsIgnoreCase("Run outside") || schoolaction.equalsIgnoreCase("3")) {
                        System.out.println("You run around the track.");
                        if (privateschool == 1) {
                            System.out.println("+2 stam!");
                            stam += 2;
                            age++;
                            System.out.println("You are now " + age + "years old.");
                            stamina = stam;

                        } else {
                            System.out.println("+1 stam");
                            stam++;
                            age++;
                            System.out.println("You are now " + age + "years old.");
                            stamina = stam;
                        }
                    }
                }
            }
        }

    }

    public void Adulthood() {
        System.out.println("Now that you are an adult, you may pick a job. This job decides many things about your future, like your salary, your % of dying on the job, etc. Your choices are finalized. (Because I am too lazy");
        System.out.println("Your choices are: (1) Construction Worker, (2) Police Officer, (3) Doctor");
        System.out.println("Fairly simple because I want to go to bed. Pick the number next to the job you desire. Depending on your performance in school, you may or may not get your job.");
        int userchoice = scan.nextInt();
        if(userchoice == 1){
            System.out.println("Anybody can get hired here.");
            while(age < 100 && life) {
                System.out.println("The usual, what will it be?\n1.Work\n2.Go to the store\n3.Skip");
                int userchoice2 = scan.nextInt();
                if (userchoice2 == 1) {
                    int doyoudie = (int) ((Math.random() * 100)+1);
                    if(doyoudie<=5){
                        System.out.println("you die on the job");
                        System.out.println("game over");
                        life = false;
                    }else {
                        if (doublemoney) {
                            money += 15 * 2;
                        } else {
                            money += 15;
                        }
                    }
                } else if (userchoice2 == 2) {
                    System.out.println("Welcome to the shop. We have one item available.");
                    System.out.println("Double money generator: 30 dollars");
                    System.out.println("Would you like to buy the double money generator? (1) Yes (2) No");
                    System.out.println("Current balance: " + money);
                    int userchoice3 = scan.nextInt();
                    if (userchoice3 == 1) {
                        if (money >= 30) {
                            System.out.println("You have enough money. You purchase the double money generator.");
                            money -=30;
                            System.out.println("You now have " + money + " dollars.");
                            doublemoney = true;
                        } else {
                            System.out.println("You're broke");
                        }
                    } else {
                        System.out.println("You decide to not buy the double money generator");
                    }
                } else {
                    System.out.println("TO BE MADE");
                }
            }
        }else if(userchoice == 2){
            if(strength > 2 && stamina > 2){
                System.out.println("You have been accepted to be a cop.");
                System.out.println("TO BE ADDED");
            }else{
                System.out.println("You were not given this job and due to overwhelming stress about your future you kill yourself");
                System.out.println("game over");
            }
        }else if(userchoice == 3){
            if(intelligence > 2 && stamina > 2){
                System.out.println("You have been accepted to be a doctor.");
                System.out.println("TO BE ADDED");
            }else{
                System.out.println("You were not given this job and due to overwhelming stress about your future you kill yourself");
                System.out.println("game over");
            }
        }
    }
}