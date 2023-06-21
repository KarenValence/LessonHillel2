public class Burgers {
    public static void main(String[] args) {
        burger burger1 = new burger();
        burger burger2 = new burger(true, true, true, true);
        burger burger3 = new burger(true, true, true, true, true);


    }
}
class burger{
    private boolean bun;
    private boolean meat;
    private boolean cheese;
    private boolean lettuce;
    private boolean mayonnaise;
    public burger() {
        this.bun = true;
        this.meat = true;
        this.cheese = true;
        this.lettuce = true;
        this.mayonnaise = true;
        System.out.println("Обычный бургер со следующими компонентами: булочка, мясо, сыр, зелень, майонез");

    }
    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = false;
        System.out.println("Диетический бургер со следующими компонентами: булочка, мясо, сыр, зелень, без майонеза");
    }
    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер с двойным мясом со следующими компонентами: булочка, два куска мяса, сыр, зелень, майонез");
    }
}