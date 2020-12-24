package spring_introduction;

public class Dog implements Pet{

//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    protected void init(){

        System.out.println("Class Dog: ini method");
    }

    private void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
