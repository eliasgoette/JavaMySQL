public class Login{
    private static boolean loggedIn = false;

    public static void login(String username, String inputPassword){
        int inputPasswordHash = createHash(inputPassword);
        int passwordDBHash = getHashFromDB(username);

        if(inputPasswordHash == passwordDBHash){
            loggedIn = true;
            System.out.println("Logged in successfully");
        } else{
            loggedIn = false;
            System.out.println("Password and username don't mach");
        }
    }

    private static int getHashFromDB(String username){
        int hash = Integer.parseInt(Database.selectWhere("users", "username == " + username));
        return hash;
    }

    private static int createHash(String input){
        int hash;
        int hash_raw = input.hashCode();
        hash = hash_raw * 129842227 + 532119 * 1000;
        System.out.println(hash);
        return hash;
    }
}