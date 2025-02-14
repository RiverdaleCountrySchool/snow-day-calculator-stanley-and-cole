public class SnowDayCalculator {
    public static void main(String[] args) {
        // isMountain, latitude, day, SinglaParentRate,temperatureMorning
        boolean isMountainous = Boolean.parseBoolean(args[0]);
        double latitude  = Double.parseDouble(args[1]);
        int day = Integer.parseInt(args[2]);
        double SingleParentRate = Double.valueOf(args[3]);
        double totalPoints = 0;
        double temperatureMorning = Double.valueOf(args[4]);

        System.out.print("Are you in a Mountainous area? " + args[0]);
        System.out.print("\nWhat is your latitude? " + args[1]);
        System.out.print("\nWhat day is it? " + args[2]);
        System.out.print("\nWhat is the temperature this morning? " + args[3]);
        System.out.print("\nWhat is the single parent rate right now? " + args[4]);

        if(isMountainous){
            totalPoints += 2;
        }
        if (day == 1 || day ==5) {
        totalPoints++;

        }
        if (temperatureMorning <= -10) {
            totalPoints +=3;
        }
        if (SingleParentRate >= 30) {
            totalPoints += 3;

        }

        totalPoints += (latitude-90)/3;
        totalPoints += 5*(totalPoints - 50);
        System.out.println(" \nYour total points add up to " +totalPoints + "\nCalculat" +
                "ing chances..." + "\n..."+"\n..."+"\n..."+"\n...");
        }

    }

