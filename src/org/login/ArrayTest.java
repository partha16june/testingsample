package org.login;

public class ArrayTest {
public static void main(String[] args) {
	int num[][][]=new int [3][3][3];
	num[0][0][0]=10;
	num[0][0][1]=20;
	num[0][0][2]=30;
	num[0][1][0]=40;
	num[0][1][1]=50;
	num[0][1][2]=60;
	num[0][2][0]=70;
	num[0][2][1]=80;
	num[0][2][2]=90;
	num[1][0][0]=100;
	num[1][0][1]=110;
	num[1][0][2]=120;
	num[1][1][0]=130;
	num[1][1][1]=140;
	num[1][1][2]=150;
	num[1][2][0]=160;
	num[1][2][1]=170;
	num[1][2][2]=180;
	num[2][0][0]=190;
	num[2][0][1]=200;
	num[2][0][2]=210;
	num[2][1][0]=220;
	num[2][1][1]=230;
	num[2][1][2]=240;
	num[2][2][0]=250;
	num[2][2][1]=260;
	num[2][2][2]=270;
	
for (int[][] x : num) {
	for (int[] y : x) {
		for (int i : y) {
			System.out.println(i);
		}
		
	}
	
}

}
}
