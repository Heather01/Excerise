package LoginDetails;

public class Login {

    private String name;
    private String passwd;
    private String expectedPasswd;
    private String expectedName;

    public Login(String userName, String password) {
        expectedName = "brian";
        expectedPasswd = "spam";
        name = userName;
        passwd = password;
    }


    public void attempt() {
        if (name.equals(expectedName) && passwd.equals(expectedPasswd)){
            System.out.println("Welcome Brian!");
        }
        else {
            System.out.println("Incorrect please try again");
        }
    }
}
