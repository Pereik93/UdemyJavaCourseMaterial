/**
 * Created by perol on 03.06.2016.
 */

// Parts of code from src="http://stackoverflow.com/questions/3776327/how-to-define-custom-exception-class-in-java-the-easiest-way"
public class MyCheckedException extends Exception {

    public MyCheckedException(String exc)
    {
        super(exc);
    }

    public MyCheckedException(Throwable cause)
    {
        super(cause);
    }

    public String getMessage()
    {
        return super.getMessage();
    }

}

