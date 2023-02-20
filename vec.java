public class vec {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        for (int j = marks.length - 1; j >= 0; j--) {
            System.out.println(marks[j]);
        }
        for (int element : marks) {
            System.out.println(element);
        }
        int[][] binary;
        int c = 0;
        binary = new int[3][3];
        binary[0][0] = 200;
        binary[0][1] = 201;
        binary[0][2] = 202;
        binary[1][0] = 203;
        binary[1][1] = 204;
        binary[1][2] = 205;

        // Display the 2-D Array using (for Loop)
        for (int k = 0; k < binary.length; k++) {
            for (c = 0; c < binary[k].length; c++) {
                System.out.print(binary[k][c]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
