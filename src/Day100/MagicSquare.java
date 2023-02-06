/*Write a Java program to generate a magic square of order n (all row, column, and diagonal sums are equal).*/

package Day100;

import java.util.*;
public class MagicSquare {
	
	//Method to generate  the magic square of order n 
	public static void generateSquare(int num) {
		if ((num % 2 == 0) || (num <=0 ))
        {
            System.out.print("Input number must be odd and >0"); 			
			System.exit(0); 
		}

        int[][] magic_square = new int[num][num];

        int row_num = num-1;
        int col_num = num/2;
        magic_square[row_num][col_num] = 1;

        for (int i = 2; i <= num*num; i++) {
            if (magic_square[(row_num + 1) % num][(col_num + 1) % num] == 0) {
                row_num = (row_num + 1) % num;
                col_num = (col_num + 1) % num;
            }
            else {
                row_num = (row_num - 1 + num) % num;                
            }
            magic_square[row_num][col_num] = i;
        }

        // print the square
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (magic_square[i][j] < 10)  System.out.print(" ");   
                if (magic_square[i][j] < 100) System.out.print(" ");  
                System.out.print(magic_square[i][j] + " ");
            }
            System.out.println();
        }
	}

    public static void main(String[] args) { 
	
	    Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        generateSquare(num);
        sc.close();

    }
}


//------------ Test Cases -----------

//TestCase1:
/*Input a number: 15
106 123 140 157 174 191 208 225   2  19  36  53  70  87 104 
105 107 124 141 158 175 192 209 211   3  20  37  54  71  88 
 89  91 108 125 142 159 176 193 210 212   4  21  38  55  72 
 73  90  92 109 126 143 160 177 194 196 213   5  22  39  56 
 57  74  76  93 110 127 144 161 178 195 197 214   6  23  40 
 41  58  75  77  94 111 128 145 162 179 181 198 215   7  24 
 25  42  59  61  78  95 112 129 146 163 180 182 199 216   8 
  9  26  43  60  62  79  96 113 130 147 164 166 183 200 217 
218  10  27  44  46  63  80  97 114 131 148 165 167 184 201 
202 219  11  28  45  47  64  81  98 115 132 149 151 168 185 
186 203 220  12  29  31  48  65  82  99 116 133 150 152 169 
170 187 204 221  13  30  32  49  66  83 100 117 134 136 153 
154 171 188 205 222  14  16  33  50  67  84 101 118 135 137 
138 155 172 189 206 223  15  17  34  51  68  85 102 119 121 
122 139 156 173 190 207 224   1  18  35  52  69  86 103 120 
*/


//TestCase2: 
/*Input a number: 12
Input number must be odd and >0*/

//TestCase3: 
/*Input a number: 9
 37  48  59  70  81   2  13  24  35 
 36  38  49  60  71  73   3  14  25 
 26  28  39  50  61  72  74   4  15 
 16  27  29  40  51  62  64  75   5 
  6  17  19  30  41  52  63  65  76 
 77   7  18  20  31  42  53  55  66 
 67  78   8  10  21  32  43  54  56 
 57  68  79   9  11  22  33  44  46 
 47  58  69  80   1  12  23  34  45 
*/