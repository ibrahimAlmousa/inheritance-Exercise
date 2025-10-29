package AbstractionExercise;

public class Book extends Product {
    private String auther ;

    public Book(){

    }

    public Book(String name , double price , String auther  ){
        super(name , price);
        this.auther=auther ;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public double getDiscount(){
        return super.getPrice() - 0.15 *super.getPrice() ;
    }


}
