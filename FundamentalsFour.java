public class FundamentalsFour {
    public int[] lastFew(int[] num){
        for (int i = 0; i < num; i++) {
            num.shift();
        }
        return num;
    }

    public int poorKenny(int prob){
        if (prob <= 0.10) {
            System.out.println("volcano disaster!");
        } else if (0.11 < prob <= 0.25) {
            System.out.println("tsunami!");
        } else if (0.26 < prob <= 0.45) {
            System.out.println("earthquake!");
        } else if (0.46 < prob <= 0.70) {
            System.out.println("blizzard!");
        } else if (0.71 < prob <= 1.00) {
            System.out.println("meteor strike!");
        } else {
            System.out.println("no natural disasters today!");
        }
    }

    public int whatReallyHappensToday(int day, int counter, int prob, int count){
        int day = 0;
        int counter = 0;
        int prob = 0;
        int count = 0;
        while (day != 0; day--;){
            counter++;
            System.out.println("Day counter");
            for (int i = 0; i < day.length – 1; i++) {
                if (i == 1) {
                    prob = Math.random().toFixed(2);
                }
                if (prob <= 0.10) {
                    count++;
                }else if (i == 2) {
                    prob = Math.random().toFixed(2);
                    if (prob <= 0.15) {
                        count++;
                    }
                } else if (i == 3) {
                    prob = Math.random().toFixed(2);
                    if (prob <= 0.20) {
                        count++;
                    }
                } else if (i == 4) {
                    prob = Math.random().toFixed(2);
                    if (prob <= 0.25) {
                        count++;
                    }
                } else {
                    prob = Math.random().toFixed(2);
                    if (prob <= 0.30) {
                        count++;
                    }
            }
        }
        if (count == 0) {
            System.out.println("We're doom!");
        }
        return day;
        }
    }

    public int letterGrade(int grade){
        for (int i = grade; i > 90;) {
            System.out.println("Score: " grade ". Grade: A");
        } else if (i > 80) {
          System.out.println("Score: " grade ". Grade: B");
        } else if (i > 70) {
          System.out.println("Score: " grade ". Grade: C");
        } else if (i > 60) {
          System.out.println("Score: " grade ". Grade: D");
        } else {
          System.out.println("Score: " grade ". Grade: F");
        }
        return grade;
    }

    public int accurateGrade(int score){
        if (score > 90 ) {
            System.out.println("Score: " score ". Grade: A");
        } else if (i > 80) {
          System.out.println("Score: " score ". Grade: B");
        } else if (i > 70) {
          System.out.println("Score: " score ". Grade: C");
        } else if (i > 60) {
          System.out.println("Score: " score ". Grade: D");
        } else {
          System.out.println("Score: " score ". Grade: F");
        }
        return score;
    }
}