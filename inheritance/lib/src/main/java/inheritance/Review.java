package inheritance;

public class Review {
    String body;
    String author;
    int stars;


    public Review( String body,String author, int stars) {
        this.body = body;
        this.author = author;
//        this.stars = stars;
        if(stars<0|| stars>5 ){
            this.stars = 0;
        }else{
            this.stars=stars;
        }
    }

    public  String toString (){
        return    ("Review body is " +body+ " his author "+ author+" with start " +stars );
    }
}
