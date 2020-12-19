package Stars;

public class DrawingStars {
    public void drawSquare() {
        for (int i = 0; i < 7; i++) {
            if (i > 0) {
                System.out.println();
            }
            for (int k = 0; k < 7; k++) {
                if (k == 0) {
                    System.out.print("*");
                } else
                    System.out.print("  *");
            }
        }
    }

    public void drawEmptySquare() {
        for (int x = 0; x < 7; x++) {
            if (x > 0) {
                System.out.println();
            }
            for (int y = 0; y < 7; y++) {
                if (y == 0) {
                    System.out.print("*");
                }
                if (x == 0) {
                    System.out.print("  *");
                }
                if (x > 0 && x < 6) {
                    System.out.print("   ");
                }
                if (x == 6) {
                    System.out.print("  *");
                }
                if (y == 6) {
                    System.out.print("  *");
                }
            }
        }
    }

    public void drawLeftTopSideTriangle() {
        int x1 = 0;
        int y1 = 5;
        for (int x = 0; x < 7; x++) {
            if (x > 0) {
                System.out.println();
            }
            for (int y = 0; y < 7; y++) {
                if (y == 0) {
                    System.out.print("* ");
                }
                if (x == 0 && y < 5) {
                    System.out.print("* ");
                }
                if (x == x1 && y == y1) {
                    System.out.print("*");
                    x1++;
                    y1--;
                    break;
                }
                if (y < 6 && x > 0) {
                    System.out.print("  ");
                }
            }
        }
    }

    public void drawLeftBottomTriangle() {
        int x1 = 1;
        int y1 = 1;
        for (int x = 0; x < 7; x++) {
            if (x > 0) {
                System.out.println();
            }
            for (int y = 0; y < 7; y++) {
                if (y == 0) {
                    System.out.print("* ");
                }
                if (x == 6 && y < 5) {
                    System.out.print("* ");
                }
                if (x > 0 && x < 6 && y > 1) {
                    System.out.print("  ");
                }
                if (x == x1 && y == y1) {
                    System.out.print("*");
                    x1++;
                    y1++;
                    break;
                }

            }
        }
    }
    public void drawRightBottomTriangle() {
        int x1 = 1;
        int y1 = 5;
        for (int x = 0; x < 7; x++) {
            if (x > 0) {
                System.out.println();
            }
            for (int y = 0; y < 7; y++) {
                if (x != 6 && y!=6) {
                    System.out.print("0");}
                if (x == 6) {
                    System.out.print("1");
                }
                if (y == 6&& x!=6) {
                    System.out.print("2");
                }
                if (x == x1 && y == y1) {
                    System.out.print("3");
                    x1++;
                    y1--;

                }

            }
        }
    }
}


