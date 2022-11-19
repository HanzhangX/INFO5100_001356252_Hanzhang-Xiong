package com.info5100;

import java.util.regex.Pattern;

public class main {
    public static final String SSN = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
    public static final String Zipcode = "^[0-9]{5}(-[0-9]{4})?$";
    public static final String Date = "^(0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])[-/.](19|20)?[0-9]{2}$";
    public static final String tel = "^[1][3578][0-9]{9}$";
    public static final String Statecode = "^(A[KLRZ]|C[AOT]|D[CE]|FL|GA|HI|I[ADLN]|K[SY]|LA|M[ADEINOST]|N[CDEHJMVY]|O[HKR]|PA|RI|S[CD]|T[NX]|UT|V[AT]|W[AIVY])$";

    public static void main(String[] args) {

        isSSN("012-11-1345");
        isSSN("02s-66-143d");

        isZipcode("01234-5678");
        isZipcode("1234a");


        isDate("01/02/2022");
        isDate("14/37/2022");


        isTel("13971886707");
        isTel("1652175854445");


        isStatecode("CA");
        isStatecode("BC");

    }

    private static void isSSN(String s) {
        if(Pattern.matches(SSN,s)){
            System.out.println(s + " is a SSN");
        }else{
            System.out.println(s + " is not a SSN");
        }
    }

    private static void isDate(String s) {
        if(Pattern.matches(Date,s)){
            System.out.println(s + " is a Date");
        }else{
            System.out.println(s + " is not a Date");
        }
    }

    private static void isStatecode(String s) {
        if(Pattern.matches(Statecode,s)){
            System.out.println(s + " is a Statecode");
        }else{
            System.out.println(s + " is not a Statecode");
        }
    }

    private static void isTel(String s) {
        if(Pattern.matches(tel,s)){
            System.out.println(s + " is a tel");
        }else{
            System.out.println(s + " is not a tel");
        }
    }

    private static void isZipcode(String str) {
        if(Pattern.matches(Zipcode,str)){
            System.out.println(str + " is a Zipcode");
        }else{
            System.out.println(str + " is not a Zipcode");
        }
    }


}
