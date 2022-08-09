public class Neffex extends Rock{
     private String from;
    private  int founded;

    public String getFrom() {
        return from;
    }

    public int getFounded() {
        return founded;
    }

    public Neffex(String from, int founded) {

        this.from = from;
        this.founded = founded;
    }

    @Override
    public void print() {
        System.out.println("Откуда они родом: "+from + "\nКогда был основан: "+founded);
    }
}
