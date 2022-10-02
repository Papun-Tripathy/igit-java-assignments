import java.util.Scanner;

class Question1f {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num, k, temp;
        String choice;

        System.out.print("Enter the number: ");
        num = in.nextInt();
        System.out.print("Enter the choice to choose the number from f for Front side and b for Back side: ");
        choice = in.next();
        System.out.print("Enter the position: ");
        k = in.nextInt();
        if (String.valueOf(num).length() < k) {
            System.out.println("Index is out of range!!");
            System.exit(0);
        }
        temp = num;

        int positionValue = 1, placeValue = 0;

        switch (choice.toLowerCase()) {
            case "f":
            case "front":

                positionValue = 1;
                placeValue = 0;

                for (int count = 1; count <= k; count++) {
                    positionValue *= 10;
                    placeValue = temp % 10;
                    temp /= 10;
                }

                System.out.println(
                        "The kth digit from the front is " + placeValue + " having the place value "
                                + (placeValue * positionValue));
                break;

            case "b":
            case "back":

                int t = num;
                temp = 0;
                positionValue = 1;

                while (t > 0) {
                    temp = (temp * 10) + (t % 10);
                    t /= 10;
                    positionValue *= 10;
                }

                placeValue = 0;

                for (int count = 1; count <= k; count++) {
                    positionValue /= 10;
                    placeValue = temp % 10;
                    temp /= 10;
                }

                System.out.println(
                        "The kth digit from the back is " + placeValue + " having the place value "
                                + (placeValue * positionValue));
                break;

            default:
                System.out.println("Invalid Input!!!");
        }

        in.close();
    }
}
