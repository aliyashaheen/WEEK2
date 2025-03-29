interface Worker {
    void performDuties();
}

class Person2 {
    String name;
    int id;

    Person2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Duties: Cooking meals and managing kitchen.");
    }

    void displayRole() {
        System.out.println("Role: Chef");
        showPersonInfo();
        performDuties();
    }

    private void showPersonInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showPersonInfo'");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Duties: Serving customers and taking orders.");
    }

    void displayRole() {
        System.out.println("Role: Waiter");
        showPersonInfo();
        performDuties();
    }

    private void showPersonInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showPersonInfo'");
    }

    public static void main(String[] args) {
        Chef chef = new Chef("Ram", 101);
        Waiter waiter = new Waiter("Shyam", 202);

        chef.displayRole();
        System.out.println();
        waiter.displayRole();
    }
}
