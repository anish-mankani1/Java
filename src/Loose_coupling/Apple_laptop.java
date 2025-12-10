package Loose_coupling;

class apple implements laptop
{

    @Override
    public void display() {
        System.out.println("display from apple");
    }

    @Override
    public void speaker() {
        System.out.println("speaker from apple");
    }

    @Override
    public void screen() {
        System.out.println("scren from apple");
    }
}
