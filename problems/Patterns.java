package problems;

public class Patterns {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        print66(n);
        print67(n);
        print68(n);
        print69(n);
        print70(n);
        print71(n);
        print72(n);
        print73(n);
        print74(n);
        print75(n);
        print76(n);
        print77(n);
        print78(n);
        print79(n);
        print80(n);
        print81(n);
        print82(n);
    }

    private static void print82(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void print81(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void print80(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void print79(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }

    private static void print78(int n) {
        for (int i = 0; i < n; i++) {
            boolean track = i % 2 == 0;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(track ? 1 : 0);
                track = !track;
            }
            System.out.println();
        }
    }

    private static void print77(int n) {
        for (int i = 0; i < n; i++) {
            int count = 65 + n - i - 1;
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char) count);
                count++;
            }
            System.out.println();
        }
    }

    private static void print76(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char) (65 + i));
            }
            System.out.println();
        }
    }

    private static void print75(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }

    private static void print74(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i - j + 1);
            }
            System.out.println();
        }
    }

    private static void print73(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    private static void print72(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + n - i - 1; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void print71(int n) {
        // first half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (j < n - i - 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        // second half
    }

    private static void print70(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    private static void print69(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n - j);
            }
            System.out.println();
        }
    }

    private static void print68(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    private static void print67(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void print66(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
