class Demo5{
    public static void main(String[] args) {    
        Bij bij = new Bij();
        Bij bij2 = new Bij("zoem");
        System.out.println(bij.jib);
        System.out.println(bij2.jib);
    }
}
class Bij{
    static Bij bij;
    String jib;
    Bij(String bij){
        jib = bij;
    }
    Bij Bij() {
        return null;
    }
}