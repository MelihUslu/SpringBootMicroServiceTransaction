package com.akis_yazilim.oracle.melih.transaction.utility;

public final class Util
{
    private Util() {}

    public static String createGeneralException(Exception e)
    {
        return e.getClass().getSimpleName()
                + " is occured. Error message: " + e.getMessage();
    }

    public static void showExceptionMessage(Exception e)
    {
        System.err.println( createGeneralException(e) );
    }
}
