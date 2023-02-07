package tester.interfacePratice;

interface customerRaj
{
    int weight=7; // public+static+final

    void purchase();//public+abstract
}
class sellerRaju implements customerRaj
{
    @Override
    public void purchase() {
        //weight value cannot be changed in any case
        System.out.println("Weight of rice to be purchased by the Raj : "+weight);
    }
}
public class Check {
    public static void main(String[] args) {
        customerRaj c=new sellerRaju();
        c.purchase();
    }
}

