public class Password {
    public static void main(String[] args) {
        try {
            validatePasword("1456");
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение " + e.getMessage());
        }
        try {
            validatePasword("45896587");
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение " + e.getMessage());
        }
    }

    public static void validatePasword(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Пароль должен содержать не менее 8 символов ");
        }
        System.out.println("Пароль принят");
    }
}
