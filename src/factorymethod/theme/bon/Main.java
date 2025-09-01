package factorymethod.theme.bon;

public class Main {
    static String theme;

    public static void main(String[] args) {
        if (theme.equalsIgnoreCase("clair")) {
            FenetreChat fenetreChat = new FenetreChatClaire();
        } else {
            FenetreChat fenetreChat = new FenetreChatSombre();
        }
    }
}
