public class ImagineDragons extends  Rock{
    private String styleSong;
    private int numberPerson;

    public String getStyleSong() {
        return styleSong;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public ImagineDragons(String styleSong, int numberPerson) {

        this.styleSong = styleSong;
        this.numberPerson = numberPerson;
    }

    @Override
    public void print() {
        System.out.println("Стиль песни: "+styleSong +"\nКоличество людей в группе: "+numberPerson);
    }
}
