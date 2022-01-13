package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Chooser welcome = new WelcomePage();
        Chooser newspage = new NewsPage();

        welcome.showPage();
        newspage.showPage();
    }
}
