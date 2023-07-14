public class Class {
    private int nomber;
    private String word;
    private int[] array;

    public Class(int nomber, String word, int[] array) {
        this.nomber = nomber;
        this.word = word;
        this.array = array;
    }

    public int getNomber() {
        return nomber;
    }

    public void setNomber(int nomber) {
        this.nomber = nomber;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
