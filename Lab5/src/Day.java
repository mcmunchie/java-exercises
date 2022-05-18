package Lab5.src;

public class Day {
    private String day;
    private int currentDayIndex;

    public Day(String dayOfWeek) { // default constructor
        day = dayOfWeek; // hold current day of the week

        switch (day) { // assign an integer value to currentDayIndex based on day of the week, used for
                       // calculating next day(s)
            case "Mon":
                currentDayIndex = 1;
                break;
            case "Tues":
                currentDayIndex = 2;
                break;
            case "Wed":
                currentDayIndex = 3;
                break;
            case "Thurs":
                currentDayIndex = 4;
                break;
            case "Fri":
                currentDayIndex = 5;
                break;
            case "Sat":
                currentDayIndex = 6;
                break;
            case "Sun":
                currentDayIndex = 7;
                break;
        }
    }

    public void printDay() { // prints current day of the week
        System.out.println("The current day of the week is " + this.day + ".");
    }

    public String getDay() { // returns string that holds the day of the week
        return this.day;
    }

    public String nextDay() { // return string that holds the next day of the week
        if (day.equals("Mon")) { // tomorrow is Tues
            return "Tues";
        }
        if (day.equals("Tues")) { // tomorrow is Wed
            return "Wed";
        }
        if (day.equals("Wed")) { // tomorrow is Thurs
            return "Thurs";
        }
        if (day.equals("Thurs")) { // tomorrow is Fri
            return "Fri";
        }
        if (day.equals("Fri")) { // tomorrow is Sat
            return "Sat";
        }
        if (day.equals("Sat")) { // tomorrow is Sun
            return "Sun";
        } else { // tomorrow is Mon
            return "Mon";
        }
    }

    public String yesterday() { // return string that holds the day that was yesterday
        if (day.equals("Mon")) { // yesterday was Sun
            return "Sun";
        }
        if (day.equals("Tues")) { // yesterday was Mon
            return "Mon";
        }
        if (day.equals("Wed")) { // yesterday was Tues
            return "Tues";
        }
        if (day.equals("Thurs")) { // yesterday was Wed
            return "Wed";
        }
        if (day.equals("Fri")) { // yesterday was Thurs
            return "Thurs";
        }
        if (day.equals("Sat")) { // yesterday was Fri
            return "Fri";
        } else { // yesterday was Sat
            return "Sat";
        }
    }

    public String calculateDay(int daysAdded) { // calculate what day of the week it is if x days are added from current
                                                // day
        daysAdded = daysAdded % 7; // find how many days of the week to shift, 0 = same day, 1 = mon -> tues, 2 =
                                   // mon -> wed, etc

        if (currentDayIndex + daysAdded > 6) { // week loops back to beginning
            currentDayIndex = currentDayIndex - 7 + daysAdded;
        }
        if (currentDayIndex == 1) { // Monday
            return "Mon";
        }
        if (currentDayIndex == 2) { // Tuesday
            return "Tues";
        }
        if (currentDayIndex == 3) { // Wednesday
            return "Wed";
        }
        if (currentDayIndex == 4) { // Thursday
            return "Thurs";
        }
        if (currentDayIndex == 5) { // Friday
            return "Fri";
        }
        if (currentDayIndex == 6) { // Saturday
            return "Sat";
        } else { // Sunday
            return "Sun";
        }
    }

    public static void main(String[] args) throws Exception {
        Day mondayExample = new Day("Mon");
        Day sundayExample = new Day("Sun");

        mondayExample.printDay();
        System.out.println("The current day is " + mondayExample.getDay());
        System.out.println("Tomorrow will be " + mondayExample.nextDay());
        System.out.println("The day before Sunday is " + sundayExample.yesterday());
        System.out.println("23 days after Sunday is " + sundayExample.calculateDay(23));

    }
}
