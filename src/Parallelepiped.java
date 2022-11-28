import java.util.concurrent.CompletionException;

public class Parallelepiped {

    //Параллелепипедтин площадь жана объёмун эсептеген бир программа жазабыз.
    // Фигуранын параметрлерин(длина, ширина, высота) берип жатканда туура эмес маалымат
    // берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
    //        Мумкун болгон каталар:
    //       1) берилген маалымат терс сан болсо
    //       2) берилген маалымат сан эмес тамга болсо
    //       3) берилген сандар 20 дан чон болсо
    //
    //
    //- Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
    //- Фигуранын коломун эсептеген формула: (length*width*height);
    //-Формулалар Parallelepiped классында жазылуусу керек

    private int length;
    private int width;
    private int height;

    public Parallelepiped(int length, int width, int height) throws InvalidInformationException {
        this.length = length;
        this.width = width;
        this.height = height;
    }



    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void figureArea(){
        System.out.println("Area of:  "+2 * ((getHeight() * getLength()) + (getLength() * getWidth()) + (getHeight() * getWidth())));
    }
    public void figureVolume(){
        System.out.println("Volume of:  "+(getLength() * getWidth() * getHeight()));
    }

    public void check() throws InvalidInformationException {
        if (length > 0 && length < 20 && width > 0 && width < 20 && height > 0 && height < 20) {
            System.out.println("That's all right!");
        } else {
            throw new InvalidInformationException("Invalid Information Exception!");
        }
    }
}
