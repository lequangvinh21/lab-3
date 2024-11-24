package ti_do;

public class TestPassingParameter {
    public static void main(String[] args) {
        // Tạo hai đối tượng DigitalVideoDisc
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // In ra tiêu đề ban đầu
        System.out.println("Before swap:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Gọi phương thức swap
        swap(jungleDVD, cinderellaDVD);

        // Kiểm tra kết quả sau khi gọi swap
        System.out.println("After swap:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Gọi phương thức changeTitle
        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        // Kiểm tra kết quả sau khi gọi changeTitle
        System.out.println("After changeTitle:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());
    }

    // Phương thức swap (không thay đổi thực sự)
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc temp = dvd1;
        dvd1 = dvd2;
        dvd2 = temp;
    }

    // Phương thức thay đổi tiêu đề
    public static void changeTitle(DigitalVideoDisc dvd, String newTitle) {
        dvd.setTitle(newTitle);
    }
}
