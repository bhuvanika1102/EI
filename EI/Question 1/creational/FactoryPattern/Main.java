// Main.java
public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.createDocument("word");
        wordDoc.open();

        Document pdfDoc = DocumentFactory.createDocument("pdf");
        pdfDoc.open();

        Document excelDoc = DocumentFactory.createDocument("excel");
        excelDoc.open();
    }
}
