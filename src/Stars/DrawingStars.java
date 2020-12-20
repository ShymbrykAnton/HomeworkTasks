package Stars;

public class DrawingStars {
    public void drawSquare() {
        for (int i = 0; i < 7; i++) {

            for (int k = 0; k < 7; k++) {
                if (k == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("  *");
                }
            }
            if (i < 6) {
                System.out.println();
            }
        }
    }

    public void drawEmptySquare() {
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) {
                if (x != 6 && y != 6 && x != 0 && y != 0) {
                    System.out.print("   ");
                } else if (y < 6) {
                    System.out.print("*  ");
                } else {
                    System.out.print("*");
                }
            }
            if (x < 6) {
                System.out.println();
            }
        }
    }

    public void drawLeftTopTriangle() {
        for (int x = 6; x >= 0; x--) {
            for (int y = 0; y < 7; y++) {
                if (x != y && x != 6 && y != 0) {
                    System.out.print("   ");
                } else if (y == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("  *");
                }
            }
            if (x > 0) {
                System.out.println();
            }
        }
    }

    public void drawLeftBottomTriangle() {
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) {
                if (y != 0 && x != y && x != 6) {
                    System.out.print("   ");
                } else if (y == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("  *");
                }
            }
            if (x < 6) {
                System.out.println();
            }
        }
    }

    public void drawRightBottomTriangle() {
        for (int x = 6; x >= 0; x--) {
            for (int y = 0; y < 6; y++) {
                if (x != 0 && y != x) {
                    System.out.print("  ");
                } else if (y == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                }
            }
            if (x > 0) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }
        }
    }

    public void drawRightTopTriangle() {
        for (int x = 6; x >= 0; x--) {
            for (int y = 6; y >= 0; y--) {
                if (x != y && y != 0 && x != 6) {
                    System.out.print("  ");
                } else if (y == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            if (x > 0) {
                System.out.println();
            }
        }
    }

    public void drawX() {
        int x1 = 0;
        for (int x = 6; x >= 0; x--, x1++) {
            for (int y = 0; y < 7; y++) {
                if (y != x && y != x1) {
                    System.out.print("   ");
                } else {
                    System.out.print("  *");
                }
            }
            if (x > 0) {
                System.out.println();
            }
        }
    }

    public void drawTopTriangle() {
        int x1 = 0;

        for (int x = 6; x >= 0; x--, x1++) {
            for (int y = 0; y < 7; y++) {
                if ((y != x && y != x1 && x != 6) || (x < 3)) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            if (x > 0) {
                System.out.println();
            }
        }
    }

    public void drawBottomTriangle() {
        int x1 = 0;
        for (int x = 6; x >= 0; x--, x1++) {
            for (int y = 0; y < 7; y++) {
                if ((y != x && y != x1 && x != 0) || (x > 3)) {
                    System.out.print("   ");
                } else {
                    System.out.print("  *");
                }
            }
            if (x > 0) {
                System.out.println();
            }
        }
    }
}