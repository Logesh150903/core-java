package demo1;
class MovieException1 extends Exception{
	public MovieException1(String msg) {
		super(msg);
	}
}
public class MovieCustomException {
 String checkAgeForMovie(int age) throws MovieException1 {
	 if(age<18) {
		 throw new MovieException1("Invalid age for movie");
	 }
	 return "valid age for movie......Welcome!!!!!!!!";
 }
	public static void main(String[] args) {
		MovieCustomException m=new MovieCustomException();
		String result;
		try {
			result=m.checkAgeForMovie(1);
			System.out.println(result);
		} catch (MovieException1 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
