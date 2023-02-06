package Homework;

public class Zadanie6 {

    public static int emailNo = 0;
    public static void main(String[] args) {

        NewAccount.createMultipleAccounts(3);
    }

    public static String generateEmail(){

        emailNo++;
        String email = "2021testemailaddress" + emailNo +"@test.pl";
        return email;
    }


}
