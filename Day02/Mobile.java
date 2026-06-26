package Day02;

class Mobile {
    String band;
    double prices;

    Mobile(String band, double prices){
        this.band = band;
        this.prices = prices;

    }
    void call(){
        System.out.println("call in working");
    }
    
    public static void main(String[] args) {
        Mobile m = new Mobile(null, 0);
        System.out.println(m.band);
        System.out.println(m.prices);
        m.call();
    }
}