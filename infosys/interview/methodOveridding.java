class methodOveridding {

    // Mark inner classes static so main() can instantiate them directly
    static class vehicle {
        void wheels() {
            System.out.print("vehicle has four wheels");
        }
    }

    static class truck extends vehicle {
        @Override 
        void wheels() {
            System.out.print("truck has 16 wheels");
        }
    }

    public static void main(String args[]) {
        vehicle v = new truck(); // Polymorphic call
        v.wheels();
    }
}