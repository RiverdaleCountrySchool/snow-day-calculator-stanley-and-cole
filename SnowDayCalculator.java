public class SnowDayCalculator {
    public static void main(String[] args) {
        /*HELLO USER! WELCOME TO THE SNOWDAY CALKULATOR!
        PLEASE INPUT:

        WHETHER YOU ARE IN A MOUNTANOUS AREA--args[0], true or false
        YOUR |LATITUDE| (0-90)--args[1], decimal
        DAY OF THE WEEK (Integer form, so 1-5 per each day) --args[2]
        THE TEMPERATURE IN THE MORNING--args[3],
        THE PERCENTAGE OF STUDENTS IN CLASS WHO HAVE DIVORCED PARENTS (%)
        * */
        boolean isMountainous = Boolean.parseBoolean(args[0]);
        double latitude  = Double.parseDouble(args[1]);
        int day = Integer.parseInt(args[2]);
        double DivorceRate = Double.valueOf(args[3]);
        double totalPoints = 0;
        double temperatureMorning = Double.valueOf(args[4]);
        String Reset = "\u001B[0m";
        String magenta = "\u001B[45m";
        String blue = "\u001B[44m";
        String color = "";
        // Validating Variables//

        if (day <1 || day>5) {
            System.out.println("Please enter a number between 1 and 5, 请输入1至5之数");
            return;
        }
        if (DivorceRate <0 ||DivorceRate>100) {
            System.out.println("Input a percentage between 0 and 100 please, 请输入0至100的百分之");
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
            totalPoints += DivorceRate/3;

        }
        totalPoints += (latitude-90)/3;// Latitude calc
       if(totalPoints<=10){
           //Insert Blue//
           color = blue;
       }
       else{
           //Insert Pink//
           color = magenta;
       }
        String willSnow = ( totalPoints >=10) ? "¡Hay un día de nieve hoy!": "Hay que ir a la escuela";
        System.out.println(" \nYour total points add up to " + color + totalPoints + Reset +  "\nCalculat" +
                "ing chances..." + "\n..."+"\n..."+"\n..."+"\n..." + "\nThe result is: " + willSnow);

        }

    }

