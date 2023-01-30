package build.jar;

public class JarBuildExample {

    public static void main(String[] args) {
        int h = 11;
        // draw body tree
        for (int i = 1; i <= h; i++) {
            //draw space
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            //draw *
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        // draw root tree
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < h - 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 3; k++) {
                System.out.print("**");
            }
            System.out.print("\n");
        }
        System.out.println("MERRY CHRISTMAS TO E2E AUTOMATION TEAM");
    }
}
