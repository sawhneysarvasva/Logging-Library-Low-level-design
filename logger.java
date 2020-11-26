/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LoggerSystemDesign
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}
class Logging
{
    LoggingMessageHandler handler;
    Logging(Configuration configuration)
    {
        
    }
    void logMessage(LogMessage message)
    {
        
    }
}
abstract class LoggingMessageHandler
{
    LoggingMessageHandler next;
    LoggingMessagePrinter printer;
    
    abstract void handleMessage(loggingMessage message);
}
class InfoMessageHandler extends LoggingMessageHandler
{
    void handleMessage(LoggingMessage message);
}
class ErrorMessageHandler extends LoggingMessageHandler
{
      void handleMessage(LoggingMessage message);
}
interface ILoggingMessagePrinter
{
    printMessage(LoggingMessage message);
    
    
}

class FileLoggingMessagePrinter implements ILoggingMessagePrinter 
{
    String fileURL;
    printMessage(LoggingMessage loggingMessage);
}
class ConsoleLoggingMessagePrinter implements ILoggingMessagePrinter
{
    printMessage(LoggingMessage loggingMessage);
}

