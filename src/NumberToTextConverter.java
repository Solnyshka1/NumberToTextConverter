import java.util.Scanner;

public class NumberToTextConverter {
    private static final String[] ones = {"нөл", "бир", "эки", "үч", "төрт", "беш", "алты", "жети", "сегиз", "тогуз"};
    private static final String[] teens = {"он", "он бир", "он эки", "он үч", "он төрт", "он беш", "он алты", "он жети", "он сегиз", "он тогуз"};
    private static final String[] tens = {"", "он", "жыйырма", "отуз", "кырк", "элүү", "алтымыш", "жетимиш", "сексен", "токсон"};
    private static final String[] hundreds = {"", "жүз", "эки жүз", "үч жүз", "төрт жүз", "беш жүз", "алты жүз", "жети жүз", "сегиз жүз", "тогуз жүз"};

    public static String convertNumberToText(int number) {
        if (number < 0 || number > 99999) {
            return "Чектен чыккан сан";
        }
        if (number == 0) {
            return "нөл";
        }

        StringBuilder result = new StringBuilder();

        int thousands = number / 1000;
        int remainder = number % 1000;

        if (thousands > 0) {
            if (thousands == 1) {
                result.append("миң");
            } else {
                result.append(convertHundreds(thousands)).append(" миң");
            }
        }

        if (remainder > 0) {
            if (!result.isEmpty()) {
                result.append(" ");
            }
            result.append(convertHundreds(remainder));
        }

        return result.toString().trim();
    }

    private static String convertHundreds(int number) {
        StringBuilder result = new StringBuilder();

        int hundredPart = number / 100;
        int tenPart = (number % 100) / 10;
        int onePart = number % 10;

        if (hundredPart > 0) {
            result.append(hundreds[hundredPart]).append(" ");
        }

        if (tenPart == 1) {
            result.append(teens[onePart]);
        } else {
            if (tenPart > 0) {
                result.append(tens[tenPart]).append(" ");
            }
            if (onePart > 0) {
                result.append(ones[onePart]);
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан киргизиңиз (0-99999): ");
        int number = scanner.nextInt();

        System.out.println("Жазуу түрүндө: " + convertNumberToText(number));

        scanner.close();
    }
}
