package javax.jms;

/**
 * <P> This exception is thrown when a method is 
 *     invoked at an illegal or inappropriate time or if the provider is 
 *     not in an appropriate state for the requested operation. For example, 
 *     this exception must be thrown if <CODE>Session.commit</CODE> is 
 *     called on a non-transacted session. This exception is also called when
 *     a domain inappropriate method is called, such as calling 
 *     <CODE>TopicSession.CreateQueueBrowser</CODE>.
 **/

public class IllegalStateException extends JMSException
{
   private static final long serialVersionUID = -6850763061112244487L;

   /** Constructs an <CODE>IllegalStateException</CODE> with the specified reason
    *  and error code.
    *
    *  @param  reason        a description of the exception
    *  @param  errorCode     a string specifying the vendor-specific
    *                        error code
    *                        
    **/
   public IllegalStateException(String reason, String errorCode)
   {
      super(reason, errorCode);
   }

   /** Constructs an <CODE>IllegalStateException</CODE> with the specified 
    *  reason. The error code defaults to null.
    *
    *  @param  reason        a description of the exception
    **/
   public IllegalStateException(String reason)
   {
      super(reason);
   }

}
