class PowerOfFour1 {
    public double logn(int n, int r){
        return Math.log(n)/Math.log(r);
    }
    public boolean isPowerOfFour(int num) {
        if(num == 0)
            return false;
        return(Math.floor(logn(num,4)))==Math.ceil(logn(num,4));
    }
    public static void main(String args[]){
	PowerOfFour1 p = new PowerOfFour1();
	System.out.println("16 is "+p.isPowerOfFour(16));
	System.out.println("8 is "+p.isPowerOfFour(8));
}
}