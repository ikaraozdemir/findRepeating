import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myList = {0, 1, 3, 3, 4, 5, 4, -1, 4, 6, 0, 6};
        System.out.println("Listemiz : " + Arrays.toString(myList));
        System.out.print("Listemizde tekrar eden sayılar : ");
        Arrays.sort(myList);
        String repeatingNum = "";
        for (int index1 = 0; index1 < myList.length; index1++) {
            for (int index2 = 0; index2 < myList.length; index2++) {
                if (!(index1 == index2) && myList[index1] == myList[index2]) {
                    if (myList[index1] % 2 == 0) {
                        if (repeatingNum.equals(Integer.toString(myList[index1]))) {
                            break;
                        } else {
                            repeatingNum = Integer.toString(myList[index1]);
                            System.out.print(repeatingNum + " ");
                        }
                        break;
                    }
                }
            }
        }
    }
}