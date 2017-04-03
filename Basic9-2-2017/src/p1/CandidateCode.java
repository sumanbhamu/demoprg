package p1;

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode {
	
    public static int GetJumpCount(int input1,int input2,int[] input3)
    
    {
    	int temp=input1;
    	for(int i=0;i<10;i++){
    		if(input1==input3[i]){
    			return 1;	
        	}
    		else if(input1<input3[i]){
    			input1=input1-input2;
    			input1=temp+input1;
    			
    			
    		}
    	}
    	
		return input1;
	    //Write code here

    	    
    }

	public static void main(String args[])throws IOException{
	Scanner in = new Scanner(System.in);
    int output = 0;
    int ip1 = Integer.parseInt(in.nextLine().trim());
    int ip2 = Integer.parseInt(in.nextLine().trim());
    int ip3_size = 0;
    ip3_size = Integer.parseInt(in.nextLine().trim());
    int[] ip3 = new int[ip3_size];
    int ip3_item;
    for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
        ip3_item = Integer.parseInt(in.nextLine().trim());
        ip3[ip3_i] = ip3_item;
    }
    output = GetJumpCount(ip1,ip2,ip3);
    System.out.println(String.valueOf(output));

}}
