package jisay.library.module;
import java.lang.Math;

public class Sample {
    static int isPerfectNum(int num){
        int sum = 0;
        for(int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if(num == sum) return 1;
        else return 0;
    }
    static int chkover(int w, int h, int j, int i) {
        if (i >= 0 && i < w && j >= 0 && j < h) return 1;
        return 0;
    }
    public static void main(String[] args) {
        int[][] field = { {0,1,0,1}, {0,0,0,1}, {1,1,1,0}, {0,1,1,1} };
        int[][] mines = new int[4][4];
        int w = 4, h = 4;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (field[y][x] == 0) continue;

                for (int j = y - 1; j <= y + 1; j++) {
                    for (int i = x - 1; i <= x + 1; i++) {
                        if (chkover(w, h, j, i) == 1)
                            mines[j][i] += 1;
                        //
                        for (int m = 0; m < h; m++) {
                            for (int n = 0; n < w; n++) {
                                System.out.print(mines[m][n] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println(); // 배열 상태 출력 후 개행
                    }
                }
            }
        }
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                System.out.print(mines[y][x]);
            }
            System.out.println();
        }
    }
}
