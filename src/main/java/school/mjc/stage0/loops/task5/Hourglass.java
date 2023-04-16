package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int dimension = (height * 2) - 1, space = 0, stars = height - 1, printed = 0;
        for (int i = 0; i < height/2; i++){
            for (int j = 0; j < height; j++){
                if (j < i  || j > height - i - 1){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(8);
            }
            System.out.print("\n");
        }
        for (int i = height/2 ; i < height; i++){
            for (int j = 0; j < height; j++){
                if (i < j  || height - i  - 1> j){
                    System.out.print(" ");
                    continue;
                }

                System.out.print(8);
            }
            System.out.print("\n");
        }
    }
}