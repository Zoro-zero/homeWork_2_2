public class Skillet extends Rock {
    int songNumber;
    String nameGroup;
    public Skillet(int songNumber, String nameGroup) {
        this.songNumber = songNumber;
        this.nameGroup = nameGroup;
    }
    public String getNameGroup() {
        return nameGroup;
    }

    public int getSongNumber() {
        return songNumber;
    }

    @Override
    public void print() {

        System.out.println("Количество песен: "+songNumber +" \nНазвание группы: "+nameGroup);
    }
}
