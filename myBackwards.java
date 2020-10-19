import java.util.Scanner;

class myBackwards {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();

        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
    }
}