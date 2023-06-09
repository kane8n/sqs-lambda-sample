/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sqs.lambda.sample;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;

public class Handler implements RequestHandler<SQSEvent, Void> {
    @Override
    public Void handleRequest(SQSEvent event, Context context) {
        System.out.println("new version: 0518 11:41");
        System.out.println(new String(context.getFunctionVersion()));
        System.out.println(new String(context.getInvokedFunctionArn()));
        for (SQSMessage msg : event.getRecords()) {
            System.out.println(new String(msg.getBody()));
        }
        return null;
    }
}
