package ti_do;

public class TestDigitalVideoDisc {
    public static void main(String[] args) {
        // Tạo các đối tượng DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Animation", 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avengers", "Action", "Joss Whedon", 19.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 24.99f);

        // In thông tin các DVD
        System.out.println("DVD 1: " + dvd1.getTitle() + " | ID: " + dvd1.getId());
        System.out.println("DVD 2: " + dvd2.getTitle() + " | ID: " + dvd2.getId());
        System.out.println("DVD 3: " + dvd3.getTitle() + " | ID: " + dvd3.getId());
        System.out.println("DVD 4: " + dvd4.getTitle() + " | ID: " + dvd4.getId());

        // In tổng số DVD đã tạo
        System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    }
}
