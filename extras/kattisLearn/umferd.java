package extras.kattisLearn;

import java.util.Scanner;

class umferd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int empty = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == '.') {
                    empty++;
                }
            }
        }
        System.out.println(((double)empty/(double)(n*m)));
    }
}




