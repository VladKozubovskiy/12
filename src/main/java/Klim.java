import java.util.Locale;

public class Klim {
    public static void main(String[] args) {
        String text1 = "Hello World";
        String text2 = "    Java Automation    ";
        String text3 = "Hello World";
        String firstName1 = "Alex";
        String firstName2 = "Smith";
        String str1 = "Hello";
        String str2 = "World";
        String message = "Order number 555 has been created";
        String fileName = "report.xlsx";
        String text4 = "Java Automation";
        String text5 = "Java Automation Engineer";
        String password = "Java12345";
        String login1 = "Admin";
        String login2 = "admin";
        String text = "   JAVA automation TEST   ";
        System.out.println(text1.charAt(4));
        System.out.println(text2.trim());
        System.out.println(text2);
        System.out.println(text3.replace('l', 'L'));
        System.out.println(String.join("", firstName1, firstName2));
        System.out.println(String.join(" ", firstName1, firstName2));
        System.out.println(str1.compareTo(str2));
        System.out.println(message.contains("5"));
        System.out.println(message.contains("999"));
        System.out.println(fileName.endsWith("xlsx"));
        System.out.println(fileName.endsWith("pdf"));
        System.out.println(text4.substring(0, 4));
        System.out.println(text4.substring(5));
        System.out.println(text5.toLowerCase());
        System.out.println(text5.toUpperCase());
        System.out.println(password.length());
        System.out.println(login1.equalsIgnoreCase(login2));
        text = text.trim();
        text = text.toLowerCase();
        text.replace("java", "python");
        System.out.println(text);
        System.out.println(text.contains("python"));
        System.out.println(text.length());
    }
}
