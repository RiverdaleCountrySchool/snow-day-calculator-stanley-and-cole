public class SnowDayCalculator {
    public static void main(String[] args) {
        /*HELLO USER! WELCOME TO THE SNOWDAY CALKULATOR! INPUT WHETHER YOU ARE IN A MOUNTANOUS
        AREA, YOUR |LATITUDE| (0-90),  WHAT DAY IS IT (1-5), THE TEMPERATURE IN THE MORNING, THE PERCENTAGE
        OF STUDENTS IN CLASS WHO HAVE DIVORCED PARENTS (%)
        * */
        boolean isMountainous = Boolean.parseBoolean(args[0]);
        double latitude  = Double.parseDouble(args[1]);
        int day = Integer.parseInt(args[2]);
        double DivorceRate = Double.valueOf(args[3]);
        double totalPoints = 0;
        double temperatureMorning = Double.valueOf(args[4]);
        // Validating Variables//

        if (day <1 || day>5) {
            System.out.println("请输入1至5之数");
            return;
        }
        if (DivorceRate <0 ||DivorceRate>100) {
            System.out.println("You need more divorce to have a snow day");
            return;
        }



        System.out.print("Are you in a Mountainous area? " + args[0]);
        System.out.print("\nWhat is your latitude? " + args[1]);
        System.out.print("\nWhat day is it? " + args[2]);
        System.out.print("\nWhat is the temperature this morning? " + args[3]);
        System.out.print("\nWhat is the divorce rate right now? " + args[4]+"%");

        if(isMountainous){
            totalPoints += 2;
        }
        if (day == 1 || day ==5) {
        totalPoints++;

        }
        if (temperatureMorning <= -10) {
            totalPoints +=3;
        }
        if (DivorceRate >= 30) {
            totalPoints += 3;

        }

        totalPoints += (latitude-90)/3;// Latitude calc
        String willSnow = ( totalPoints >=10) ? "¡Hay un día de nieve hoy!": "Hay que ir a la escuela";
        System.out.println(" \nYour total points add up to " +totalPoints + "\nCalculat" +
                "ing chances..." + "\n..."+"\n..."+"\n..."+"\n..." + "\nThe result is: " + willSnow);

        }

    }

