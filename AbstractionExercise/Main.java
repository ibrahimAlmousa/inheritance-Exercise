package AbstractionExercise;

public class Main {
    public static void main(String[] args){
        Book b1 = new Book("Micro Controller ",500 ,"king khalid University");
        Movie m1 = new Movie("batman ",200 ,"US");

        System.out.println("the price is  "+b1.getPrice());

        System.out.println("the price is  "+b1.getDiscount());




        MovablePoint point = new MovablePoint(0, 0, 5, 3);

        point.moveUp();

        point.moveRight();

        point.moveDown();

        point.moveLeft();
    }
}
