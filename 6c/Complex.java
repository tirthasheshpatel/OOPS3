import java.util.*;

class Complex
{
    private double re;
    private double im;

    Complex()
    {
        this.re = 0.;
        this.im = 0.;
    }
    Complex(double real, double imaginary)
    {
        this.re = real;
        this.im = imaginary;
    }

    public void setReal(double real)
    {
        this.re = real;
    }

    public void setImaginary(double imaginary)
    {
        this.im = imaginary;
    }

    public double getReal()
    {
        return this.re;
    }

    public double getImaginary()
    {
        return this.im;
    }

    public Complex add(Complex c)
    {
        double new_re = this.re + c.re;
        double new_im = this.im + c.im;
        Complex new_complex = new Complex(new_re, new_im);
        return new_complex;
    }

    public Complex sub(Complex c)
    {
        double new_re = this.re - c.re;
        double new_im = this.im - c.im;
        Complex new_complex = new Complex(new_re, new_im);
        return new_complex;
    }

    public String display()
    {
        return (this.re + " + " + this.im + "i");
    }

    public static void main(String[] args) {
        Complex a = new Complex(3,4);
        Complex b = new Complex(4,5);
        Complex c = a.add(b); // a + b
        Complex d = b.sub(a); // b - a
        System.out.println("a: " + a.display());
        System.out.println("b: " + b.display());
        System.out.println("c: " + c.display());
        System.out.println("d: " + d.display());
    }
}