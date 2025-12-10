package Loose_coupling;
class Dell_laptop  implements laptop{
    @Override
    public void display() {
        System.out.println("display from dell ");
    }

    @Override
    public void speaker() {
        System.out.println("speaker from dell");
    }

    @Override
    public void screen() {
        System.out.println("screen from dell");
    }
}
