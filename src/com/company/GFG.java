package com.company;

class GFG {
    // Kani waa funnction ka magic square
    // Function to generate odd sized magic squares
    static void generateSquare(int n)
    {
        int[][] magicSquare = new int[n][n];

        // possion ka I & J ka bilaa banayaan
        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= n * n;) {
            // Xeerka sidaxad I = -1 and j== n I=0 and j==n-2
            if (i == -1 && j == n) // 3rd condition
            {
                j = n - 2;
                i = 0;
            }
            else {
                // haddii  J == n
                // j =0
                if (j == n)
                    j = 0;

                //Haddii  I <0
                // I== n-1
                if (i < 0)
                    i = n - 1;
            }

            // Waa xeerka Haddii  Booska La dagge
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            }
            else
                // set number
                magicSquare[i][j] = num++;

            // 1st condition
            j++;
            i--;
        }

        // print magic square
        System.out.println("The Magic Square for " + n
                + ":");
        System.out.println("Sum of each row or column "
                + n * (n * n + 1) / 2 + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(magicSquare[i][j] + " ");
            System.out.println();
        }
    }


}

