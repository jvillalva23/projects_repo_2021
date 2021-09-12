public class FundamentalsThree {
    public int[] positiveChange(int[] i){
        int[] i = [-1,2,-3,4,5,6,-1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = arr[i];
            } else {
                arr[i] = "big";
                }
            return i;
        }
    }

    public int[] printLowReturnHigh(int[] low, int[] high){
        int[] low = arr[0];
        int[] high = arr[0];
        if (arr.length == 0) {
            System.out.println("The array is empty");
        } else if (arr.length == 1) {
            System.out.println("There is only 1 element");
        } else {
            for(i = 0; i < arr.length; i++) {
                if (arr[i] high){
                    high = arr[i];
                }
            }
        }
        System.out.println(low);
        return high;
    }

    public int[] printOne(arr[] odd){
        int[] odd = [1,2,3,4,5];
        if (arr.length == 0) {
            System.out.println("This array is empty!");
        } else if (arr.length == 1) {
            System.out.println("There is only 1 element in this array");
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    System.out.println("Break!");  
                }
            }
        }
        return odd;
    }

    public int[] doubleVision(int[] newArr){
        int[] newArr = [1,2,3,4,5];
        for (int i = 0; i < arr.length; i++) {
            newArr.push(arr[i] * 2);
        }
        return newArr;
    }

    public int[] countPositive(int[] arr){
        int lastPositive = 5;
        int priorIndex = arr[0];
        for (int i = -1; i > 0; i++) {
            priorIndex = i;
        }
        arr[priorIndex] = lastPositive;
        return arr;
    }

    public int[] evensAndOdds(int[] threeEvens, int[] threeOdds){
        int[] threeOdds = 0;
        int[] threeEvens = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                threeOdds++;
                System.out.println("That's odd!");
            } else {
                System.out.println("Even so!");
                }
        }
    }
    
    public int[] incrementInSeconds(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
            arr[i] += 1;
            }
        }
        return arr;
    }

    public int[] previousLengths(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == " ") {
                arr[i] = arr[i].length;
                System.out.println("string");
            }
            return arr;
        }
    }

    public int[] addSevenToMost(int[] arr){
        int newArr = [];
        for (int i = 0; i < arr.length; i++) {
            if (int arr[i] == int){
                newArr.push(arr[i] + 7);
            }
        }
        return newArr;
    }

    public int[] reverseArray(int[] arr){
        for(int i = 0; i < Math.floor(arr.length/2); i++) {
            arr[i] = arr[arr.length – 1 – i];
            temp = arr[i];
        }
        return arr;
    }

    public int[] outlookNegative(int[] arr){
        int arr = [];
        for (int i = 0; i < 0; i < i--;) {
            arr.push(arr[i]);
        }
        return arr;
    }

    public int[] alwaysHungry(int[] arr){
        int arr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "food") {
                arr++;
                System.out.println("yummy");
            } else if (arr[i] == arr[arr.length – 1] && arr == 0) {
                System.out.println("I'm hungry!");
                }
        }
        return arr;
    }

    public int[] towardsCenter(int[] arr){
        for(int i = 0; i < Math.floor(arr.length/2); i++) {
            if (i % 2 == 0) {
                arr[i] = arr[arr.length – 1 – i];
            }
        }
        return arr;
    }

    public int[] scaleArray(int[] num){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= num;
        }
        return num;
    }
}