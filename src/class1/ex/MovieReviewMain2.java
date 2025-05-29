package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview moviereview1;
        
        // 첫 번째 영화 리뷰 정보 입력
        moviereview1 = new MovieReview();
        moviereview1.title = "인셉션";
        moviereview1.review = "인생은 무한 루프";

        // 두 번째 영화 리뷰 정보 입력
        MovieReview moviereview2;
        moviereview2 = new MovieReview();
        moviereview2.title = "어바웃 타임";
        moviereview2.review = "인생 시간 영화!";

        // 영화 리뷰 정보 출력
        MovieReview[] moviereviews = new MovieReview[]{moviereview1, moviereview2};

        for(int i = 0; i < moviereviews.length; i++){
            System.out.println("영화 제목 : " + moviereviews[i].title + " 리뷰 : " + moviereviews[i].review);
        }
    }

}
