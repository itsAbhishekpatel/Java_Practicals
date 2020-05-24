class Complex
{
   //intialized Complex no using Constructor. 
    int real,imag;
       Complex(int r,int i)
       {
          this.real=r;
          this.imag=i;
          
       }
       //Create method to add complex no.
       public static Complex sum(Complex c1,Complex c2)
       {

        Complex temp=new Complex(0,0);
        temp.real=c1.real+c2.real;
        temp.imag=c1.imag+c2.imag;
        return temp;

       }
       //create method to multiply complex no.
       public static Complex multiply(Complex c1, Complex c2){
          Complex temp1=new Complex(0,0);
          temp1.real=((c1.real*c2.real)-(c1.imag*c2.imag));
          temp1.imag=((c1.real*c2.imag)+(c1.imag*c2.real));
          return temp1;

       }
      //  use method toString to add real and imag value.
       public String toString()
       {
          return this.real+"+"+this.imag+"i";

       }

    public static void main(String [] args)
    {
       Complex c1=new Complex(2,3);
       Complex c2=new Complex(4,5);
       Complex temp=sum(c1,c2);
       Complex temp1=multiply(c1,c2);

       System.out.println("Sum of Complex No:"+temp);
       System.out.println("Multiplication of Complex No:"+temp1);


    }
}