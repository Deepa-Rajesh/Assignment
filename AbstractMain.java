abstract class AbstractMain {
    public abstract void denominations();
}
class SbiBank extends AbstractMain{
    public void denominations(){
        System.out.println("Available denomination in SBI: 2000, 500, 200" );
    }
}
class IciciBank extends AbstractMain{
    public void denominations(){
        System.out.println("Available denomination in ICICI: 2000, 1000, 200" );
    }
}
class HdfcBank{
    public void denominations(){
        System.out.println("Available denomination in HDFC: 500, 200, 100" );
    }
}
class Main {
    public static void main(String[] args) {
        SbiBank sb = new SbiBank();
        sb.denominations();
        IciciBank ic = new IciciBank();
        ic.denominations();
        HdfcBank hd = new HdfcBank();
        hd.denominations();
    }
}