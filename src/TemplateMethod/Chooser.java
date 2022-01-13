package TemplateMethod;

public abstract class Chooser {
    public void showPage(){
        System.out.println("header");
        choosePage();
        System.out.println("footer");
    }
    public abstract void choosePage();
}
