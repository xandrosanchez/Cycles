public class Main {
    public static void main(String[] args) {

        //Первое задание

        int i = 0;

        while (i < 10){
            i++;
            System.out.println(i);
        }

        for(i = 10; i >= 1; i-- ){
            System.out.println(i);
        }

        //Второе задание

        for (int friday = 7; friday <= 31; friday = friday + 7){
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Третье задание

        int g = 2122;
        int z = 1822;

        for (int k = 0; k < g; k = k + 79){
            if(k >= z){
                System.out.println(k);
            }
        }
    }
}