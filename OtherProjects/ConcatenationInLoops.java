package OtherProjects;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        int n = 100000; // Số lần nối chuỗi

        // Sử dụng + operator
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("Using + operator: " + (end - start) + " ms");

        // Sử dụng StringBuffer
        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Using StringBuffer: " + (end - start) + " ms");

        // Sử dụng StringBuilder
        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Using StringBuilder: " + (end - start) + " ms");
    }
}
