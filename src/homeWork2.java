public class homeWork2 {
    public static void main(String[] args) {
Printable[] printables={createObject("skillet"),createObject("imagineDragons"),createObject("neffex")};
        for (Printable print:printables) {
            print.print();
        }
    }

    public static Printable createObject(String classNAme) {
        switch (classNAme) {

            case "skillet":
                Skillet skillet = new Skillet(33, "Skillet");
                return skillet;
            case "imagineDragons":
                ImagineDragons imagineDragons = new ImagineDragons("Rock,Pop", 4);
                return imagineDragons;
            case "neffex":
                Neffex neffex = new Neffex("American", 23);
                return neffex;
        }
return null;
    }
}