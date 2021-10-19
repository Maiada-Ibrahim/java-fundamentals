package inheritance;

public class Review {
   private String body;
   private String author;
   private int stars;
   private String watchedMove;
   private  String descrption;


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

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public Review(String body, String author, int stars, String watchedMove) {
        this.body = body;
        this.author = author;
      this.watchedMove=watchedMove;
        if(stars<0|| stars>5 ){
            this.stars = 0;
        }else{
            this.stars=stars;
        }
    }
    public Review( String body,String author,String descrption, int stars) {
        this.body = body;
        this.author = author;
        this.descrption=descrption;
        if(stars<0|| stars>5 ){
            this.stars = 0;
        }else{
            this.stars=stars;
        }
    }

    public String getWatchedMove() {
        return watchedMove;
    }

    public void setWatchedMove(String watchedMove) {
        this.watchedMove = watchedMove;
    }

    public  String toString (){
        if (watchedMove=="" || watchedMove==null){
            return    ("Review body is " +body+ " his author "+ author+" with start " +stars );

        }else
        return    ("Review body is " +body+ " his author "+ author+" with start " +stars + "i watched"+ watchedMove );
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
