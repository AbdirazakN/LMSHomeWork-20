public class Main {
    public static void main(String[] args) throws InvalidInformationException {

        //Параллелепипедтин площадь жана объёмун эсептеген бир программа жазабыз.
        // Фигуранын параметрлерин(длина, ширина, высота) берип жатканда туура эмес маалымат
        // берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
        //        Мумкун болгон каталар:
        //       1) берилген маалымат терс сан болсо
        //       2) берилген маалымат сан эмес тамга болсо
        //       3) берилген сандар 20 дан чон болсо
        //
        //- Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
        //- Фигуранын коломун эсептеген формула: (length*width*height);
        //-Формулалар Parallelepiped классында жазылуусу керек

            Parallelepiped parallelepiped = new Parallelepiped(10, 12, 15);
            try {
                parallelepiped.check();
                parallelepiped.figureArea();
                parallelepiped.figureVolume();

            } catch (InvalidInformationException e) {
                System.out.println(e.getMessage());
                System.out.println("Please write correctly!");
            }
    }
}