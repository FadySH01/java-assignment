package Java.Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
    private String Username;
    private String email;
    private long mobile;
    private int age;

    public User(String username, String email, long mobile, int age) {
        Username = username;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public long getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return Username;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", age=" + age +
                '}';
    }
}

class Main{
        public static void main (String[]args){
        List<User> users = new ArrayList<>();

        //FIXED: mobile number treated as long (add L)
            users.add(new User("the_Seer_'  /.", "seer@gmail.com", 9345682189L, 23));
            users.add(new User("alice!@#", "alice@example.com", 9832174721L, 25));
            users.add(new User("bob_456", "bob@example.com", 7865432678L, 28));
            users.add(new User("abhinav", "abhinav@example.com", 6543218754L, 22));

                    //Predicate for username validation
            Predicate<User> isValidUsername = user -> user.getUsername().matches("[a-zA-Z0-9_]+")
            && user.getUsername().length() >= 6;

            List<User> validUsers = filterUsers(users, isValidUsername);

            System.out.println("Valid Users:");
            validUsers.forEach(System.out::println);
    }

    private static List<User> filterUsers(List<User> users, Predicate<User> predicate){
            List<User> filteredList = new ArrayList<>();
            for(User user: users){
                if(predicate.test(user)){
                    filteredList.add(user);
                }
            }
            return filteredList;
    }
    }


