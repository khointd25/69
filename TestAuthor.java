public class TestAuthor {
    public static void main(String[] args) {
        Author au1 = new Author("khoi","khointd.25ceb@vku.udn.vn", 'M');
        System.out.println( au1.toString());

        Book b1 = new Book("java",au1, 100.0);
        System.out.println(b1.toString());
    }
}