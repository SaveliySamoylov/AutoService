import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Servicing firstServicing = new Servicing();
        Servicing secondServicing = new Servicing();
        Servicing threeServicing = new Servicing();
        Servicing fourServicing = new Servicing();

        firstServicing.servicing = "Change of oil and oil filter";
        firstServicing.price = 1500;
        secondServicing.servicing = "Antifreeze replacement";
        secondServicing.price = 1500;
        threeServicing.servicing = "Replacement of blocks";
        threeServicing.price = 1300;
        fourServicing.servicing = "Replacement of air filter";
        fourServicing.price = 300;

        Mounting firstMounting = new Mounting();
        Mounting secondMounting = new Mounting();

        firstMounting.mounting = "Summer rubber";
        firstMounting.price = 2500;
        secondMounting.mounting = "Winter rubber";
        secondMounting.price = 2400;

        Repair repair = new Repair();
        repair.repairEngine = "Engine overhaul";
        repair.firstPrice = 100000;
        repair.repairSuspension = "Suspension repair";
        repair.secondPrice = 20000;

        Clients firstClient = new Clients();
        Clients secondClient = new Clients();

        firstClient.name = "Ivan Veselov";
        firstClient.age = 34;
        firstClient.car = "Mercedes-Benz G 63 AMG";
        firstClient.engine = "MERCEDES–AMG G 63 V8 BiTurbo 4.0";
        firstClient.balance = 100000;

        secondClient.name = "Alexey Orlov";
        secondClient.age = 25;
        secondClient.car = "BMW M5 F90";
        secondClient.engine = "S63 V8 (S63B44Tü)";
        secondClient.balance = 100000;

        BodyWork firstBodyWork = new BodyWork();
        BodyWork secondBodyWork = new BodyWork();
        BodyWork threeBodyWork = new BodyWork();

        firstBodyWork.bodyWork = "Dent alignment";
        firstBodyWork.price = 5000;
        secondBodyWork.bodyWork = "Welding works on the body";
        secondBodyWork.price = 6000;
        threeBodyWork.bodyWork = "Replacing thresholds";
        threeBodyWork.price = 6000;

        Painting firstColor = new Painting();
        Painting secondColor = new Painting();
        Painting threeColor = new Painting();
        Painting fourColor = new Painting();

        firstColor.color = "Silver metallic";
        firstColor.price = 20000;
        secondColor.color = "Blue Volvo";
        secondColor.price = 40000;
        threeColor.color = "Red";
        threeColor.price = 30000;
        fourColor.color = "Black";
        fourColor.price = 60000;

        String location = "street Salova, 53k1B, Saint Petersburg";

        System.out.println("Welcome to AutoService Nediler!");
        System.out.println("Location: " + location + ".");
        System.out.println();
        System.out.println("Today 2 clients");
        System.out.println();
        System.out.println("1. Client");
        System.out.println("Name: " + firstClient.name + ".");
        System.out.println("Age: " + firstClient.age + ".");
        System.out.println("Car: " + firstClient.car + ".");
        System.out.println("Car engine: " + firstClient.engine + ".");
        System.out.println();
        System.out.println("2. Client");
        System.out.println("Name: " + secondClient.name + ".");
        System.out.println("Age: " + secondClient.age + ".");
        System.out.println("Car: " + secondClient.car + ".");
        System.out.println("Car engine: " + secondClient.engine + ".");
        System.out.println();
        System.out.println("Select one customer for service!");
        System.out.print("Choise: ");

        Scanner scanner = new Scanner(System.in);
        int choiseClient = scanner.nextInt();

        System.out.println();

        switch (choiseClient){
            case 1:
                System.out.println("You have selected the first customer");
                System.out.println();
                System.out.println("Choose what you want from the list below!");
                System.out.println("1. Servicing");
                System.out.println("2. Mounting");
                System.out.println("3. Repair Engine or Suspension");
                System.out.println("4. Body work");
                System.out.println("5. Painting");
                System.out.print("Choise: ");

                int workFirstSelection = scanner.nextInt();

                System.out.println();

                switch (workFirstSelection){
                    case 1:
                        System.out.println("Servicing: ");
                        System.out.println("1. " + firstServicing.servicing + ". Price: "
                                + firstServicing.price + " Rub.");
                        System.out.println("2. " + secondServicing.servicing + ". Price: "
                                + secondServicing.price + " Rub.");
                        System.out.println("3. " + threeServicing.servicing + ". Price: "
                                + threeServicing.price + " Rub.");
                        System.out.println("4. " + fourServicing.servicing + ". Price: "
                                + fourServicing.price + " Rub.");
                        System.out.print("Choise: ");

                        int choiseServicing = scanner.nextInt();

                        System.out.println();

                        switch (choiseServicing){
                            case 1:
                                if (firstClient.balance >= firstServicing.price){
                                    int remainingBalance = firstClient.balance - firstServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (firstClient.balance >= secondServicing.price){
                                    int remainingBalance = firstClient.balance - secondServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 3:
                                if (firstClient.balance >= threeServicing.price){
                                    int remainingBalance = firstClient.balance - threeServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 4:
                                if (firstClient.balance >= fourServicing.price){
                                    int remainingBalance = firstClient.balance - fourServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 2:
                        System.out.println("Mounting: ");
                        System.out.println("1. " + firstMounting.mounting + ". Price: " + firstMounting.price
                        + " Rub.");
                        System.out.println("2. " + secondMounting.mounting + ". Price: " + secondMounting.price
                                + " Rub.");
                        System.out.print("Choise: ");

                        int choiseMounting = scanner.nextInt();

                        System.out.println();

                        switch (choiseMounting){
                            case 1:
                                if (firstClient.balance >= firstMounting.price){
                                    int remainingBalance = firstClient.balance - threeServicing.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (firstClient.balance >= secondMounting.price){
                                    int remainingBalance = firstClient.balance - threeServicing.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 3:
                        System.out.println("Repair Engine or Suspension: ");
                        System.out.println("1. " + repair.repairEngine + ". Price: " + repair.firstPrice
                                + " Rub.");
                        System.out.println("2. " + repair.repairSuspension + ". Price: " + repair.secondPrice
                                + " Rub.");
                        System.out.print("Choise: ");

                        int choiseRepairEngineOrSuspension = scanner.nextInt();

                        System.out.println();

                        switch (choiseRepairEngineOrSuspension){
                            case 1:
                                if (firstClient.balance >= repair.firstPrice){
                                    int remainingBalance = firstClient.balance - repair.firstPrice;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (firstClient.balance >= repair.secondPrice){
                                    int remainingBalance = firstClient.balance - repair.secondPrice;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 4:
                        System.out.println("Body work: ");
                        System.out.println("1. " + firstBodyWork.bodyWork);
                        System.out.println("2. " + secondBodyWork.bodyWork);
                        System.out.println("3. " + threeBodyWork.bodyWork);
                        System.out.print("Choise: ");

                        int choiseBodyWork = scanner.nextInt();

                        System.out.println();
                        switch (choiseBodyWork){
                            case 1:
                                if (firstClient.balance >= firstBodyWork.price){
                                    int remainingBalance = firstClient.balance - firstBodyWork.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (firstClient.balance >= secondBodyWork.price){
                                    int remainingBalance = firstClient.balance - secondBodyWork.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 3:
                                if (firstClient.balance >= threeBodyWork.price){
                                    int remainingBalance = firstClient.balance - threeBodyWork.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 5:
                        System.out.println("Painting: ");
                        System.out.println("1. " + firstColor.color + ". Price: "
                                + firstColor.price + " Rub.");
                        System.out.println("2. " + secondColor.color + ". Price: "
                                + secondColor.price + " Rub.");
                        System.out.println("3. " + threeColor.color + ". Price: "
                                + threeColor.price + " Rub.");
                        System.out.println("4. " + fourColor.color + ". Price: "
                                + fourColor.price + " Rub.");
                        System.out.print("Choise: ");

                        int choisePainting = scanner.nextInt();

                        switch (choisePainting){
                            case 1:
                                if (firstClient.balance >= firstColor.price){
                                    int remainingBalance = firstClient.balance - firstColor.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (firstClient.balance >= secondColor.price){
                                    int remainingBalance = firstClient.balance - secondColor.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 3:
                                if (firstClient.balance >= threeColor.price){
                                    int remainingBalance = firstClient.balance - threeColor.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 4:
                                if (firstClient.balance >= fourColor.price){
                                    int remainingBalance = firstClient.balance - fourColor.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case default:
                        System.out.println("There are no such works in our service!");
                        break;
                }

                break;
            case 2:
                System.out.println("You have selected a second customer");
                System.out.println();
                System.out.println("Choose what you want from the list below!");
                System.out.println("1. Servicing");
                System.out.println("2. Mounting");
                System.out.println("3. Repair Engine or Suspension");
                System.out.println("4. Body work");
                System.out.println("5. Painting");
                System.out.print("Choise: ");

                int workSecondSelection = scanner.nextInt();
                System.out.println();

                switch (workSecondSelection){
                    case 1:
                        System.out.println("Servicing: ");
                        System.out.println("1. " + firstServicing.servicing + ". Price: "
                                + firstServicing.price + " Rub.");
                        System.out.println("2. " + secondServicing.servicing + ". Price: "
                                + secondServicing.price + " Rub.");
                        System.out.println("3. " + threeServicing.servicing + ". Price: "
                                + threeServicing.price + " Rub.");
                        System.out.println("4. " + fourServicing.servicing + ". Price: "
                                + fourServicing.price + " Rub.");
                        System.out.print("Choise: ");

                        int choiseServicing = scanner.nextInt();

                        System.out.println();

                        switch (choiseServicing){
                            case 1:
                                if (secondClient.balance >= firstServicing.price){
                                    int remainingBalance = secondClient.balance - firstServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (secondClient.balance >= secondServicing.price){
                                    int remainingBalance = secondClient.balance - secondServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 3:
                                if (secondClient.balance >= threeServicing.price){
                                    int remainingBalance = secondClient.balance - threeServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 4:
                                if (secondClient.balance >= fourServicing.price){
                                    int remainingBalance = secondClient.balance - fourServicing.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 2:
                        System.out.println("Mounting: ");
                        System.out.println("1. " + firstMounting.mounting + ". Price: " + firstMounting.price
                                + " Rub.");
                        System.out.println("2. " + secondMounting.mounting + ". Price: " + secondMounting.price
                                + " Rub.");
                        System.out.print("Choise: ");

                        int choiseMounting = scanner.nextInt();

                        System.out.println();

                        switch (choiseMounting){
                            case 1:
                                if (secondClient.balance >= firstMounting.price){
                                    int remainingBalance = secondClient.balance - threeServicing.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (secondClient.balance >= secondMounting.price){
                                    int remainingBalance = secondClient.balance - threeServicing.price;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 3:
                        System.out.println("Repair Engine or Suspension: ");
                        System.out.println("1. " + repair.repairEngine + ". Price: " + repair.firstPrice
                                + " Rub.");
                        System.out.println("2. " + repair.repairSuspension + ". Price: " + repair.secondPrice
                                + " Rub.");
                        System.out.print("Choise: ");

                        int choiseRepairEngineOrSuspension = scanner.nextInt();

                        System.out.println();

                        switch (choiseRepairEngineOrSuspension){
                            case 1:
                                if (secondClient.balance >= repair.firstPrice){
                                    int remainingBalance = secondClient.balance - repair.firstPrice;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (secondClient.balance >= repair.secondPrice){
                                    int remainingBalance = secondClient.balance - repair.secondPrice;
                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 4:
                        System.out.println("Body work: ");
                        System.out.println("1. " + firstBodyWork.bodyWork);
                        System.out.println("2. " + secondBodyWork.bodyWork);
                        System.out.println("3. " + threeBodyWork.bodyWork);
                        System.out.print("Choise: ");

                        int choiseBodyWork = scanner.nextInt();

                        System.out.println();
                        switch (choiseBodyWork){
                            case 1:
                                if (secondClient.balance >= firstBodyWork.price){
                                    int remainingBalance = secondClient.balance - firstBodyWork.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (secondClient.balance >= secondBodyWork.price){
                                    int remainingBalance = secondClient.balance - secondBodyWork.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 3:
                                if (secondClient.balance >= threeBodyWork.price){
                                    int remainingBalance = secondClient.balance - threeBodyWork.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case 5:
                        System.out.println("Painting: ");
                        System.out.println("1. " + firstColor.color + ". Price: "
                                + firstColor.price + " Rub.");
                        System.out.println("2. " + secondColor.color + ". Price: "
                                + secondColor.price + " Rub.");
                        System.out.println("3. " + threeColor.color + ". Price: "
                                + threeColor.price + " Rub.");
                        System.out.println("4. " + fourColor.color + ". Price: "
                                + fourColor.price + " Rub.");
                        System.out.print("Choise: ");

                        int choisePainting = scanner.nextInt();

                        switch (choisePainting){
                            case 1:
                                if (secondClient.balance >= firstColor.price){
                                    int remainingBalance = secondClient.balance - firstColor.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 2:
                                if (secondClient.balance >= secondColor.price){
                                    int remainingBalance = secondClient.balance - secondColor.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 3:
                                if (secondClient.balance >= threeColor.price){
                                    int remainingBalance = secondClient.balance - threeColor.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case 4:
                                if (secondClient.balance >= fourColor.price){
                                    int remainingBalance = secondClient.balance - fourColor.price;

                                    System.out.println("Thank you for serving us! Remaining balance: "
                                            + remainingBalance);
                                } else {
                                    System.out.println("Not enough funds!");
                                }
                                break;
                            case default:
                                System.out.println("There are no such works in our service!");
                                break;
                        }

                        break;
                    case default:
                        System.out.println("There are no such works in our service!");
                        break;
                }

                break;
            case default:
                System.out.println("There is no such client!");
                break;
        }
    }
}