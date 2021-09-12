public class Fundementals{
    public String settingAndSwapping(String myNumber, String myName){
        String myNumber = "42";
        String myName = “Jesus”;
        System.out.println("myNumber = " + myNumber);
        System.out.println("myName = " + myName);

        this.myNumber = myNumber
        this.myName = myName;
        myName = myNumber;
        System.out.println("myName is swapped with " + myNumber);
        System.out.println("myNumber is swapped with " + myName);
    }

    public int forLoop(int i){
        for (i = -52; i < 1067; i++) {
            System.out.println(i);
        }
    }

    public int beCheerful(int i) {
        for (i = 1; i < 99; i++) {
        System.out.println("good morning!");
        }
        System.out.println(i);
    }

    public int multipleOfThree(int i){
        for (i = -300; i < 1; i += 3) {
            if (i == -6 || i == -3) {
                i = null;
            }
            System.out.println(i);
            }
    }

    public int intergersWithWhile(int i){
        int i = 2000;
        while (i < 5281, i++) {
            System.out.println(i);
        }
    }

    public int itsYourBirthday(int birthDay, int birthMonth){
        int birthDay = Math.random() * 31 + 1);
        int birthMonth = Math.random() *12 + 1);
        if (birthDay == 15 || birthMonth == 9) {
            System.out.println("How did you know?");
        } else {
            System.out.println("Just another day…");
        }
        System.out.println("Birthdayer = " + birthDay, "Birthmonth number = " + birthMonth);
    }

    public int leapYear(int year){
        if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0 )) {
            System.out.println("it's a Leap Year");
            } else {
                System.out.println("it's not a Leap Year");
            }
            System.out.println(leapYear(4000));
    }

    public int printAndCount(int i){
        for (i = 512; i < 4097; i++){
            if (i % 5 == 0) {
            System.out.println(i);
            }
        }
        System.out.println(printAndCount(i));
    }

    public int multiplesOfSix(int i){
        int i = 0;
        while (i < 600001; i++) {
            if (i % 6 == 0) {
            System.out.println(i);
            } 
        }
        System.out.println(i);
    }

    public int theDojoWay(int i){
        for (i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println("Coding");
            }
            if (i % 10 == 0) {
                System.out.println("Dojo");
            }
            System.out.println(i);
        }
    }

    public int whatDoYouKnow(int i) {
        sum = 0;
        for (sum = i; i < 10; i++) {
sum += i;
}
            return sum;
        }
        System.out.println(sum); 
    }

    public int suckersHuge(int i){
        i = -3000;
        for(i < 3000, i++){
            if(i % 2 = 1) {
                System.out.println(i);
            }
        }
    }

    public int countDownByFour(int i){
        i = 2017;
        while (i > 0) {
            i -= 1;
            if(i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}