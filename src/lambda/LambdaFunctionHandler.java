package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<RequestClass, String> {

    @Override
    public String handleRequest(RequestClass input, Context context) {
        final LambdaLogger logger = context.getLogger();
    	if(input != null){
    		logger.log("First:"+input.getFirstName());
    		logger.log("Last:"+input.getLastName());
    		logger.log("Age:"+input.getAge());
    	}
        return "Success";
    }

}
