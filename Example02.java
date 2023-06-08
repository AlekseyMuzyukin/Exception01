public class Example02 {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] newStr = null;
        String[][] newStr1 = new String[][] {
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" }
        };
        String[][] newStr2 = new String[][] {
                { "1", "1", "1", "1" },
                { "1", "1", "1", "1" },
                { "1", "1", "1", "1" },
                { "1", "1", "1", "1" },
                { "1", "1", "1", "1" }
        };
        String[][] newStr3 = new String[][] {
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "a", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" }
        };
        try {
            System.out.println(sum2d(newStr1));
            System.out.println(sum2d(newStr2));
            System.out.println(sum2d(newStr3));
            System.out.println(sum2d(newStr));
        } catch (NullPointerException nP) {
            System.out.println(nP.getMessage());
        } catch (IndexOutOfBoundsException iOOb) {
            System.out.println(iOOb.getMessage());
        } catch (NumberFormatException nFE) {
            System.out.println(nFE.fillInStackTrace());
        }

    }
}